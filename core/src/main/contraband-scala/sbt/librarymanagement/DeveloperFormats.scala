/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait DeveloperFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val DeveloperFormat: JsonFormat[bleep.nosbt.librarymanagement.Developer] = new JsonFormat[bleep.nosbt.librarymanagement.Developer] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.Developer = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val id = unbuilder.readField[String]("id")
      val name = unbuilder.readField[String]("name")
      val email = unbuilder.readField[String]("email")
      val url = unbuilder.readField[java.net.URL]("url")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.Developer(id, name, email, url)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.Developer, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("id", obj.id)
    builder.addField("name", obj.name)
    builder.addField("email", obj.email)
    builder.addField("url", obj.url)
    builder.endObject()
  }
}
}
