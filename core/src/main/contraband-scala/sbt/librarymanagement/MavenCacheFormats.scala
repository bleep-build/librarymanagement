/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{ Unbuilder, Builder, JsonFormat, deserializationError }
trait MavenCacheFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val MavenCacheFormat: JsonFormat[bleep.nosbt.librarymanagement.MavenCache] = new JsonFormat[bleep.nosbt.librarymanagement.MavenCache] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.MavenCache = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val name = unbuilder.readField[String]("name")
      val root = unbuilder.readField[String]("root")
      val localIfFile = unbuilder.readField[Boolean]("localIfFile")
      val rootFile = unbuilder.readField[java.io.File]("rootFile")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.MavenCache(name, root, localIfFile, rootFile)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.MavenCache, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("name", obj.name)
    builder.addField("root", obj.root)
    builder.addField("localIfFile", obj.localIfFile)
    builder.addField("rootFile", obj.rootFile)
    builder.endObject()
  }
}
}
