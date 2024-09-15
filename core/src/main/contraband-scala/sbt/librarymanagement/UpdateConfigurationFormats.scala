/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait UpdateConfigurationFormats { self: bleep.nosbt.librarymanagement.RetrieveConfigurationFormats with bleep.nosbt.librarymanagement.UpdateLoggingFormats with bleep.nosbt.internal.librarymanagement.formats.LogicalClockFormats with bleep.nosbt.librarymanagement.ArtifactTypeFilterFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val UpdateConfigurationFormat: JsonFormat[bleep.nosbt.librarymanagement.UpdateConfiguration] = new JsonFormat[bleep.nosbt.librarymanagement.UpdateConfiguration] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.UpdateConfiguration = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val retrieveManaged = unbuilder.readField[Option[bleep.nosbt.librarymanagement.RetrieveConfiguration]]("retrieveManaged")
      val missingOk = unbuilder.readField[Boolean]("missingOk")
      val logging = unbuilder.readField[bleep.nosbt.librarymanagement.UpdateLogging]("logging")
      val logicalClock = unbuilder.readField[bleep.nosbt.librarymanagement.LogicalClock]("logicalClock")
      val metadataDirectory = unbuilder.readField[Option[java.io.File]]("metadataDirectory")
      val artifactFilter = unbuilder.readField[Option[bleep.nosbt.librarymanagement.ArtifactTypeFilter]]("artifactFilter")
      val offline = unbuilder.readField[Boolean]("offline")
      val frozen = unbuilder.readField[Boolean]("frozen")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.UpdateConfiguration(retrieveManaged, missingOk, logging, logicalClock, metadataDirectory, artifactFilter, offline, frozen)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.UpdateConfiguration, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("retrieveManaged", obj.retrieveManaged)
    builder.addField("missingOk", obj.missingOk)
    builder.addField("logging", obj.logging)
    builder.addField("logicalClock", obj.logicalClock)
    builder.addField("metadataDirectory", obj.metadataDirectory)
    builder.addField("artifactFilter", obj.artifactFilter)
    builder.addField("offline", obj.offline)
    builder.addField("frozen", obj.frozen)
    builder.endObject()
  }
}
}
