/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
final class ScalaModuleInfo private (
  val scalaFullVersion: String,
  val scalaBinaryVersion: String,
  val configurations: Vector[bleep.nosbt.librarymanagement.Configuration],
  val checkExplicit: Boolean,
  val filterImplicit: Boolean,
  val overrideScalaVersion: Boolean,
  val scalaOrganization: String,
  val scalaArtifacts: scala.Vector[String]) extends Serializable {
  
  private def this(scalaFullVersion: String, scalaBinaryVersion: String, configurations: Vector[bleep.nosbt.librarymanagement.Configuration], checkExplicit: Boolean, filterImplicit: Boolean, overrideScalaVersion: Boolean) = this(scalaFullVersion, scalaBinaryVersion, configurations, checkExplicit, filterImplicit, overrideScalaVersion, bleep.nosbt.librarymanagement.ScalaArtifacts.Organization, bleep.nosbt.librarymanagement.ScalaArtifacts.Artifacts)
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: ScalaModuleInfo => (this.scalaFullVersion == x.scalaFullVersion) && (this.scalaBinaryVersion == x.scalaBinaryVersion) && (this.configurations == x.configurations) && (this.checkExplicit == x.checkExplicit) && (this.filterImplicit == x.filterImplicit) && (this.overrideScalaVersion == x.overrideScalaVersion) && (this.scalaOrganization == x.scalaOrganization) && (this.scalaArtifacts == x.scalaArtifacts)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.ScalaModuleInfo".##) + scalaFullVersion.##) + scalaBinaryVersion.##) + configurations.##) + checkExplicit.##) + filterImplicit.##) + overrideScalaVersion.##) + scalaOrganization.##) + scalaArtifacts.##)
  }
  override def toString: String = {
    "ScalaModuleInfo(" + scalaFullVersion + ", " + scalaBinaryVersion + ", " + configurations + ", " + checkExplicit + ", " + filterImplicit + ", " + overrideScalaVersion + ", " + scalaOrganization + ", " + scalaArtifacts + ")"
  }
  private[this] def copy(scalaFullVersion: String = scalaFullVersion, scalaBinaryVersion: String = scalaBinaryVersion, configurations: Vector[bleep.nosbt.librarymanagement.Configuration] = configurations, checkExplicit: Boolean = checkExplicit, filterImplicit: Boolean = filterImplicit, overrideScalaVersion: Boolean = overrideScalaVersion, scalaOrganization: String = scalaOrganization, scalaArtifacts: scala.Vector[String] = scalaArtifacts): ScalaModuleInfo = {
    new ScalaModuleInfo(scalaFullVersion, scalaBinaryVersion, configurations, checkExplicit, filterImplicit, overrideScalaVersion, scalaOrganization, scalaArtifacts)
  }
  def withScalaFullVersion(scalaFullVersion: String): ScalaModuleInfo = {
    copy(scalaFullVersion = scalaFullVersion)
  }
  def withScalaBinaryVersion(scalaBinaryVersion: String): ScalaModuleInfo = {
    copy(scalaBinaryVersion = scalaBinaryVersion)
  }
  def withConfigurations(configurations: Vector[bleep.nosbt.librarymanagement.Configuration]): ScalaModuleInfo = {
    copy(configurations = configurations)
  }
  def withCheckExplicit(checkExplicit: Boolean): ScalaModuleInfo = {
    copy(checkExplicit = checkExplicit)
  }
  def withFilterImplicit(filterImplicit: Boolean): ScalaModuleInfo = {
    copy(filterImplicit = filterImplicit)
  }
  def withOverrideScalaVersion(overrideScalaVersion: Boolean): ScalaModuleInfo = {
    copy(overrideScalaVersion = overrideScalaVersion)
  }
  def withScalaOrganization(scalaOrganization: String): ScalaModuleInfo = {
    copy(scalaOrganization = scalaOrganization)
  }
  def withScalaArtifacts(scalaArtifacts: scala.Vector[String]): ScalaModuleInfo = {
    copy(scalaArtifacts = scalaArtifacts)
  }
}
object ScalaModuleInfo {
  
  def apply(scalaFullVersion: String, scalaBinaryVersion: String, configurations: Vector[bleep.nosbt.librarymanagement.Configuration], checkExplicit: Boolean, filterImplicit: Boolean, overrideScalaVersion: Boolean): ScalaModuleInfo = new ScalaModuleInfo(scalaFullVersion, scalaBinaryVersion, configurations, checkExplicit, filterImplicit, overrideScalaVersion)
  def apply(scalaFullVersion: String, scalaBinaryVersion: String, configurations: Vector[bleep.nosbt.librarymanagement.Configuration], checkExplicit: Boolean, filterImplicit: Boolean, overrideScalaVersion: Boolean, scalaOrganization: String, scalaArtifacts: scala.Vector[String]): ScalaModuleInfo = new ScalaModuleInfo(scalaFullVersion, scalaBinaryVersion, configurations, checkExplicit, filterImplicit, overrideScalaVersion, scalaOrganization, scalaArtifacts)
}
