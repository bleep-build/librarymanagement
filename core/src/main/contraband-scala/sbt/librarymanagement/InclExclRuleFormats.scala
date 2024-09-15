/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait InclExclRuleFormats { self: bleep.nosbt.librarymanagement.ConfigRefFormats with bleep.nosbt.librarymanagement.CrossVersionFormats with bleep.nosbt.librarymanagement.DisabledFormats with bleep.nosbt.librarymanagement.BinaryFormats with bleep.nosbt.librarymanagement.ConstantFormats with bleep.nosbt.librarymanagement.PatchFormats with bleep.nosbt.librarymanagement.FullFormats with bleep.nosbt.librarymanagement.For3Use2_13Formats with bleep.nosbt.librarymanagement.For2_13Use3Formats with sjsonnew.BasicJsonProtocol =>
implicit lazy val InclExclRuleFormat: JsonFormat[bleep.nosbt.librarymanagement.InclExclRule] = new JsonFormat[bleep.nosbt.librarymanagement.InclExclRule] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.InclExclRule = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val organization = unbuilder.readField[String]("organization")
      val name = unbuilder.readField[String]("name")
      val artifact = unbuilder.readField[String]("artifact")
      val configurations = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.ConfigRef]]("configurations")
      val crossVersion = unbuilder.readField[bleep.nosbt.librarymanagement.CrossVersion]("crossVersion")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.InclExclRule(organization, name, artifact, configurations, crossVersion)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.InclExclRule, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("organization", obj.organization)
    builder.addField("name", obj.name)
    builder.addField("artifact", obj.artifact)
    builder.addField("configurations", obj.configurations)
    builder.addField("crossVersion", obj.crossVersion)
    builder.endObject()
  }
}
}
