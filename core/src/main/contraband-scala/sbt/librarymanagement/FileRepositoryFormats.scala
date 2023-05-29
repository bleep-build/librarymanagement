/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait FileRepositoryFormats { self: bleep.nosbt.librarymanagement.PatternsFormats with bleep.nosbt.librarymanagement.FileConfigurationFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val FileRepositoryFormat: JsonFormat[bleep.nosbt.librarymanagement.FileRepository] = new JsonFormat[bleep.nosbt.librarymanagement.FileRepository] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.FileRepository = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val name = unbuilder.readField[String]("name")
      val patterns = unbuilder.readField[bleep.nosbt.librarymanagement.Patterns]("patterns")
      val configuration = unbuilder.readField[bleep.nosbt.librarymanagement.FileConfiguration]("configuration")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.FileRepository(name, patterns, configuration)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.FileRepository, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("name", obj.name)
    builder.addField("patterns", obj.patterns)
    builder.addField("configuration", obj.configuration)
    builder.endObject()
  }
}
}
