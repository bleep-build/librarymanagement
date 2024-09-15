/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait ChainedResolverFormats { self: bleep.nosbt.librarymanagement.ResolverFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val ChainedResolverFormat: JsonFormat[bleep.nosbt.librarymanagement.ChainedResolver] = new JsonFormat[bleep.nosbt.librarymanagement.ChainedResolver] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.ChainedResolver = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val name = unbuilder.readField[String]("name")
      val resolvers = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.Resolver]]("resolvers")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.ChainedResolver(name, resolvers)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.ChainedResolver, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("name", obj.name)
    builder.addField("resolvers", obj.resolvers)
    builder.endObject()
  }
}
}
