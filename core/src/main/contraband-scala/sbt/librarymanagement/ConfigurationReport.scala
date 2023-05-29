/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
/**
 * Provides information about resolution of a single configuration.
 * @param configuration the configuration this report is for.
 * @param modules a sequence containing one report for each module resolved for this configuration.
 * @param details a sequence containing one report for each org/name, which may or may not be part of the final resolution.
 */
final class ConfigurationReport private (
  val configuration: bleep.nosbt.librarymanagement.ConfigRef,
  val modules: Vector[bleep.nosbt.librarymanagement.ModuleReport],
  val details: Vector[bleep.nosbt.librarymanagement.OrganizationArtifactReport]) extends bleep.nosbt.librarymanagement.ConfigurationReportExtra with Serializable {
  
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: ConfigurationReport => (this.configuration == x.configuration) && (this.modules == x.modules) && (this.details == x.details)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.ConfigurationReport".##) + configuration.##) + modules.##) + details.##)
  }
  override def toString: String = {
    s"\t$configuration:\n" +
    (if (details.isEmpty) modules.mkString + details.flatMap(_.modules).filter(_.evicted).map("\t\t(EVICTED) " + _ + "\n").mkString
    else details.mkString)
  }
  private[this] def copy(configuration: bleep.nosbt.librarymanagement.ConfigRef = configuration, modules: Vector[bleep.nosbt.librarymanagement.ModuleReport] = modules, details: Vector[bleep.nosbt.librarymanagement.OrganizationArtifactReport] = details): ConfigurationReport = {
    new ConfigurationReport(configuration, modules, details)
  }
  def withConfiguration(configuration: bleep.nosbt.librarymanagement.ConfigRef): ConfigurationReport = {
    copy(configuration = configuration)
  }
  def withModules(modules: Vector[bleep.nosbt.librarymanagement.ModuleReport]): ConfigurationReport = {
    copy(modules = modules)
  }
  def withDetails(details: Vector[bleep.nosbt.librarymanagement.OrganizationArtifactReport]): ConfigurationReport = {
    copy(details = details)
  }
}
object ConfigurationReport {
  
  def apply(configuration: bleep.nosbt.librarymanagement.ConfigRef, modules: Vector[bleep.nosbt.librarymanagement.ModuleReport], details: Vector[bleep.nosbt.librarymanagement.OrganizationArtifactReport]): ConfigurationReport = new ConfigurationReport(configuration, modules, details)
}
