/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement

import _root_.sjsonnew.JsonFormat
trait ResolverFormats { self: sjsonnew.BasicJsonProtocol with bleep.nosbt.librarymanagement.ChainedResolverFormats with bleep.nosbt.librarymanagement.MavenRepoFormats with bleep.nosbt.librarymanagement.MavenCacheFormats with bleep.nosbt.librarymanagement.PatternsFormats with bleep.nosbt.librarymanagement.FileConfigurationFormats with bleep.nosbt.librarymanagement.FileRepositoryFormats with bleep.nosbt.librarymanagement.URLRepositoryFormats with bleep.nosbt.librarymanagement.SshConnectionFormats with bleep.nosbt.librarymanagement.SshRepositoryFormats with bleep.nosbt.librarymanagement.SftpRepositoryFormats =>
implicit lazy val ResolverFormat: JsonFormat[bleep.nosbt.librarymanagement.Resolver] = flatUnionFormat7[bleep.nosbt.librarymanagement.Resolver, bleep.nosbt.librarymanagement.ChainedResolver, bleep.nosbt.librarymanagement.MavenRepo, bleep.nosbt.librarymanagement.MavenCache, bleep.nosbt.librarymanagement.FileRepository, bleep.nosbt.librarymanagement.URLRepository, bleep.nosbt.librarymanagement.SshRepository, bleep.nosbt.librarymanagement.SftpRepository]("type")
}
