/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
final class ModuleID private (
  val organization: String,
  val name: String,
  val revision: String,
  val configurations: Option[String],
  val isChanging: Boolean,
  val isTransitive: Boolean,
  val isForce: Boolean,
  val explicitArtifacts: Vector[bleep.nosbt.librarymanagement.Artifact],
  val inclusions: Vector[bleep.nosbt.librarymanagement.InclExclRule],
  val exclusions: Vector[bleep.nosbt.librarymanagement.InclExclRule],
  val extraAttributes: Map[String, String],
  val crossVersion: bleep.nosbt.librarymanagement.CrossVersion,
  val branchName: Option[String]) extends bleep.nosbt.librarymanagement.ModuleIDExtra with Serializable {
  
  private def this(organization: String, name: String, revision: String) = this(organization, name, revision, None, false, true, false, Vector.empty, Vector.empty, Vector.empty, Map.empty, bleep.nosbt.librarymanagement.Disabled(), None)
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: ModuleID => (this.organization == x.organization) && (this.name == x.name) && (this.revision == x.revision) && (this.configurations == x.configurations) && (this.isChanging == x.isChanging) && (this.isTransitive == x.isTransitive) && (this.isForce == x.isForce) && (this.explicitArtifacts == x.explicitArtifacts) && (this.inclusions == x.inclusions) && (this.exclusions == x.exclusions) && (this.extraAttributes == x.extraAttributes) && (this.crossVersion == x.crossVersion) && (this.branchName == x.branchName)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.ModuleID".##) + organization.##) + name.##) + revision.##) + configurations.##) + isChanging.##) + isTransitive.##) + isForce.##) + explicitArtifacts.##) + inclusions.##) + exclusions.##) + extraAttributes.##) + crossVersion.##) + branchName.##)
  }
  override def toString: String = {
    this.toStringImpl
  }
  private[this] def copy(organization: String = organization, name: String = name, revision: String = revision, configurations: Option[String] = configurations, isChanging: Boolean = isChanging, isTransitive: Boolean = isTransitive, isForce: Boolean = isForce, explicitArtifacts: Vector[bleep.nosbt.librarymanagement.Artifact] = explicitArtifacts, inclusions: Vector[bleep.nosbt.librarymanagement.InclExclRule] = inclusions, exclusions: Vector[bleep.nosbt.librarymanagement.InclExclRule] = exclusions, extraAttributes: Map[String, String] = extraAttributes, crossVersion: bleep.nosbt.librarymanagement.CrossVersion = crossVersion, branchName: Option[String] = branchName): ModuleID = {
    new ModuleID(organization, name, revision, configurations, isChanging, isTransitive, isForce, explicitArtifacts, inclusions, exclusions, extraAttributes, crossVersion, branchName)
  }
  def withOrganization(organization: String): ModuleID = {
    copy(organization = organization)
  }
  def withName(name: String): ModuleID = {
    copy(name = name)
  }
  def withRevision(revision: String): ModuleID = {
    copy(revision = revision)
  }
  def withConfigurations(configurations: Option[String]): ModuleID = {
    copy(configurations = configurations)
  }
  def withIsChanging(isChanging: Boolean): ModuleID = {
    copy(isChanging = isChanging)
  }
  def withIsTransitive(isTransitive: Boolean): ModuleID = {
    copy(isTransitive = isTransitive)
  }
  def withIsForce(isForce: Boolean): ModuleID = {
    copy(isForce = isForce)
  }
  def withExplicitArtifacts(explicitArtifacts: Vector[bleep.nosbt.librarymanagement.Artifact]): ModuleID = {
    copy(explicitArtifacts = explicitArtifacts)
  }
  def withInclusions(inclusions: Vector[bleep.nosbt.librarymanagement.InclExclRule]): ModuleID = {
    copy(inclusions = inclusions)
  }
  def withExclusions(exclusions: Vector[bleep.nosbt.librarymanagement.InclExclRule]): ModuleID = {
    copy(exclusions = exclusions)
  }
  def withExtraAttributes(extraAttributes: Map[String, String]): ModuleID = {
    copy(extraAttributes = extraAttributes)
  }
  def withCrossVersion(crossVersion: bleep.nosbt.librarymanagement.CrossVersion): ModuleID = {
    copy(crossVersion = crossVersion)
  }
  def withBranchName(branchName: Option[String]): ModuleID = {
    copy(branchName = branchName)
  }
}
object ModuleID extends bleep.nosbt.librarymanagement.ModuleIDFunctions {
  
  def apply(organization: String, name: String, revision: String): ModuleID = new ModuleID(organization, name, revision)
  def apply(organization: String, name: String, revision: String, configurations: Option[String], isChanging: Boolean, isTransitive: Boolean, isForce: Boolean, explicitArtifacts: Vector[bleep.nosbt.librarymanagement.Artifact], inclusions: Vector[bleep.nosbt.librarymanagement.InclExclRule], exclusions: Vector[bleep.nosbt.librarymanagement.InclExclRule], extraAttributes: Map[String, String], crossVersion: bleep.nosbt.librarymanagement.CrossVersion, branchName: Option[String]): ModuleID = new ModuleID(organization, name, revision, configurations, isChanging, isTransitive, isForce, explicitArtifacts, inclusions, exclusions, extraAttributes, crossVersion, branchName)
}
