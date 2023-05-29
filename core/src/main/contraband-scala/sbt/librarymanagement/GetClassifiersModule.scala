/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
final class GetClassifiersModule private (
  val id: bleep.nosbt.librarymanagement.ModuleID,
  val scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo],
  val dependencies: Vector[bleep.nosbt.librarymanagement.ModuleID],
  val configurations: Vector[bleep.nosbt.librarymanagement.Configuration],
  val classifiers: Vector[String]) extends Serializable {
  
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: GetClassifiersModule => (this.id == x.id) && (this.scalaModuleInfo == x.scalaModuleInfo) && (this.dependencies == x.dependencies) && (this.configurations == x.configurations) && (this.classifiers == x.classifiers)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.GetClassifiersModule".##) + id.##) + scalaModuleInfo.##) + dependencies.##) + configurations.##) + classifiers.##)
  }
  override def toString: String = {
    "GetClassifiersModule(" + id + ", " + scalaModuleInfo + ", " + dependencies + ", " + configurations + ", " + classifiers + ")"
  }
  private[this] def copy(id: bleep.nosbt.librarymanagement.ModuleID = id, scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo] = scalaModuleInfo, dependencies: Vector[bleep.nosbt.librarymanagement.ModuleID] = dependencies, configurations: Vector[bleep.nosbt.librarymanagement.Configuration] = configurations, classifiers: Vector[String] = classifiers): GetClassifiersModule = {
    new GetClassifiersModule(id, scalaModuleInfo, dependencies, configurations, classifiers)
  }
  def withId(id: bleep.nosbt.librarymanagement.ModuleID): GetClassifiersModule = {
    copy(id = id)
  }
  def withScalaModuleInfo(scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo]): GetClassifiersModule = {
    copy(scalaModuleInfo = scalaModuleInfo)
  }
  def withScalaModuleInfo(scalaModuleInfo: bleep.nosbt.librarymanagement.ScalaModuleInfo): GetClassifiersModule = {
    copy(scalaModuleInfo = Option(scalaModuleInfo))
  }
  def withDependencies(dependencies: Vector[bleep.nosbt.librarymanagement.ModuleID]): GetClassifiersModule = {
    copy(dependencies = dependencies)
  }
  def withConfigurations(configurations: Vector[bleep.nosbt.librarymanagement.Configuration]): GetClassifiersModule = {
    copy(configurations = configurations)
  }
  def withClassifiers(classifiers: Vector[String]): GetClassifiersModule = {
    copy(classifiers = classifiers)
  }
}
object GetClassifiersModule {
  
  def apply(id: bleep.nosbt.librarymanagement.ModuleID, scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo], dependencies: Vector[bleep.nosbt.librarymanagement.ModuleID], configurations: Vector[bleep.nosbt.librarymanagement.Configuration], classifiers: Vector[String]): GetClassifiersModule = new GetClassifiersModule(id, scalaModuleInfo, dependencies, configurations, classifiers)
  def apply(id: bleep.nosbt.librarymanagement.ModuleID, scalaModuleInfo: bleep.nosbt.librarymanagement.ScalaModuleInfo, dependencies: Vector[bleep.nosbt.librarymanagement.ModuleID], configurations: Vector[bleep.nosbt.librarymanagement.Configuration], classifiers: Vector[String]): GetClassifiersModule = new GetClassifiersModule(id, Option(scalaModuleInfo), dependencies, configurations, classifiers)
}
