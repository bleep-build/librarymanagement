/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
/** sbt interface for an Ivy repository over sftp.  More convenient construction is done using Resolver.sftp. */
final class SftpRepository private (
  name: String,
  patterns: bleep.nosbt.librarymanagement.Patterns,
  connection: bleep.nosbt.librarymanagement.SshConnection) extends bleep.nosbt.librarymanagement.SshBasedRepository(name, patterns, connection) with bleep.nosbt.librarymanagement.SftpRepositoryExtra with Serializable {
  def this(name: String, connection: bleep.nosbt.librarymanagement.SshConnection, patterns: bleep.nosbt.librarymanagement.Patterns) =
  this(name, patterns, connection)
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: SftpRepository => (this.name == x.name) && (this.patterns == x.patterns) && (this.connection == x.connection)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.SftpRepository".##) + name.##) + patterns.##) + connection.##)
  }
  override def toString: String = {
    "SftpRepository(" + name + ", " + patterns + ", " + connection + ")"
  }
  private[this] def copy(name: String = name, patterns: bleep.nosbt.librarymanagement.Patterns = patterns, connection: bleep.nosbt.librarymanagement.SshConnection = connection): SftpRepository = {
    new SftpRepository(name, patterns, connection)
  }
  def withName(name: String): SftpRepository = {
    copy(name = name)
  }
  def withPatterns(patterns: bleep.nosbt.librarymanagement.Patterns): SftpRepository = {
    copy(patterns = patterns)
  }
  def withConnection(connection: bleep.nosbt.librarymanagement.SshConnection): SftpRepository = {
    copy(connection = connection)
  }
}
object SftpRepository {
  def apply(name: String, connection: bleep.nosbt.librarymanagement.SshConnection, patterns: bleep.nosbt.librarymanagement.Patterns) =
  new SftpRepository(name, patterns, connection)
  def apply(name: String, patterns: bleep.nosbt.librarymanagement.Patterns, connection: bleep.nosbt.librarymanagement.SshConnection): SftpRepository = new SftpRepository(name, patterns, connection)
}
