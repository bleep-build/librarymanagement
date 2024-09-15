/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait FileConfigurationFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val FileConfigurationFormat: JsonFormat[bleep.nosbt.librarymanagement.FileConfiguration] = new JsonFormat[bleep.nosbt.librarymanagement.FileConfiguration] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.FileConfiguration = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val isLocal = unbuilder.readField[Boolean]("isLocal")
      val isTransactional = unbuilder.readField[Option[Boolean]]("isTransactional")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.FileConfiguration(isLocal, isTransactional)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.FileConfiguration, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("isLocal", obj.isLocal)
    builder.addField("isTransactional", obj.isTransactional)
    builder.endObject()
  }
}
}
