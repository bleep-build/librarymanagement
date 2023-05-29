/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
/**
 * Provides information about dependency resolution.
 * It does not include information about evicted modules, only about the modules ultimately selected by the conflict manager.
 * This means that for a given configuration, there should only be one revision for a given organization and module name.
 * @param cachedDescriptor the location of the resolved module descriptor in the cache
 * @param configurations a sequence containing one report for each configuration resolved.
 * @param stats stats information about the update that produced this report
 */
final class UpdateReport private (
  val cachedDescriptor: java.io.File,
  val configurations: Vector[bleep.nosbt.librarymanagement.ConfigurationReport],
  val stats: bleep.nosbt.librarymanagement.UpdateStats,
  val stamps: Map[java.io.File, Long]) extends bleep.nosbt.librarymanagement.UpdateReportExtra with Serializable {
  
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: UpdateReport => (this.cachedDescriptor == x.cachedDescriptor) && (this.configurations == x.configurations) && (this.stats == x.stats) && (this.stamps == x.stamps)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.UpdateReport".##) + cachedDescriptor.##) + configurations.##) + stats.##) + stamps.##)
  }
  override def toString: String = {
    "Update report:\n\t" + stats + "\n" + configurations.mkString
  }
  private[this] def copy(cachedDescriptor: java.io.File = cachedDescriptor, configurations: Vector[bleep.nosbt.librarymanagement.ConfigurationReport] = configurations, stats: bleep.nosbt.librarymanagement.UpdateStats = stats, stamps: Map[java.io.File, Long] = stamps): UpdateReport = {
    new UpdateReport(cachedDescriptor, configurations, stats, stamps)
  }
  def withCachedDescriptor(cachedDescriptor: java.io.File): UpdateReport = {
    copy(cachedDescriptor = cachedDescriptor)
  }
  def withConfigurations(configurations: Vector[bleep.nosbt.librarymanagement.ConfigurationReport]): UpdateReport = {
    copy(configurations = configurations)
  }
  def withStats(stats: bleep.nosbt.librarymanagement.UpdateStats): UpdateReport = {
    copy(stats = stats)
  }
  def withStamps(stamps: Map[java.io.File, Long]): UpdateReport = {
    copy(stamps = stamps)
  }
}
object UpdateReport {
  
  def apply(cachedDescriptor: java.io.File, configurations: Vector[bleep.nosbt.librarymanagement.ConfigurationReport], stats: bleep.nosbt.librarymanagement.UpdateStats, stamps: Map[java.io.File, Long]): UpdateReport = new UpdateReport(cachedDescriptor, configurations, stats, stamps)
}
