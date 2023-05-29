/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait SshConnectionFormats { self: bleep.nosbt.librarymanagement.SshAuthenticationFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val SshConnectionFormat: JsonFormat[bleep.nosbt.librarymanagement.SshConnection] = new JsonFormat[bleep.nosbt.librarymanagement.SshConnection] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.SshConnection = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val authentication = unbuilder.readField[Option[bleep.nosbt.librarymanagement.SshAuthentication]]("authentication")
      val hostname = unbuilder.readField[Option[String]]("hostname")
      val port = unbuilder.readField[Option[Int]]("port")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.SshConnection(authentication, hostname, port)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.SshConnection, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("authentication", obj.authentication)
    builder.addField("hostname", obj.hostname)
    builder.addField("port", obj.port)
    builder.endObject()
  }
}
}
