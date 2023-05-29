/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
/** sbt interface for an Ivy repository over ssh.  More convenient construction is done using Resolver.ssh. */
final class SshRepository private (
  name: String,
  patterns: bleep.nosbt.librarymanagement.Patterns,
  connection: bleep.nosbt.librarymanagement.SshConnection,
  val publishPermissions: Option[String]) extends bleep.nosbt.librarymanagement.SshBasedRepository(name, patterns, connection) with bleep.nosbt.librarymanagement.SshRepositoryExtra with Serializable {
  def this(name: String, connection: bleep.nosbt.librarymanagement.SshConnection, patterns: bleep.nosbt.librarymanagement.Patterns, publishPermissions: Option[String]) =
  this(name, patterns, connection, publishPermissions)
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: SshRepository => (this.name == x.name) && (this.patterns == x.patterns) && (this.connection == x.connection) && (this.publishPermissions == x.publishPermissions)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.SshRepository".##) + name.##) + patterns.##) + connection.##) + publishPermissions.##)
  }
  override def toString: String = {
    "SshRepository(" + name + ", " + patterns + ", " + connection + ", " + publishPermissions + ")"
  }
  private[this] def copy(name: String = name, patterns: bleep.nosbt.librarymanagement.Patterns = patterns, connection: bleep.nosbt.librarymanagement.SshConnection = connection, publishPermissions: Option[String] = publishPermissions): SshRepository = {
    new SshRepository(name, patterns, connection, publishPermissions)
  }
  def withName(name: String): SshRepository = {
    copy(name = name)
  }
  def withPatterns(patterns: bleep.nosbt.librarymanagement.Patterns): SshRepository = {
    copy(patterns = patterns)
  }
  def withConnection(connection: bleep.nosbt.librarymanagement.SshConnection): SshRepository = {
    copy(connection = connection)
  }
  def withPublishPermissions(publishPermissions: Option[String]): SshRepository = {
    copy(publishPermissions = publishPermissions)
  }
  def withPublishPermissions(publishPermissions: String): SshRepository = {
    copy(publishPermissions = Option(publishPermissions))
  }
}
object SshRepository {
  def apply(name: String, connection: bleep.nosbt.librarymanagement.SshConnection, patterns: bleep.nosbt.librarymanagement.Patterns, publishPermissions: Option[String]) =
  new SshRepository(name, patterns, connection, publishPermissions)
  def apply(name: String, patterns: bleep.nosbt.librarymanagement.Patterns, connection: bleep.nosbt.librarymanagement.SshConnection, publishPermissions: Option[String]): SshRepository = new SshRepository(name, patterns, connection, publishPermissions)
  def apply(name: String, patterns: bleep.nosbt.librarymanagement.Patterns, connection: bleep.nosbt.librarymanagement.SshConnection, publishPermissions: String): SshRepository = new SshRepository(name, patterns, connection, Option(publishPermissions))
}
