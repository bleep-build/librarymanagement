/** This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
  */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement

import _root_.sjsonnew.JsonFormat
trait PatternsBasedRepositoryFormats {
  self: bleep.nosbt.librarymanagement.PatternsFormats & bleep.nosbt.librarymanagement.FileConfigurationFormats & sjsonnew.BasicJsonProtocol &
    bleep.nosbt.librarymanagement.FileRepositoryFormats & bleep.nosbt.librarymanagement.URLRepositoryFormats &
    bleep.nosbt.librarymanagement.SshConnectionFormats & bleep.nosbt.librarymanagement.SshRepositoryFormats &
    bleep.nosbt.librarymanagement.SftpRepositoryFormats =>
  implicit lazy val PatternsBasedRepositoryFormat: JsonFormat[bleep.nosbt.librarymanagement.PatternsBasedRepository] = flatUnionFormat4[
    bleep.nosbt.librarymanagement.PatternsBasedRepository,
    bleep.nosbt.librarymanagement.FileRepository,
    bleep.nosbt.librarymanagement.URLRepository,
    bleep.nosbt.librarymanagement.SshRepository,
    bleep.nosbt.librarymanagement.SftpRepository
  ]("type")
}
