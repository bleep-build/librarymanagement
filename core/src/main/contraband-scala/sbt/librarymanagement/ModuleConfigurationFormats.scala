/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait ModuleConfigurationFormats { self: bleep.nosbt.librarymanagement.ResolverFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val ModuleConfigurationFormat: JsonFormat[bleep.nosbt.librarymanagement.ModuleConfiguration] = new JsonFormat[bleep.nosbt.librarymanagement.ModuleConfiguration] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.ModuleConfiguration = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val organization = unbuilder.readField[String]("organization")
      val name = unbuilder.readField[String]("name")
      val revision = unbuilder.readField[String]("revision")
      val resolver = unbuilder.readField[bleep.nosbt.librarymanagement.Resolver]("resolver")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.ModuleConfiguration(organization, name, revision, resolver)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.ModuleConfiguration, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("organization", obj.organization)
    builder.addField("name", obj.name)
    builder.addField("revision", obj.revision)
    builder.addField("resolver", obj.resolver)
    builder.endObject()
  }
}
}
