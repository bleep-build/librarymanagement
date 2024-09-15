/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait OrganizationArtifactReportFormats { self: bleep.nosbt.librarymanagement.ModuleReportFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val OrganizationArtifactReportFormat: JsonFormat[bleep.nosbt.librarymanagement.OrganizationArtifactReport] = new JsonFormat[bleep.nosbt.librarymanagement.OrganizationArtifactReport] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.OrganizationArtifactReport = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val organization = unbuilder.readField[String]("organization")
      val name = unbuilder.readField[String]("name")
      val modules = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.ModuleReport]]("modules")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.OrganizationArtifactReport(organization, name, modules)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.OrganizationArtifactReport, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("organization", obj.organization)
    builder.addField("name", obj.name)
    builder.addField("modules", obj.modules)
    builder.endObject()
  }
}
}
