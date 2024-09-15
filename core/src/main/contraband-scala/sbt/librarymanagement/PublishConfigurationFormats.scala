/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait PublishConfigurationFormats { self: bleep.nosbt.librarymanagement.ConfigRefFormats with bleep.nosbt.librarymanagement.ArtifactFormats with bleep.nosbt.librarymanagement.UpdateLoggingFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val PublishConfigurationFormat: JsonFormat[bleep.nosbt.librarymanagement.PublishConfiguration] = new JsonFormat[bleep.nosbt.librarymanagement.PublishConfiguration] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.PublishConfiguration = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val publishMavenStyle = unbuilder.readField[Boolean]("publishMavenStyle")
      val deliverIvyPattern = unbuilder.readField[Option[String]]("deliverIvyPattern")
      val status = unbuilder.readField[Option[String]]("status")
      val configurations = unbuilder.readField[Option[scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]]]("configurations")
      val resolverName = unbuilder.readField[Option[String]]("resolverName")
      val artifacts = unbuilder.readField[Vector[scala.Tuple2[bleep.nosbt.librarymanagement.Artifact, java.io.File]]]("artifacts")
      val checksums = unbuilder.readField[scala.Vector[String]]("checksums")
      val logging = unbuilder.readField[Option[bleep.nosbt.librarymanagement.UpdateLogging]]("logging")
      val overwrite = unbuilder.readField[Boolean]("overwrite")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.PublishConfiguration(publishMavenStyle, deliverIvyPattern, status, configurations, resolverName, artifacts, checksums, logging, overwrite)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.PublishConfiguration, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("publishMavenStyle", obj.publishMavenStyle)
    builder.addField("deliverIvyPattern", obj.deliverIvyPattern)
    builder.addField("status", obj.status)
    builder.addField("configurations", obj.configurations)
    builder.addField("resolverName", obj.resolverName)
    builder.addField("artifacts", obj.artifacts)
    builder.addField("checksums", obj.checksums)
    builder.addField("logging", obj.logging)
    builder.addField("overwrite", obj.overwrite)
    builder.endObject()
  }
}
}
