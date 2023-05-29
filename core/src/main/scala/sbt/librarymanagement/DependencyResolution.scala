package bleep.nosbt.librarymanagement

import java.io.File
import bleep.nosbt.util.Logger
import bleep.nosbt.io.Hash

/**
 * Library management API to resolve dependencies.
 */
class DependencyResolution private[nosbt] (lmEngine: DependencyResolutionInterface) {
  import bleep.nosbt.internal.librarymanagement.InternalDefaults._

  /**
   * Builds a ModuleDescriptor that describes a subproject with dependencies.
   *
   * @param moduleSetting It contains the information about the module including the dependencies.
   * @return A `ModuleDescriptor` describing a subproject and its dependencies.
   */
  def moduleDescriptor(moduleSetting: ModuleDescriptorConfiguration): ModuleDescriptor =
    lmEngine.moduleDescriptor(moduleSetting)

  /**
   * Build a ModuleDescriptor that describes a subproject with dependencies.
   *
   * @param moduleId The root module for which to create a `ModuleDescriptor`.
   * @param directDependencies The direct dependencies of the module.
   * @param scalaModuleInfo The information about the Scala version used, if any.
   * @param configurations The configurations that this module has.
   * @return A `ModuleDescriptor` describing a subproject and its dependencies.
   */
  def moduleDescriptor(
      moduleId: ModuleID,
      directDependencies: Vector[ModuleID],
      scalaModuleInfo: Option[ScalaModuleInfo]
  ): ModuleDescriptor = {
    val moduleSetting = ModuleDescriptorConfiguration(moduleId, ModuleInfo(moduleId.name))
      .withScalaModuleInfo(scalaModuleInfo)
      .withDependencies(directDependencies)
    moduleDescriptor(moduleSetting)
  }

  /**
   * Resolves the given module's dependencies performing a retrieval.
   *
   * @param module The module to be resolved.
   * @param configuration The update configuration.
   * @param uwconfig The configuration to handle unresolved warnings.
   * @param log The logger.
   * @return The result, either an unresolved warning or an update report. Note that this
   *         update report will or will not be successful depending on the `missingOk` option.
   */
  def update(
      module: ModuleDescriptor,
      configuration: UpdateConfiguration,
      uwconfig: UnresolvedWarningConfiguration,
      log: Logger
  ): Either[UnresolvedWarning, UpdateReport] =
    lmEngine.update(module, configuration, uwconfig, log)

  /**
   * Returns a `ModuleDescriptor` that depends on `dependencyId`.
   *
   * @param dependencyId The module to depend on.
   * @return A `ModuleDescriptor` that depends on `dependencyId`.
   */
  def wrapDependencyInModule(dependencyId: ModuleID): ModuleDescriptor =
    wrapDependencyInModule(dependencyId, None)

  /**
   * Returns a `ModuleDescriptor` that depends on `dependencyId`.
   *
   * @param dependencyId The module to depend on.
   * @param scalaModuleInfo The information about the Scala verson used, if any.
   * @return A `ModuleDescriptor` that depends on `dependencyId`.
   */
  def wrapDependencyInModule(
      dependencyId: ModuleID,
      scalaModuleInfo: Option[ScalaModuleInfo]
  ): ModuleDescriptor = {
    val sha1 = Hash.toHex(Hash(dependencyId.name))
    val dummyID = ModuleID("org.sbt.temp", modulePrefixTemp + sha1, dependencyId.revision)
      .withConfigurations(dependencyId.configurations)
    moduleDescriptor(dummyID, Vector(dependencyId), scalaModuleInfo)
  }

  /**
   * Resolves the given dependency, and retrieves the artifacts to a directory.
   *
   * @param dependencyId The dependency to be resolved.
   * @param scalaModuleInfo The module info about Scala.
   * @param retrieveDirectory The directory to retrieve the files.
   * @param log The logger.
   * @return The result, either an unresolved warning or a sequence of files.
   */
  def retrieve(
      dependencyId: ModuleID,
      scalaModuleInfo: Option[ScalaModuleInfo],
      retrieveDirectory: File,
      log: Logger
  ): Either[UnresolvedWarning, Vector[File]] =
    retrieve(wrapDependencyInModule(dependencyId, scalaModuleInfo), retrieveDirectory, log)

  /**
   * Resolves the given module's dependencies, and retrieves the artifacts to a directory.
   *
   * @param module The module to be resolved.
   * @param retrieveDirectory The directory to retrieve the files.
   * @param log The logger.
   * @return The result, either an unresolved warning or a sequence of files.
   */
  def retrieve(
      module: ModuleDescriptor,
      retrieveDirectory: File,
      log: Logger
  ): Either[UnresolvedWarning, Vector[File]] = {
    // Using the default artifact type filter here, so sources and docs are excluded.
    val retrieveConfiguration = RetrieveConfiguration()
      .withRetrieveDirectory(retrieveDirectory)
    val updateConfiguration = UpdateConfiguration()
      .withRetrieveManaged(retrieveConfiguration)
    // .withMissingOk(true)
    log.debug(s"Attempting to fetch ${directDependenciesNames(module)}. This operation may fail.")
    update(
      module,
      updateConfiguration,
      UnresolvedWarningConfiguration(),
      log
    ) match {
      case Left(unresolvedWarning) => Left(unresolvedWarning)
      case Right(updateReport) =>
        val allFiles =
          for {
            conf <- updateReport.configurations
            m <- conf.modules
            (_, f) <- m.artifacts
          } yield f
        log.debug(s"Files retrieved for ${directDependenciesNames(module)}:")
        log.debug(allFiles mkString ", ")
        // allFiles filter predicate match {
        //   case Seq() => None
        //   case files => Some(files)
        // }
        Right(allFiles)
    }
  }

  protected def directDependenciesNames(module: ModuleDescriptor): String =
    (module.directDependencies map {
      case mID: ModuleID =>
        import mID._
        s"$organization % $name % $revision"
    }).mkString(", ")
}

object DependencyResolution {
  def apply(lmEngine: DependencyResolutionInterface): DependencyResolution =
    new DependencyResolution(lmEngine)
}
