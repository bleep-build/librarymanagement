/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait GetClassifiersModuleFormats { self: bleep.nosbt.librarymanagement.ModuleIDFormats with bleep.nosbt.librarymanagement.ScalaModuleInfoFormats with bleep.nosbt.librarymanagement.ConfigurationFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val GetClassifiersModuleFormat: JsonFormat[bleep.nosbt.librarymanagement.GetClassifiersModule] = new JsonFormat[bleep.nosbt.librarymanagement.GetClassifiersModule] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.GetClassifiersModule = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val id = unbuilder.readField[bleep.nosbt.librarymanagement.ModuleID]("id")
      val scalaModuleInfo = unbuilder.readField[Option[bleep.nosbt.librarymanagement.ScalaModuleInfo]]("scalaModuleInfo")
      val dependencies = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.ModuleID]]("dependencies")
      val configurations = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.Configuration]]("configurations")
      val classifiers = unbuilder.readField[Vector[String]]("classifiers")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.GetClassifiersModule(id, scalaModuleInfo, dependencies, configurations, classifiers)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.GetClassifiersModule, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("id", obj.id)
    builder.addField("scalaModuleInfo", obj.scalaModuleInfo)
    builder.addField("dependencies", obj.dependencies)
    builder.addField("configurations", obj.configurations)
    builder.addField("classifiers", obj.classifiers)
    builder.endObject()
  }
}
}
