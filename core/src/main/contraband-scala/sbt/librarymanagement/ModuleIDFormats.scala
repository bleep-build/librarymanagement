/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait ModuleIDFormats { self: bleep.nosbt.librarymanagement.ArtifactFormats with bleep.nosbt.librarymanagement.InclExclRuleFormats with bleep.nosbt.librarymanagement.CrossVersionFormats with bleep.nosbt.librarymanagement.DisabledFormats with bleep.nosbt.librarymanagement.BinaryFormats with bleep.nosbt.librarymanagement.ConstantFormats with bleep.nosbt.librarymanagement.PatchFormats with bleep.nosbt.librarymanagement.FullFormats with bleep.nosbt.librarymanagement.For3Use2_13Formats with bleep.nosbt.librarymanagement.For2_13Use3Formats with sjsonnew.BasicJsonProtocol =>
implicit lazy val ModuleIDFormat: JsonFormat[bleep.nosbt.librarymanagement.ModuleID] = new JsonFormat[bleep.nosbt.librarymanagement.ModuleID] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.ModuleID = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val organization = unbuilder.readField[String]("organization")
      val name = unbuilder.readField[String]("name")
      val revision = unbuilder.readField[String]("revision")
      val configurations = unbuilder.readField[Option[String]]("configurations")
      val isChanging = unbuilder.readField[Boolean]("isChanging")
      val isTransitive = unbuilder.readField[Boolean]("isTransitive")
      val isForce = unbuilder.readField[Boolean]("isForce")
      val explicitArtifacts = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.Artifact]]("explicitArtifacts")
      val inclusions = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.InclExclRule]]("inclusions")
      val exclusions = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.InclExclRule]]("exclusions")
      val extraAttributes = unbuilder.readField[Map[String, String]]("extraAttributes")
      val crossVersion = unbuilder.readField[bleep.nosbt.librarymanagement.CrossVersion]("crossVersion")
      val branchName = unbuilder.readField[Option[String]]("branchName")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.ModuleID(organization, name, revision, configurations, isChanging, isTransitive, isForce, explicitArtifacts, inclusions, exclusions, extraAttributes, crossVersion, branchName)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.ModuleID, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("organization", obj.organization)
    builder.addField("name", obj.name)
    builder.addField("revision", obj.revision)
    builder.addField("configurations", obj.configurations)
    builder.addField("isChanging", obj.isChanging)
    builder.addField("isTransitive", obj.isTransitive)
    builder.addField("isForce", obj.isForce)
    builder.addField("explicitArtifacts", obj.explicitArtifacts)
    builder.addField("inclusions", obj.inclusions)
    builder.addField("exclusions", obj.exclusions)
    builder.addField("extraAttributes", obj.extraAttributes)
    builder.addField("crossVersion", obj.crossVersion)
    builder.addField("branchName", obj.branchName)
    builder.endObject()
  }
}
}
