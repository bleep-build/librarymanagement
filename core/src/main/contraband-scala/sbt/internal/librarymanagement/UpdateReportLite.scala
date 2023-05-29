/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.internal.librarymanagement
final class UpdateReportLite private (
  val configurations: Vector[bleep.nosbt.internal.librarymanagement.ConfigurationReportLite]) extends Serializable {
  
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: UpdateReportLite => (this.configurations == x.configurations)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (17 + "bleep.nosbt.internal.librarymanagement.UpdateReportLite".##) + configurations.##)
  }
  override def toString: String = {
    "UpdateReportLite(" + configurations + ")"
  }
  private[this] def copy(configurations: Vector[bleep.nosbt.internal.librarymanagement.ConfigurationReportLite]): UpdateReportLite = {
    new UpdateReportLite(configurations)
  }
  def withConfigurations(configurations: Vector[bleep.nosbt.internal.librarymanagement.ConfigurationReportLite]): UpdateReportLite = {
    copy(configurations = configurations)
  }
}
object UpdateReportLite {
  
  def apply(configurations: Vector[bleep.nosbt.internal.librarymanagement.ConfigurationReportLite]): UpdateReportLite = new UpdateReportLite(configurations)
}
