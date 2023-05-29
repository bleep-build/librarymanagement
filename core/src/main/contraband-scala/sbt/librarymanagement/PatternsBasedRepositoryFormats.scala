/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement

import _root_.sjsonnew.JsonFormat
trait PatternsBasedRepositoryFormats { self: bleep.nosbt.librarymanagement.PatternsFormats with bleep.nosbt.librarymanagement.FileConfigurationFormats with sjsonnew.BasicJsonProtocol with bleep.nosbt.librarymanagement.FileRepositoryFormats with bleep.nosbt.librarymanagement.URLRepositoryFormats with bleep.nosbt.librarymanagement.SshConnectionFormats with bleep.nosbt.librarymanagement.SshRepositoryFormats with bleep.nosbt.librarymanagement.SftpRepositoryFormats =>
implicit lazy val PatternsBasedRepositoryFormat: JsonFormat[bleep.nosbt.librarymanagement.PatternsBasedRepository] = flatUnionFormat4[bleep.nosbt.librarymanagement.PatternsBasedRepository, bleep.nosbt.librarymanagement.FileRepository, bleep.nosbt.librarymanagement.URLRepository, bleep.nosbt.librarymanagement.SshRepository, bleep.nosbt.librarymanagement.SftpRepository]("type")
}
