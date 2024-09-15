/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait ScalaModuleInfoFormats { self: bleep.nosbt.librarymanagement.ConfigurationFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val ScalaModuleInfoFormat: JsonFormat[bleep.nosbt.librarymanagement.ScalaModuleInfo] = new JsonFormat[bleep.nosbt.librarymanagement.ScalaModuleInfo] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.ScalaModuleInfo = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val scalaFullVersion = unbuilder.readField[String]("scalaFullVersion")
      val scalaBinaryVersion = unbuilder.readField[String]("scalaBinaryVersion")
      val configurations = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.Configuration]]("configurations")
      val checkExplicit = unbuilder.readField[Boolean]("checkExplicit")
      val filterImplicit = unbuilder.readField[Boolean]("filterImplicit")
      val overrideScalaVersion = unbuilder.readField[Boolean]("overrideScalaVersion")
      val scalaOrganization = unbuilder.readField[String]("scalaOrganization")
      val scalaArtifacts = unbuilder.readField[scala.Vector[String]]("scalaArtifacts")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.ScalaModuleInfo(scalaFullVersion, scalaBinaryVersion, configurations, checkExplicit, filterImplicit, overrideScalaVersion, scalaOrganization, scalaArtifacts)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.ScalaModuleInfo, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("scalaFullVersion", obj.scalaFullVersion)
    builder.addField("scalaBinaryVersion", obj.scalaBinaryVersion)
    builder.addField("configurations", obj.configurations)
    builder.addField("checkExplicit", obj.checkExplicit)
    builder.addField("filterImplicit", obj.filterImplicit)
    builder.addField("overrideScalaVersion", obj.overrideScalaVersion)
    builder.addField("scalaOrganization", obj.scalaOrganization)
    builder.addField("scalaArtifacts", obj.scalaArtifacts)
    builder.endObject()
  }
}
}
