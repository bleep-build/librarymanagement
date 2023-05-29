/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait URLRepositoryFormats { self: bleep.nosbt.librarymanagement.PatternsFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val URLRepositoryFormat: JsonFormat[bleep.nosbt.librarymanagement.URLRepository] = new JsonFormat[bleep.nosbt.librarymanagement.URLRepository] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.URLRepository = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val name = unbuilder.readField[String]("name")
      val patterns = unbuilder.readField[bleep.nosbt.librarymanagement.Patterns]("patterns")
      val allowInsecureProtocol = unbuilder.readField[Boolean]("allowInsecureProtocol")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.URLRepository(name, patterns, allowInsecureProtocol)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.URLRepository, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("name", obj.name)
    builder.addField("patterns", obj.patterns)
    builder.addField("allowInsecureProtocol", obj.allowInsecureProtocol)
    builder.endObject()
  }
}
}
