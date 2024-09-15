/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait ModuleDescriptorConfigurationFormats { self: bleep.nosbt.librarymanagement.ScalaModuleInfoFormats with bleep.nosbt.librarymanagement.ModuleIDFormats with bleep.nosbt.librarymanagement.ModuleInfoFormats with bleep.nosbt.librarymanagement.InclExclRuleFormats with bleep.nosbt.internal.librarymanagement.formats.NodeSeqFormat with bleep.nosbt.librarymanagement.ConfigurationFormats with bleep.nosbt.librarymanagement.ConflictManagerFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val ModuleDescriptorConfigurationFormat: JsonFormat[bleep.nosbt.librarymanagement.ModuleDescriptorConfiguration] = new JsonFormat[bleep.nosbt.librarymanagement.ModuleDescriptorConfiguration] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.ModuleDescriptorConfiguration = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val validate = unbuilder.readField[Boolean]("validate")
      val scalaModuleInfo = unbuilder.readField[Option[bleep.nosbt.librarymanagement.ScalaModuleInfo]]("scalaModuleInfo")
      val module = unbuilder.readField[bleep.nosbt.librarymanagement.ModuleID]("module")
      val moduleInfo = unbuilder.readField[bleep.nosbt.librarymanagement.ModuleInfo]("moduleInfo")
      val dependencies = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.ModuleID]]("dependencies")
      val overrides = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.ModuleID]]("overrides")
      val excludes = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.InclExclRule]]("excludes")
      val ivyXML = unbuilder.readField[scala.xml.NodeSeq]("ivyXML")
      val configurations = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.Configuration]]("configurations")
      val defaultConfiguration = unbuilder.readField[Option[bleep.nosbt.librarymanagement.Configuration]]("defaultConfiguration")
      val conflictManager = unbuilder.readField[bleep.nosbt.librarymanagement.ConflictManager]("conflictManager")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.ModuleDescriptorConfiguration(validate, scalaModuleInfo, module, moduleInfo, dependencies, overrides, excludes, ivyXML, configurations, defaultConfiguration, conflictManager)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.ModuleDescriptorConfiguration, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("validate", obj.validate)
    builder.addField("scalaModuleInfo", obj.scalaModuleInfo)
    builder.addField("module", obj.module)
    builder.addField("moduleInfo", obj.moduleInfo)
    builder.addField("dependencies", obj.dependencies)
    builder.addField("overrides", obj.overrides)
    builder.addField("excludes", obj.excludes)
    builder.addField("ivyXML", obj.ivyXML)
    builder.addField("configurations", obj.configurations)
    builder.addField("defaultConfiguration", obj.defaultConfiguration)
    builder.addField("conflictManager", obj.conflictManager)
    builder.endObject()
  }
}
}
