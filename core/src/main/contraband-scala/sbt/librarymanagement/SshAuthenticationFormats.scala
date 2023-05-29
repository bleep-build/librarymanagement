/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement

import _root_.sjsonnew.JsonFormat
trait SshAuthenticationFormats { self: sjsonnew.BasicJsonProtocol with bleep.nosbt.librarymanagement.PasswordAuthenticationFormats with bleep.nosbt.librarymanagement.KeyFileAuthenticationFormats =>
implicit lazy val SshAuthenticationFormat: JsonFormat[bleep.nosbt.librarymanagement.SshAuthentication] = flatUnionFormat2[bleep.nosbt.librarymanagement.SshAuthentication, bleep.nosbt.librarymanagement.PasswordAuthentication, bleep.nosbt.librarymanagement.KeyFileAuthentication]("type")
}
