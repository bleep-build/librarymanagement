package bleep.nosbt
package internal.librarymanagement

import java.io.File
import bleep.nosbt.librarymanagement._

/**
 * This is a list of functions with default values.
 */
object InternalDefaults {
  val modulePrefixTemp = "temp-module-"

  def getArtifactTypeFilter(opt: Option[ArtifactTypeFilter]): ArtifactTypeFilter =
    opt.getOrElse(Artifact.defaultArtifactTypeFilter)

  def defaultRetrieveDirectory: File =
    (new File(".")).getAbsoluteFile / "lib_managed"

  def getRetrieveDirectory(opt: Option[File]): File =
    opt.getOrElse(defaultRetrieveDirectory)

  def getRetrievePattern(opt: Option[String]): String =
    opt.getOrElse(Resolver.defaultRetrievePattern)

  def getDeliverStatus(opt: Option[String]): String =
    opt.getOrElse("release")
}
