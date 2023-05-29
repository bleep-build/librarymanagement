/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
final class ModuleDescriptorConfiguration private (
  validate: Boolean,
  scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo],
  val module: bleep.nosbt.librarymanagement.ModuleID,
  val moduleInfo: bleep.nosbt.librarymanagement.ModuleInfo,
  val dependencies: Vector[bleep.nosbt.librarymanagement.ModuleID],
  val overrides: Vector[bleep.nosbt.librarymanagement.ModuleID],
  val excludes: Vector[bleep.nosbt.librarymanagement.InclExclRule],
  val ivyXML: scala.xml.NodeSeq,
  val configurations: Vector[bleep.nosbt.librarymanagement.Configuration],
  val defaultConfiguration: Option[bleep.nosbt.librarymanagement.Configuration],
  val conflictManager: bleep.nosbt.librarymanagement.ConflictManager) extends bleep.nosbt.librarymanagement.ModuleSettings(validate, scalaModuleInfo) with Serializable {
  
  private def this(module: bleep.nosbt.librarymanagement.ModuleID, moduleInfo: bleep.nosbt.librarymanagement.ModuleInfo) = this(false, None, module, moduleInfo, Vector.empty, Vector.empty, Vector.empty, scala.xml.NodeSeq.Empty, bleep.nosbt.librarymanagement.Configurations.default, Option(bleep.nosbt.librarymanagement.Configurations.Compile), bleep.nosbt.librarymanagement.ConflictManager.default)
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: ModuleDescriptorConfiguration => (this.validate == x.validate) && (this.scalaModuleInfo == x.scalaModuleInfo) && (this.module == x.module) && (this.moduleInfo == x.moduleInfo) && (this.dependencies == x.dependencies) && (this.overrides == x.overrides) && (this.excludes == x.excludes) && (this.ivyXML == x.ivyXML) && (this.configurations == x.configurations) && (this.defaultConfiguration == x.defaultConfiguration) && (this.conflictManager == x.conflictManager)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.ModuleDescriptorConfiguration".##) + validate.##) + scalaModuleInfo.##) + module.##) + moduleInfo.##) + dependencies.##) + overrides.##) + excludes.##) + ivyXML.##) + configurations.##) + defaultConfiguration.##) + conflictManager.##)
  }
  override def toString: String = {
    "ModuleDescriptorConfiguration(" + validate + ", " + scalaModuleInfo + ", " + module + ", " + moduleInfo + ", " + dependencies + ", " + overrides + ", " + excludes + ", " + ivyXML + ", " + configurations + ", " + defaultConfiguration + ", " + conflictManager + ")"
  }
  private[this] def copy(validate: Boolean = validate, scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo] = scalaModuleInfo, module: bleep.nosbt.librarymanagement.ModuleID = module, moduleInfo: bleep.nosbt.librarymanagement.ModuleInfo = moduleInfo, dependencies: Vector[bleep.nosbt.librarymanagement.ModuleID] = dependencies, overrides: Vector[bleep.nosbt.librarymanagement.ModuleID] = overrides, excludes: Vector[bleep.nosbt.librarymanagement.InclExclRule] = excludes, ivyXML: scala.xml.NodeSeq = ivyXML, configurations: Vector[bleep.nosbt.librarymanagement.Configuration] = configurations, defaultConfiguration: Option[bleep.nosbt.librarymanagement.Configuration] = defaultConfiguration, conflictManager: bleep.nosbt.librarymanagement.ConflictManager = conflictManager): ModuleDescriptorConfiguration = {
    new ModuleDescriptorConfiguration(validate, scalaModuleInfo, module, moduleInfo, dependencies, overrides, excludes, ivyXML, configurations, defaultConfiguration, conflictManager)
  }
  def withValidate(validate: Boolean): ModuleDescriptorConfiguration = {
    copy(validate = validate)
  }
  def withScalaModuleInfo(scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo]): ModuleDescriptorConfiguration = {
    copy(scalaModuleInfo = scalaModuleInfo)
  }
  def withScalaModuleInfo(scalaModuleInfo: bleep.nosbt.librarymanagement.ScalaModuleInfo): ModuleDescriptorConfiguration = {
    copy(scalaModuleInfo = Option(scalaModuleInfo))
  }
  def withModule(module: bleep.nosbt.librarymanagement.ModuleID): ModuleDescriptorConfiguration = {
    copy(module = module)
  }
  def withModuleInfo(moduleInfo: bleep.nosbt.librarymanagement.ModuleInfo): ModuleDescriptorConfiguration = {
    copy(moduleInfo = moduleInfo)
  }
  def withDependencies(dependencies: Vector[bleep.nosbt.librarymanagement.ModuleID]): ModuleDescriptorConfiguration = {
    copy(dependencies = dependencies)
  }
  def withOverrides(overrides: Vector[bleep.nosbt.librarymanagement.ModuleID]): ModuleDescriptorConfiguration = {
    copy(overrides = overrides)
  }
  def withExcludes(excludes: Vector[bleep.nosbt.librarymanagement.InclExclRule]): ModuleDescriptorConfiguration = {
    copy(excludes = excludes)
  }
  def withIvyXML(ivyXML: scala.xml.NodeSeq): ModuleDescriptorConfiguration = {
    copy(ivyXML = ivyXML)
  }
  def withConfigurations(configurations: Vector[bleep.nosbt.librarymanagement.Configuration]): ModuleDescriptorConfiguration = {
    copy(configurations = configurations)
  }
  def withDefaultConfiguration(defaultConfiguration: Option[bleep.nosbt.librarymanagement.Configuration]): ModuleDescriptorConfiguration = {
    copy(defaultConfiguration = defaultConfiguration)
  }
  def withDefaultConfiguration(defaultConfiguration: bleep.nosbt.librarymanagement.Configuration): ModuleDescriptorConfiguration = {
    copy(defaultConfiguration = Option(defaultConfiguration))
  }
  def withConflictManager(conflictManager: bleep.nosbt.librarymanagement.ConflictManager): ModuleDescriptorConfiguration = {
    copy(conflictManager = conflictManager)
  }
}
object ModuleDescriptorConfiguration extends bleep.nosbt.librarymanagement.InlineConfigurationFunctions {
  
