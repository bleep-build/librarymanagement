/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait ConfigurationReportLiteFormats { self: bleep.nosbt.librarymanagement.OrganizationArtifactReportFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val ConfigurationReportLiteFormat: JsonFormat[bleep.nosbt.internal.librarymanagement.ConfigurationReportLite] = new JsonFormat[bleep.nosbt.internal.librarymanagement.ConfigurationReportLite] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.internal.librarymanagement.ConfigurationReportLite = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val configuration = unbuilder.readField[String]("configuration")
      val details = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.OrganizationArtifactReport]]("details")
      unbuilder.endObject()
      bleep.nosbt.internal.librarymanagement.ConfigurationReportLite(configuration, details)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.internal.librarymanagement.ConfigurationReportLite, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("configuration", obj.configuration)
    builder.addField("details", obj.details)
    builder.endObject()
  }
}
}
