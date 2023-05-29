/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
final class Artifact private (
  val name: String,
  val `type`: String,
  val extension: String,
  val classifier: Option[String],
  val configurations: Vector[bleep.nosbt.librarymanagement.ConfigRef],
  val url: Option[java.net.URL],
  val extraAttributes: Map[String, String],
  val checksum: Option[bleep.nosbt.librarymanagement.Checksum],
  val allowInsecureProtocol: Boolean) extends bleep.nosbt.librarymanagement.ArtifactExtra with Serializable {
  private[nosbt] def validateProtocol(logger: bleep.nosbt.util.Logger): Boolean = Resolver.validateArtifact(this, logger)
  private def this(name: String) = this(name, Artifact.DefaultType, Artifact.DefaultExtension, None, Vector.empty, None, Map.empty, None, false)
  private def this(name: String, `type`: String, extension: String, classifier: Option[String], configurations: Vector[bleep.nosbt.librarymanagement.ConfigRef], url: Option[java.net.URL], extraAttributes: Map[String, String], checksum: Option[bleep.nosbt.librarymanagement.Checksum]) = this(name, `type`, extension, classifier, configurations, url, extraAttributes, checksum, false)
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: Artifact => (this.name == x.name) && (this.`type` == x.`type`) && (this.extension == x.extension) && (this.classifier == x.classifier) && (this.configurations == x.configurations) && (this.url == x.url) && (this.extraAttributes == x.extraAttributes) && (this.checksum == x.checksum) && (this.allowInsecureProtocol == x.allowInsecureProtocol)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.Artifact".##) + name.##) + `type`.##) + extension.##) + classifier.##) + configurations.##) + url.##) + extraAttributes.##) + checksum.##) + allowInsecureProtocol.##)
  }
  override def toString: String = {
    "Artifact(" + name + ", " + `type` + ", " + extension + ", " + classifier + ", " + configurations + ", " + url + ", " + extraAttributes + ", " + checksum + ", " + allowInsecureProtocol + ")"
  }
  private[this] def copy(name: String = name, `type`: String = `type`, extension: String = extension, classifier: Option[String] = classifier, configurations: Vector[bleep.nosbt.librarymanagement.ConfigRef] = configurations, url: Option[java.net.URL] = url, extraAttributes: Map[String, String] = extraAttributes, checksum: Option[bleep.nosbt.librarymanagement.Checksum] = checksum, allowInsecureProtocol: Boolean = allowInsecureProtocol): Artifact = {
    new Artifact(name, `type`, extension, classifier, configurations, url, extraAttributes, checksum, allowInsecureProtocol)
  }
  def withName(name: String): Artifact = {
    copy(name = name)
  }
  def withType(`type`: String): Artifact = {
    copy(`type` = `type`)
  }
  def withExtension(extension: String): Artifact = {
    copy(extension = extension)
  }
  def withClassifier(classifier: Option[String]): Artifact = {
    copy(classifier = classifier)
  }
  def withConfigurations(configurations: Vector[bleep.nosbt.librarymanagement.ConfigRef]): Artifact = {
    copy(configurations = configurations)
  }
  def withUrl(url: Option[java.net.URL]): Artifact = {
    copy(url = url)
  }
  def withExtraAttributes(extraAttributes: Map[String, String]): Artifact = {
    copy(extraAttributes = extraAttributes)
  }
  def withChecksum(checksum: Option[bleep.nosbt.librarymanagement.Checksum]): Artifact = {
    copy(checksum = checksum)
  }
  def withAllowInsecureProtocol(allowInsecureProtocol: Boolean): Artifact = {
    copy(allowInsecureProtocol = allowInsecureProtocol)
  }
}
object Artifact extends bleep.nosbt.librarymanagement.ArtifactFunctions {
  
  def apply(name: String): Artifact = new Artifact(name)
  def apply(name: String, `type`: String, extension: String, classifier: Option[String], configurations: Vector[bleep.nosbt.librarymanagement.ConfigRef], url: Option[java.net.URL], extraAttributes: Map[String, String], checksum: Option[bleep.nosbt.librarymanagement.Checksum]): Artifact = new Artifact(name, `type`, extension, classifier, configurations, url, extraAttributes, checksum)
  def apply(name: String, `type`: String, extension: String, classifier: Option[String], configurations: Vector[bleep.nosbt.librarymanagement.ConfigRef], url: Option[java.net.URL], extraAttributes: Map[String, String], checksum: Option[bleep.nosbt.librarymanagement.Checksum], allowInsecureProtocol: Boolean): Artifact = new Artifact(name, `type`, extension, classifier, configurations, url, extraAttributes, checksum, allowInsecureProtocol)
}
