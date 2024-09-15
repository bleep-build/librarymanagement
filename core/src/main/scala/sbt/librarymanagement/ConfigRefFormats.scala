/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */
package bleep.nosbt.librarymanagement

import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}

trait ConfigRefFormats { self: sjsonnew.BasicJsonProtocol =>
  implicit lazy val ConfigRefFormat: JsonFormat[bleep.nosbt.librarymanagement.ConfigRef] =
    new JsonFormat[bleep.nosbt.librarymanagement.ConfigRef] {
      override def read[J](
          __jsOpt: Option[J],
          unbuilder: Unbuilder[J]
      ): bleep.nosbt.librarymanagement.ConfigRef = {
        __jsOpt match {
          case Some(__js) =>
            unbuilder.beginObject(__js)
            val name = unbuilder.readField[String]("name")
            unbuilder.endObject()
            bleep.nosbt.librarymanagement.ConfigRef(name)
          case None =>
            deserializationError("Expected JsObject but found None")
        }
      }
      override def write[J](obj: bleep.nosbt.librarymanagement.ConfigRef, builder: Builder[J]): Unit = {
        builder.beginObject()
        builder.addField("name", obj.name)
        builder.endObject()
      }
    }
}
