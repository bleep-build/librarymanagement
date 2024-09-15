/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait CallerFormats { self: bleep.nosbt.librarymanagement.ModuleIDFormats with bleep.nosbt.librarymanagement.ConfigRefFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val CallerFormat: JsonFormat[bleep.nosbt.librarymanagement.Caller] = new JsonFormat[bleep.nosbt.librarymanagement.Caller] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.Caller = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val caller = unbuilder.readField[bleep.nosbt.librarymanagement.ModuleID]("caller")
      val callerConfigurations = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.ConfigRef]]("callerConfigurations")
      val callerExtraAttributes = unbuilder.readField[Map[String, String]]("callerExtraAttributes")
      val isForceDependency = unbuilder.readField[Boolean]("isForceDependency")
      val isChangingDependency = unbuilder.readField[Boolean]("isChangingDependency")
      val isTransitiveDependency = unbuilder.readField[Boolean]("isTransitiveDependency")
      val isDirectlyForceDependency = unbuilder.readField[Boolean]("isDirectlyForceDependency")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.Caller(caller, callerConfigurations, callerExtraAttributes, isForceDependency, isChangingDependency, isTransitiveDependency, isDirectlyForceDependency)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.Caller, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("caller", obj.caller)
    builder.addField("callerConfigurations", obj.callerConfigurations)
    builder.addField("callerExtraAttributes", obj.callerExtraAttributes)
    builder.addField("isForceDependency", obj.isForceDependency)
    builder.addField("isChangingDependency", obj.isChangingDependency)
    builder.addField("isTransitiveDependency", obj.isTransitiveDependency)
    builder.addField("isDirectlyForceDependency", obj.isDirectlyForceDependency)
    builder.endObject()
  }
}
}
