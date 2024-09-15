/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait GetClassifiersConfigurationFormats { self: bleep.nosbt.librarymanagement.GetClassifiersModuleFormats with bleep.nosbt.librarymanagement.ModuleIDFormats with bleep.nosbt.librarymanagement.ConfigRefFormats with bleep.nosbt.librarymanagement.UpdateConfigurationFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val GetClassifiersConfigurationFormat: JsonFormat[bleep.nosbt.librarymanagement.GetClassifiersConfiguration] = new JsonFormat[bleep.nosbt.librarymanagement.GetClassifiersConfiguration] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.GetClassifiersConfiguration = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val module = unbuilder.readField[bleep.nosbt.librarymanagement.GetClassifiersModule]("module")
      val excludes = unbuilder.readField[Vector[scala.Tuple2[bleep.nosbt.librarymanagement.ModuleID, scala.Vector[bleep.nosbt.librarymanagement.ConfigRef]]]]("excludes")
      val updateConfiguration = unbuilder.readField[bleep.nosbt.librarymanagement.UpdateConfiguration]("updateConfiguration")
      val sourceArtifactTypes = unbuilder.readField[Vector[String]]("sourceArtifactTypes")
      val docArtifactTypes = unbuilder.readField[Vector[String]]("docArtifactTypes")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.GetClassifiersConfiguration(module, excludes, updateConfiguration, sourceArtifactTypes, docArtifactTypes)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.GetClassifiersConfiguration, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("module", obj.module)
    builder.addField("excludes", obj.excludes)
    builder.addField("updateConfiguration", obj.updateConfiguration)
    builder.addField("sourceArtifactTypes", obj.sourceArtifactTypes)
    builder.addField("docArtifactTypes", obj.docArtifactTypes)
    builder.endObject()
  }
}
}
