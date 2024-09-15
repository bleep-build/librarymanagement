/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait ModuleInfoFormats { self: bleep.nosbt.librarymanagement.ScmInfoFormats with bleep.nosbt.librarymanagement.DeveloperFormats with sjsonnew.BasicJsonProtocol =>
implicit lazy val ModuleInfoFormat: JsonFormat[bleep.nosbt.librarymanagement.ModuleInfo] = new JsonFormat[bleep.nosbt.librarymanagement.ModuleInfo] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.ModuleInfo = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.beginObject(__js)
      val nameFormal = unbuilder.readField[String]("nameFormal")
      val description = unbuilder.readField[String]("description")
      val homepage = unbuilder.readField[Option[java.net.URL]]("homepage")
      val startYear = unbuilder.readField[Option[Int]]("startYear")
      val licenses = unbuilder.readField[Vector[scala.Tuple2[String, java.net.URL]]]("licenses")
      val organizationName = unbuilder.readField[String]("organizationName")
      val organizationHomepage = unbuilder.readField[Option[java.net.URL]]("organizationHomepage")
      val scmInfo = unbuilder.readField[Option[bleep.nosbt.librarymanagement.ScmInfo]]("scmInfo")
      val developers = unbuilder.readField[Vector[bleep.nosbt.librarymanagement.Developer]]("developers")
      unbuilder.endObject()
      bleep.nosbt.librarymanagement.ModuleInfo(nameFormal, description, homepage, startYear, licenses, organizationName, organizationHomepage, scmInfo, developers)
      case None =>
      deserializationError("Expected JsObject but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.ModuleInfo, builder: Builder[J]): Unit = {
    builder.beginObject()
    builder.addField("nameFormal", obj.nameFormal)
    builder.addField("description", obj.description)
    builder.addField("homepage", obj.homepage)
    builder.addField("startYear", obj.startYear)
    builder.addField("licenses", obj.licenses)
    builder.addField("organizationName", obj.organizationName)
    builder.addField("organizationHomepage", obj.organizationHomepage)
    builder.addField("scmInfo", obj.scmInfo)
    builder.addField("developers", obj.developers)
    builder.endObject()
  }
}
}
