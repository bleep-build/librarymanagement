/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait UpdateReportLiteFormats { self: bleep.nosbt.librarymanagement.ConfigurationReportLiteFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val UpdateReportLiteFormat: JsonFormat[bleep.nosbt.internal.librarymanagement.UpdateReportLite] = new JsonFormat[bleep.nosbt.internal.librarymanagement.UpdateReportLite] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.internal.librarymanagement.UpdateReportLite = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val configurations = unbuilder.readField[Vector[bleep.nosbt.internal.librarymanagement.ConfigurationReportLite]]("configurations")
      unbuilder.endObject()
      bleep.nosbt.internal.librarymanagement.UpdateReportLite(configurations)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.internal.librarymanagement.UpdateReportLite, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("configurations", obj.configurations)
    builder.endObject()
  }
}
}
