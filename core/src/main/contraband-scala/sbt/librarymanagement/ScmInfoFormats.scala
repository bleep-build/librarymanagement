/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait ScmInfoFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val ScmInfoFormat: JsonFormat[bleep.nosbt.librarymanagement.ScmInfo] = new JsonFormat[bleep.nosbt.librarymanagement.ScmInfo] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.ScmInfo = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val browseUrl = unbuilder.readField[java.net.URL]("browseUrl")
      val connection = unbuilder.readField[String]("connection")
      val devConnection = unbuilder.readField[Option[String]]("devConnection")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.ScmInfo(browseUrl, connection, devConnection)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.ScmInfo, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("browseUrl", obj.browseUrl)
    builder.addField("connection", obj.connection)
    builder.addField("devConnection", obj.devConnection)
    builder.endObject()
  }
}
}
