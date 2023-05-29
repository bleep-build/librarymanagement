/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.internal.librarymanagement
final class ConfigurationReportLite private (
  val configuration: String,
  val details: Vector[bleep.nosbt.librarymanagement.OrganizationArtifactReport]) extends Serializable {
  
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: ConfigurationReportLite => (this.configuration == x.configuration) && (this.details == x.details)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (17 + "bleep.nosbt.internal.librarymanagement.ConfigurationReportLite".##) + configuration.##) + details.##)
  }
  override def toString: String = {
    "ConfigurationReportLite(" + configuration + ", " + details + ")"
  }
  private[this] def copy(configuration: String = configuration, details: Vector[bleep.nosbt.librarymanagement.OrganizationArtifactReport] = details): ConfigurationReportLite = {
    new ConfigurationReportLite(configuration, details)
  }
  def withConfiguration(configuration: String): ConfigurationReportLite = {
    copy(configuration = configuration)
  }
  def withDetails(details: Vector[bleep.nosbt.librarymanagement.OrganizationArtifactReport]): ConfigurationReportLite = {
    copy(details = details)
  }
}
object ConfigurationReportLite {
  
  def apply(configuration: String, details: Vector[bleep.nosbt.librarymanagement.OrganizationArtifactReport]): ConfigurationReportLite = new ConfigurationReportLite(configuration, details)
}
