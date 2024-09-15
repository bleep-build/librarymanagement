/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait ChecksumFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val ChecksumFormat: JsonFormat[bleep.nosbt.librarymanagement.Checksum] = new JsonFormat[bleep.nosbt.librarymanagement.Checksum] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.Checksum = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val digest = unbuilder.readField[String]("digest")
      val `type` = unbuilder.readField[String]("type")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.Checksum(digest, `type`)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.Checksum, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("digest", obj.digest)
    builder.addField("type", obj.`type`)
    builder.endObject()
  }
}
}
