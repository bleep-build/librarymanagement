/** This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
  */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement

import _root_.sjsonnew.JsonFormat
trait ResolverFormats {
  self: sjsonnew.BasicJsonProtocol & bleep.nosbt.librarymanagement.ChainedResolverFormats & bleep.nosbt.librarymanagement.MavenRepoFormats &
    bleep.nosbt.librarymanagement.MavenCacheFormats & bleep.nosbt.librarymanagement.PatternsFormats & bleep.nosbt.librarymanagement.FileConfigurationFormats &
    bleep.nosbt.librarymanagement.FileRepositoryFormats & bleep.nosbt.librarymanagement.URLRepositoryFormats &
    bleep.nosbt.librarymanagement.SshConnectionFormats & bleep.nosbt.librarymanagement.SshRepositoryFormats &
    bleep.nosbt.librarymanagement.SftpRepositoryFormats =>
  implicit lazy val ResolverFormat: JsonFormat[bleep.nosbt.librarymanagement.Resolver] = flatUnionFormat7[
    bleep.nosbt.librarymanagement.Resolver,
    bleep.nosbt.librarymanagement.ChainedResolver,
    bleep.nosbt.librarymanagement.MavenRepo,
    bleep.nosbt.librarymanagement.MavenCache,
    bleep.nosbt.librarymanagement.FileRepository,
    bleep.nosbt.librarymanagement.URLRepository,
    bleep.nosbt.librarymanagement.SshRepository,
    bleep.nosbt.librarymanagement.SftpRepository
  ]("type")
}
