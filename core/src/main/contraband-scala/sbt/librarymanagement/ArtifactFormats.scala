/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait ArtifactFormats { self: bleep.nosbt.librarymanagement.ConfigRefFormats with bleep.nosbt.librarymanagement.ChecksumFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val ArtifactFormat: JsonFormat[bleep.nosbt.librarymanagement.Artifact] = new JsonFormat[bleep.nosbt.librarymanagement.Artifact] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.Artifact = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val name = unbuilder.readField[String]("name")
      val `type` = unbuilder.readField[String]("type")
      val extension = unbuilder.readField[String]("extension")
      val classifier = unbuilder.readField[Option[String]]("classifier")
      val configurations = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.ConfigRef]]("configurations")
      val url = unbuilder.readField[Option[java.net.URL]]("url")
      val extraAttributes = unbuilder.readField[Map[String, String]]("extraAttributes")
      val checksum = unbuilder.readField[Option[bleep.nosbt.librarymanagement.Checksum]]("checksum")
      val allowInsecureProtocol = unbuilder.readField[Boolean]("allowInsecureProtocol")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.Artifact(name, `type`, extension, classifier, configurations, url, extraAttributes, checksum, allowInsecureProtocol)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.Artifact, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("name", obj.name)
    builder.addField("type", obj.`type`)
    builder.addField("extension", obj.extension)
    builder.addField("classifier", obj.classifier)
    builder.addField("configurations", obj.configurations)
    builder.addField("url", obj.url)
    builder.addField("extraAttributes", obj.extraAttributes)
    builder.addField("checksum", obj.checksum)
    builder.addField("allowInsecureProtocol", obj.allowInsecureProtocol)
    builder.endObject()
  }
}
}
