/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait ArtifactTypeFilterFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val ArtifactTypeFilterFormat: JsonFormat[bleep.nosbt.librarymanagement.ArtifactTypeFilter] = new JsonFormat[bleep.nosbt.librarymanagement.ArtifactTypeFilter] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.ArtifactTypeFilter = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val types = unbuilder.readField[Set[String]]("types")
      val inverted = unbuilder.readField[Boolean]("inverted")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.ArtifactTypeFilter(types, inverted)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.ArtifactTypeFilter, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("types", obj.types)
    builder.addField("inverted", obj.inverted)
    builder.endObject()
  }
}
}
