/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait MavenRepoFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val MavenRepoFormat: JsonFormat[bleep.nosbt.librarymanagement.MavenRepo] = new JsonFormat[bleep.nosbt.librarymanagement.MavenRepo] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.MavenRepo = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val name = unbuilder.readField[String]("name")
      val root = unbuilder.readField[String]("root")
      val localIfFile = unbuilder.readField[Boolean]("localIfFile")
      val _allowInsecureProtocol = unbuilder.readField[Boolean]("_allowInsecureProtocol")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.MavenRepo(name, root, localIfFile, _allowInsecureProtocol)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.MavenRepo, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("name", obj.name)
    builder.addField("root", obj.root)
    builder.addField("localIfFile", obj.localIfFile)
    builder.addField("_allowInsecureProtocol", obj._allowInsecureProtocol)
    builder.endObject()
  }
}
}