  def apply(module: bleep.nosbt.librarymanagement.ModuleID, moduleInfo: bleep.nosbt.librarymanagement.ModuleInfo): ModuleDescriptorConfiguration = new ModuleDescriptorConfiguration(module, moduleInfo)
  def apply(validate: Boolean, scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo], module: bleep.nosbt.librarymanagement.ModuleID, moduleInfo: bleep.nosbt.librarymanagement.ModuleInfo, dependencies: Vector[bleep.nosbt.librarymanagement.ModuleID], overrides: Vector[bleep.nosbt.librarymanagement.ModuleID], excludes: Vector[bleep.nosbt.librarymanagement.InclExclRule], ivyXML: scala.xml.NodeSeq, configurations: Vector[bleep.nosbt.librarymanagement.Configuration], defaultConfiguration: Option[bleep.nosbt.librarymanagement.Configuration], conflictManager: bleep.nosbt.librarymanagement.ConflictManager): ModuleDescriptorConfiguration = new ModuleDescriptorConfiguration(validate, scalaModuleInfo, module, moduleInfo, dependencies, overrides, excludes, ivyXML, configurations, defaultConfiguration, conflictManager)
  def apply(validate: Boolean, scalaModuleInfo: bleep.nosbt.librarymanagement.ScalaModuleInfo, module: bleep.nosbt.librarymanagement.ModuleID, moduleInfo: bleep.nosbt.librarymanagement.ModuleInfo, dependencies: Vector[bleep.nosbt.librarymanagement.ModuleID], overrides: Vector[bleep.nosbt.librarymanagement.ModuleID], excludes: Vector[bleep.nosbt.librarymanagement.InclExclRule], ivyXML: scala.xml.NodeSeq, configurations: Vector[bleep.nosbt.librarymanagement.Configuration], defaultConfiguration: bleep.nosbt.librarymanagement.Configuration, conflictManager: bleep.nosbt.librarymanagement.ConflictManager): ModuleDescriptorConfiguration = new ModuleDescriptorConfiguration(validate, Option(scalaModuleInfo), module, moduleInfo, dependencies, overrides, excludes, ivyXML, configurations, Option(defaultConfiguration), conflictManager)
}
