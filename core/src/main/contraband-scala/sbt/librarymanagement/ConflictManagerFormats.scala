/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait ConflictManagerFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val ConflictManagerFormat: JsonFormat[bleep.nosbt.librarymanagement.ConflictManager] = new JsonFormat[bleep.nosbt.librarymanagement.ConflictManager] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.ConflictManager = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val name = unbuilder.readField[String]("name")
      val organization = unbuilder.readField[String]("organization")
      val module = unbuilder.readField[String]("module")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.ConflictManager(name, organization, module)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.ConflictManager, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("name", obj.name)
    builder.addField("organization", obj.organization)
    builder.addField("module", obj.module)
    builder.endObject()
  }
}
}
