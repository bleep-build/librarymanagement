/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement

import _root_.sjsonnew.JsonFormat
trait MavenRepositoryFormats { self: sjsonnew.BasicJsonProtocol with bleep.nosbt.librarymanagement.MavenRepoFormats with bleep.nosbt.librarymanagement.MavenCacheFormats =>
implicit lazy val MavenRepositoryFormat: JsonFormat[bleep.nosbt.librarymanagement.MavenRepository] = flatUnionFormat2[bleep.nosbt.librarymanagement.MavenRepository, bleep.nosbt.librarymanagement.MavenRepo, bleep.nosbt.librarymanagement.MavenCache]("type")
}
