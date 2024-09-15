/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait RetrieveConfigurationFormats { self: bleep.nosbt.librarymanagement.ConfigRefFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val RetrieveConfigurationFormat: JsonFormat[bleep.nosbt.librarymanagement.RetrieveConfiguration] = new JsonFormat[bleep.nosbt.librarymanagement.RetrieveConfiguration] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.RetrieveConfiguration = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val retrieveDirectory = unbuilder.readField[Option[java.io.File]]("retrieveDirectory")
      val outputPattern = unbuilder.readField[Option[String]]("outputPattern")
      val sync = unbuilder.readField[Boolean]("sync")
      val configurationsToRetrieve = unbuilder.readField[Option[scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]]]("configurationsToRetrieve")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.RetrieveConfiguration(retrieveDirectory, outputPattern, sync, configurationsToRetrieve)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.RetrieveConfiguration, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("retrieveDirectory", obj.retrieveDirectory)
    builder.addField("outputPattern", obj.outputPattern)
    builder.addField("sync", obj.sync)
    builder.addField("configurationsToRetrieve", obj.configurationsToRetrieve)
    builder.endObject()
  }
}
}
