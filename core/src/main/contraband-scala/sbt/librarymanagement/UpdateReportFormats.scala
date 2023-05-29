/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait UpdateReportFormats { self: bleep.nosbt.librarymanagement.ConfigurationReportFormats with bleep.nosbt.librarymanagement.UpdateStatsFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val UpdateReportFormat: JsonFormat[bleep.nosbt.librarymanagement.UpdateReport] = new JsonFormat[bleep.nosbt.librarymanagement.UpdateReport] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.UpdateReport = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val cachedDescriptor = unbuilder.readField[java.io.File]("cachedDescriptor")
      val configurations = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.ConfigurationReport]]("configurations")
      val stats = unbuilder.readField[bleep.nosbt.librarymanagement.UpdateStats]("stats")
      val stamps = unbuilder.readField[Map[java.io.File, Long]]("stamps")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.UpdateReport(cachedDescriptor, configurations, stats, stamps)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.UpdateReport, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("cachedDescriptor", obj.cachedDescriptor)
    builder.addField("configurations", obj.configurations)
    builder.addField("stats", obj.stats)
    builder.addField("stamps", obj.stamps)
    builder.endObject()
  }
}
}
