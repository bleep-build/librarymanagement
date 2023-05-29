/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
final class GetClassifiersConfiguration private (
  val module: bleep.nosbt.librarymanagement.GetClassifiersModule,
  val excludes: Vector[scala.Tuple2[bleep.nosbt.librarymanagement.ModuleID, scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]]],
  val updateConfiguration: bleep.nosbt.librarymanagement.UpdateConfiguration,
  val sourceArtifactTypes: Vector[String],
  val docArtifactTypes: Vector[String]) extends Serializable {
  
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: GetClassifiersConfiguration => (this.module == x.module) && (this.excludes == x.excludes) && (this.updateConfiguration == x.updateConfiguration) && (this.sourceArtifactTypes == x.sourceArtifactTypes) && (this.docArtifactTypes == x.docArtifactTypes)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.GetClassifiersConfiguration".##) + module.##) + excludes.##) + updateConfiguration.##) + sourceArtifactTypes.##) + docArtifactTypes.##)
  }
  override def toString: String = {
    "GetClassifiersConfiguration(" + module + ", " + excludes + ", " + updateConfiguration + ", " + sourceArtifactTypes + ", " + docArtifactTypes + ")"
  }
  private[this] def copy(module: bleep.nosbt.librarymanagement.GetClassifiersModule = module, excludes: Vector[scala.Tuple2[bleep.nosbt.librarymanagement.ModuleID, scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]]] = excludes, updateConfiguration: bleep.nosbt.librarymanagement.UpdateConfiguration = updateConfiguration, sourceArtifactTypes: Vector[String] = sourceArtifactTypes, docArtifactTypes: Vector[String] = docArtifactTypes): GetClassifiersConfiguration = {
    new GetClassifiersConfiguration(module, excludes, updateConfiguration, sourceArtifactTypes, docArtifactTypes)
  }
  def withModule(module: bleep.nosbt.librarymanagement.GetClassifiersModule): GetClassifiersConfiguration = {
    copy(module = module)
  }
  def withExcludes(excludes: Vector[scala.Tuple2[bleep.nosbt.librarymanagement.ModuleID, scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]]]): GetClassifiersConfiguration = {
    copy(excludes = excludes)
  }
  def withUpdateConfiguration(updateConfiguration: bleep.nosbt.librarymanagement.UpdateConfiguration): GetClassifiersConfiguration = {
    copy(updateConfiguration = updateConfiguration)
  }
  def withSourceArtifactTypes(sourceArtifactTypes: Vector[String]): GetClassifiersConfiguration = {
    copy(sourceArtifactTypes = sourceArtifactTypes)
  }
  def withDocArtifactTypes(docArtifactTypes: Vector[String]): GetClassifiersConfiguration = {
    copy(docArtifactTypes = docArtifactTypes)
  }
}
object GetClassifiersConfiguration {
  
  def apply(module: bleep.nosbt.librarymanagement.GetClassifiersModule, excludes: Vector[scala.Tuple2[bleep.nosbt.librarymanagement.ModuleID, scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]]], updateConfiguration: bleep.nosbt.librarymanagement.UpdateConfiguration, sourceArtifactTypes: Vector[String], docArtifactTypes: Vector[String]): GetClassifiersConfiguration = new GetClassifiersConfiguration(module, excludes, updateConfiguration, sourceArtifactTypes, docArtifactTypes)
}
