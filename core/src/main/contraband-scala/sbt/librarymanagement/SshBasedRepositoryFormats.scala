/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement

import _root_.sjsonnew.JsonFormat
trait SshBasedRepositoryFormats { self: bleep.nosbt.librarymanagement.PatternsFormats with bleep.nosbt.librarymanagement.SshConnectionFormats with sjsonnew.BasicJsonProtocol with bleep.nosbt.librarymanagement.SshRepositoryFormats with bleep.nosbt.librarymanagement.SftpRepositoryFormats =>
implicit lazy val SshBasedRepositoryFormat: JsonFormat[bleep.nosbt.librarymanagement.SshBasedRepository] = flatUnionFormat2[bleep.nosbt.librarymanagement.SshBasedRepository, bleep.nosbt.librarymanagement.SshRepository, bleep.nosbt.librarymanagement.SftpRepository]("type")
}
