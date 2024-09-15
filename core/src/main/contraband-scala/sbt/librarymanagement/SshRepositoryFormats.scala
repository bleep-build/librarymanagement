/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait SshRepositoryFormats { self: bleep.nosbt.librarymanagement.PatternsFormats with bleep.nosbt.librarymanagement.SshConnectionFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val SshRepositoryFormat: JsonFormat[bleep.nosbt.librarymanagement.SshRepository] = new JsonFormat[bleep.nosbt.librarymanagement.SshRepository] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.SshRepository = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val name = unbuilder.readField[String]("name")
      val patterns = unbuilder.readField[bleep.nosbt.librarymanagement.Patterns]("patterns")
      val connection = unbuilder.readField[bleep.nosbt.librarymanagement.SshConnection]("connection")
      val publishPermissions = unbuilder.readField[Option[String]]("publishPermissions")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.SshRepository(name, patterns, connection, publishPermissions)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.SshRepository, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("name", obj.name)
    builder.addField("patterns", obj.patterns)
    builder.addField("connection", obj.connection)
    builder.addField("publishPermissions", obj.publishPermissions)
    builder.endObject()
  }
}
}
