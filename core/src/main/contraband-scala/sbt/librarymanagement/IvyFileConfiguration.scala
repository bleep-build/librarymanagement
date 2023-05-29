/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
final class IvyFileConfiguration private (
  validate: Boolean,
  scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo],
  val file: java.io.File,
  val autoScalaTools: Boolean) extends bleep.nosbt.librarymanagement.ModuleSettings(validate, scalaModuleInfo) with Serializable {
  
  private def this(file: java.io.File, autoScalaTools: Boolean) = this(false, None, file, autoScalaTools)
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: IvyFileConfiguration => (this.validate == x.validate) && (this.scalaModuleInfo == x.scalaModuleInfo) && (this.file == x.file) && (this.autoScalaTools == x.autoScalaTools)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.IvyFileConfiguration".##) + validate.##) + scalaModuleInfo.##) + file.##) + autoScalaTools.##)
  }
  override def toString: String = {
    "IvyFileConfiguration(" + validate + ", " + scalaModuleInfo + ", " + file + ", " + autoScalaTools + ")"
  }
  private[this] def copy(validate: Boolean = validate, scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo] = scalaModuleInfo, file: java.io.File = file, autoScalaTools: Boolean = autoScalaTools): IvyFileConfiguration = {
    new IvyFileConfiguration(validate, scalaModuleInfo, file, autoScalaTools)
  }
  def withValidate(validate: Boolean): IvyFileConfiguration = {
    copy(validate = validate)
  }
  def withScalaModuleInfo(scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo]): IvyFileConfiguration = {
    copy(scalaModuleInfo = scalaModuleInfo)
  }
  def withScalaModuleInfo(scalaModuleInfo: bleep.nosbt.librarymanagement.ScalaModuleInfo): IvyFileConfiguration = {
    copy(scalaModuleInfo = Option(scalaModuleInfo))
  }
  def withFile(file: java.io.File): IvyFileConfiguration = {
    copy(file = file)
  }
  def withAutoScalaTools(autoScalaTools: Boolean): IvyFileConfiguration = {
    copy(autoScalaTools = autoScalaTools)
  }
}
object IvyFileConfiguration {
  
  def apply(file: java.io.File, autoScalaTools: Boolean): IvyFileConfiguration = new IvyFileConfiguration(file, autoScalaTools)
  def apply(validate: Boolean, scalaModuleInfo: Option[bleep.nosbt.librarymanagement.ScalaModuleInfo], file: java.io.File, autoScalaTools: Boolean): IvyFileConfiguration = new IvyFileConfiguration(validate, scalaModuleInfo, file, autoScalaTools)
  def apply(validate: Boolean, scalaModuleInfo: bleep.nosbt.librarymanagement.ScalaModuleInfo, file: java.io.File, autoScalaTools: Boolean): IvyFileConfiguration = new IvyFileConfiguration(validate, Option(scalaModuleInfo), file, autoScalaTools)
}
