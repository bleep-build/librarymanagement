/**
 * This code is generated using [[http://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */
package bleep.nosbt
package librarymanagement

import _root_.sjsonnew.{ deserializationError, Builder, JsonFormat, Unbuilder }

trait ConfigurationFormats {
  self: bleep.nosbt.librarymanagement.ConfigurationFormats with sjsonnew.BasicJsonProtocol =>
  implicit lazy val ConfigurationFormat: JsonFormat[bleep.nosbt.librarymanagement.Configuration] =
    new JsonFormat[bleep.nosbt.librarymanagement.Configuration] {
      override def read[J](
          jsOpt: Option[J],
          unbuilder: Unbuilder[J]
      ): bleep.nosbt.librarymanagement.Configuration = {
        jsOpt match {
          case Some(js) =>
            unbuilder.beginObject(js)
            val id = unbuilder.readField[String]("id")
            val name = unbuilder.readField[String]("name")
            val description = unbuilder.readField[String]("description")
            val isPublic = unbuilder.readField[Boolean]("isPublic")
            val extendsConfigs =
              unbuilder.readField[Vector[bleep.nosbt.librarymanagement.Configuration]]("extendsConfigs")
            val transitive = unbuilder.readField[Boolean]("transitive")
            unbuilder.endObject()
            new bleep.nosbt.librarymanagement.Configuration(
              id,
              name,
              description,
              isPublic,
              extendsConfigs,
              transitive
            )
          case None =>
            deserializationError("Expected JsObject but found None")
        }
      }
      override def write[J](obj: bleep.nosbt.librarymanagement.Configuration, builder: Builder[J]): Unit = {
        builder.beginObject()
        builder.addField("id", obj.id)
        builder.addField("name", obj.name)
        builder.addField("description", obj.description)
        builder.addField("isPublic", obj.isPublic)
        builder.addField("extendsConfigs", obj.extendsConfigs)
        builder.addField("transitive", obj.transitive)
        builder.endObject()
      }
    }
}
