/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait ModuleReportFormats { self: bleep.nosbt.librarymanagement.ModuleIDFormats with bleep.nosbt.librarymanagement.ArtifactFormats with bleep.nosbt.librarymanagement.ConfigRefFormats with bleep.nosbt.librarymanagement.CallerFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val ModuleReportFormat: JsonFormat[bleep.nosbt.librarymanagement.ModuleReport] = new JsonFormat[bleep.nosbt.librarymanagement.ModuleReport] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.ModuleReport = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val module = unbuilder.readField[bleep.nosbt.librarymanagement.ModuleID]("module")
      val artifacts = unbuilder.readField[Vector[scala.Tuple2[bleep.nosbt.librarymanagement.Artifact, java.io.File]]]("artifacts")
      val missingArtifacts = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.Artifact]]("missingArtifacts")
      val status = unbuilder.readField[Option[String]]("status")
      val publicationDate = unbuilder.readField[Option[java.util.Calendar]]("publicationDate")
      val resolver = unbuilder.readField[Option[String]]("resolver")
      val artifactResolver = unbuilder.readField[Option[String]]("artifactResolver")
      val evicted = unbuilder.readField[Boolean]("evicted")
      val evictedData = unbuilder.readField[Option[String]]("evictedData")
      val evictedReason = unbuilder.readField[Option[String]]("evictedReason")
      val problem = unbuilder.readField[Option[String]]("problem")
      val homepage = unbuilder.readField[Option[String]]("homepage")
      val extraAttributes = unbuilder.readField[Map[String, String]]("extraAttributes")
      val isDefault = unbuilder.readField[Option[Boolean]]("isDefault")
      val branch = unbuilder.readField[Option[String]]("branch")
      val configurations = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.ConfigRef]]("configurations")
      val licenses = unbuilder.readField[Vector[scala.Tuple2[String, Option[String]]]]("licenses")
      val callers = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.Caller]]("callers")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.ModuleReport(module, artifacts, missingArtifacts, status, publicationDate, resolver, artifactResolver, evicted, evictedData, evictedReason, problem, homepage, extraAttributes, isDefault, branch, configurations, licenses, callers)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.ModuleReport, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("module", obj.module)
    builder.addField("artifacts", obj.artifacts)
    builder.addField("missingArtifacts", obj.missingArtifacts)
    builder.addField("status", obj.status)
    builder.addField("publicationDate", obj.publicationDate)
    builder.addField("resolver", obj.resolver)
    builder.addField("artifactResolver", obj.artifactResolver)
    builder.addField("evicted", obj.evicted)
    builder.addField("evictedData", obj.evictedData)
    builder.addField("evictedReason", obj.evictedReason)
    builder.addField("problem", obj.problem)
    builder.addField("homepage", obj.homepage)
    builder.addField("extraAttributes", obj.extraAttributes)
    builder.addField("isDefault", obj.isDefault)
    builder.addField("branch", obj.branch)
    builder.addField("configurations", obj.configurations)
    builder.addField("licenses", obj.licenses)
    builder.addField("callers", obj.callers)
    builder.endObject()
  }
}
}
