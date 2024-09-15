/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait PasswordAuthenticationFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val PasswordAuthenticationFormat: JsonFormat[bleep.nosbt.librarymanagement.PasswordAuthentication] = new JsonFormat[bleep.nosbt.librarymanagement.PasswordAuthentication] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.PasswordAuthentication = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val user = unbuilder.readField[String]("user")
      val password = unbuilder.readField[Option[String]]("password")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.PasswordAuthentication(user, password)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.PasswordAuthentication, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("user", obj.user)
    builder.addField("password", obj.password)
    builder.endObject()
  }
}
}
