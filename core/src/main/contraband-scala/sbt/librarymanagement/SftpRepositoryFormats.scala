/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait SftpRepositoryFormats { self: bleep.nosbt.librarymanagement.PatternsFormats with bleep.nosbt.librarymanagement.SshConnectionFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val SftpRepositoryFormat: JsonFormat[bleep.nosbt.librarymanagement.SftpRepository] = new JsonFormat[bleep.nosbt.librarymanagement.SftpRepository] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.SftpRepository = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val name = unbuilder.readField[String]("name")
      val patterns = unbuilder.readField[bleep.nosbt.librarymanagement.Patterns]("patterns")
      val connection = unbuilder.readField[bleep.nosbt.librarymanagement.SshConnection]("connection")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.SftpRepository(name, patterns, connection)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.SftpRepository, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("name", obj.name)
    builder.addField("patterns", obj.patterns)
    builder.addField("connection", obj.connection)
    builder.endObject()
  }
}
}
