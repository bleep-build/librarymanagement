/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait UpdateStatsFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val UpdateStatsFormat: JsonFormat[bleep.nosbt.librarymanagement.UpdateStats] = new JsonFormat[bleep.nosbt.librarymanagement.UpdateStats] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.UpdateStats = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val resolveTime = unbuilder.readField[Long]("resolveTime")
      val downloadTime = unbuilder.readField[Long]("downloadTime")
      val downloadSize = unbuilder.readField[Long]("downloadSize")
      val cached = unbuilder.readField[Boolean]("cached")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.UpdateStats(resolveTime, downloadTime, downloadSize, cached)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.UpdateStats, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("resolveTime", obj.resolveTime)
    builder.addField("downloadTime", obj.downloadTime)
    builder.addField("downloadSize", obj.downloadSize)
    builder.addField("cached", obj.cached)
    builder.endObject()
  }
}
}
