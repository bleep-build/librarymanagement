/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait KeyFileAuthenticationFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val KeyFileAuthenticationFormat: JsonFormat[bleep.nosbt.librarymanagement.KeyFileAuthentication] = new JsonFormat[bleep.nosbt.librarymanagement.KeyFileAuthentication] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.KeyFileAuthentication = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val user = unbuilder.readField[String]("user")
      val keyfile = unbuilder.readField[java.io.File]("keyfile")
      val password = unbuilder.readField[Option[String]]("password")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.KeyFileAuthentication(user, keyfile, password)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.KeyFileAuthentication, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("user", obj.user)
    builder.addField("keyfile", obj.keyfile)
    builder.addField("password", obj.password)
    builder.endObject()
  }
}
}
