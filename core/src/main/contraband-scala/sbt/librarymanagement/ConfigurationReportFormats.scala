/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait ConfigurationReportFormats { self: bleep.nosbt.librarymanagement.ConfigRefFormats with bleep.nosbt.librarymanagement.ModuleReportFormats with bleep.nosbt.librarymanagement.OrganizationArtifactReportFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val ConfigurationReportFormat: JsonFormat[bleep.nosbt.librarymanagement.ConfigurationReport] = new JsonFormat[bleep.nosbt.librarymanagement.ConfigurationReport] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.ConfigurationReport = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val configuration = unbuilder.readField[bleep.nosbt.librarymanagement.ConfigRef]("configuration")
      val modules = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.ModuleReport]]("modules")
      val details = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.OrganizationArtifactReport]]("details")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.ConfigurationReport(configuration, modules, details)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.ConfigurationReport, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("configuration", obj.configuration)
    builder.addField("modules", obj.modules)
    builder.addField("details", obj.details)
    builder.endObject()
  }
}
}
