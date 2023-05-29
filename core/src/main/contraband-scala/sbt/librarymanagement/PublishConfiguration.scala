/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
final class PublishConfiguration private (
  val publishMavenStyle: Boolean,
  val deliverIvyPattern: Option[String],
  val status: Option[String],
  val configurations: Option[scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]],
  val resolverName: Option[String],
  val artifacts: Vector[scala.Tuple2[bleep.nosbt.librarymanagement.Artifact, java.io.File]],
  val checksums: scala.Vector[String],
  val logging: Option[bleep.nosbt.librarymanagement.UpdateLogging],
  val overwrite: Boolean) extends Serializable {
  
  private def this() = this(true, None, None, None, None, Vector(), Vector("sha1", "md5"), None, false)
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: PublishConfiguration => (this.publishMavenStyle == x.publishMavenStyle) && (this.deliverIvyPattern == x.deliverIvyPattern) && (this.status == x.status) && (this.configurations == x.configurations) && (this.resolverName == x.resolverName) && (this.artifacts == x.artifacts) && (this.checksums == x.checksums) && (this.logging == x.logging) && (this.overwrite == x.overwrite)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.PublishConfiguration".##) + publishMavenStyle.##) + deliverIvyPattern.##) + status.##) + configurations.##) + resolverName.##) + artifacts.##) + checksums.##) + logging.##) + overwrite.##)
  }
  override def toString: String = {
    "PublishConfiguration(" + publishMavenStyle + ", " + deliverIvyPattern + ", " + status + ", " + configurations + ", " + resolverName + ", " + artifacts + ", " + checksums + ", " + logging + ", " + overwrite + ")"
  }
  private[this] def copy(publishMavenStyle: Boolean = publishMavenStyle, deliverIvyPattern: Option[String] = deliverIvyPattern, status: Option[String] = status, configurations: Option[scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]] = configurations, resolverName: Option[String] = resolverName, artifacts: Vector[scala.Tuple2[bleep.nosbt.librarymanagement.Artifact, java.io.File]] = artifacts, checksums: scala.Vector[String] = checksums, logging: Option[bleep.nosbt.librarymanagement.UpdateLogging] = logging, overwrite: Boolean = overwrite): PublishConfiguration = {
    new PublishConfiguration(publishMavenStyle, deliverIvyPattern, status, configurations, resolverName, artifacts, checksums, logging, overwrite)
  }
  def withPublishMavenStyle(publishMavenStyle: Boolean): PublishConfiguration = {
    copy(publishMavenStyle = publishMavenStyle)
  }
  def withDeliverIvyPattern(deliverIvyPattern: Option[String]): PublishConfiguration = {
    copy(deliverIvyPattern = deliverIvyPattern)
  }
  def withDeliverIvyPattern(deliverIvyPattern: String): PublishConfiguration = {
    copy(deliverIvyPattern = Option(deliverIvyPattern))
  }
  def withStatus(status: Option[String]): PublishConfiguration = {
    copy(status = status)
  }
  def withStatus(status: String): PublishConfiguration = {
    copy(status = Option(status))
  }
  def withConfigurations(configurations: Option[scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]]): PublishConfiguration = {
    copy(configurations = configurations)
  }
  def withConfigurations(configurations: scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]): PublishConfiguration = {
    copy(configurations = Option(configurations))
  }
  def withResolverName(resolverName: Option[String]): PublishConfiguration = {
    copy(resolverName = resolverName)
  }
  def withResolverName(resolverName: String): PublishConfiguration = {
    copy(resolverName = Option(resolverName))
  }
  def withArtifacts(artifacts: Vector[scala.Tuple2[bleep.nosbt.librarymanagement.Artifact, java.io.File]]): PublishConfiguration = {
    copy(artifacts = artifacts)
  }
  def withChecksums(checksums: scala.Vector[String]): PublishConfiguration = {
    copy(checksums = checksums)
  }
  def withLogging(logging: Option[bleep.nosbt.librarymanagement.UpdateLogging]): PublishConfiguration = {
    copy(logging = logging)
  }
  def withLogging(logging: bleep.nosbt.librarymanagement.UpdateLogging): PublishConfiguration = {
    copy(logging = Option(logging))
  }
  def withOverwrite(overwrite: Boolean): PublishConfiguration = {
    copy(overwrite = overwrite)
  }
}
object PublishConfiguration {
  
  def apply(): PublishConfiguration = new PublishConfiguration()
  def apply(publishMavenStyle: Boolean, deliverIvyPattern: Option[String], status: Option[String], configurations: Option[scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]], resolverName: Option[String], artifacts: Vector[scala.Tuple2[bleep.nosbt.librarymanagement.Artifact, java.io.File]], checksums: scala.Vector[String], logging: Option[bleep.nosbt.librarymanagement.UpdateLogging], overwrite: Boolean): PublishConfiguration = new PublishConfiguration(publishMavenStyle, deliverIvyPattern, status, configurations, resolverName, artifacts, checksums, logging, overwrite)
  def apply(publishMavenStyle: Boolean, deliverIvyPattern: String, status: String, configurations: scala.Vector[bleep.nosbt.librarymanagement.ConfigRef], resolverName: String, artifacts: Vector[scala.Tuple2[bleep.nosbt.librarymanagement.Artifact, java.io.File]], checksums: scala.Vector[String], logging: bleep.nosbt.librarymanagement.UpdateLogging, overwrite: Boolean): PublishConfiguration = new PublishConfiguration(publishMavenStyle, Option(deliverIvyPattern), Option(status), Option(configurations), Option(resolverName), artifacts, checksums, Option(logging), overwrite)
}
