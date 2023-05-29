/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
/** sbt interface for an Ivy ssh-based repository (ssh and sftp).  Requires the Jsch library.. */
abstract class SshBasedRepository(
  name: String,
  patterns: bleep.nosbt.librarymanagement.Patterns,
  val connection: bleep.nosbt.librarymanagement.SshConnection) extends bleep.nosbt.librarymanagement.PatternsBasedRepository(name, patterns) with bleep.nosbt.librarymanagement.SshBasedRepositoryExtra with Serializable {
  
  
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: SshBasedRepository => (this.name == x.name) && (this.patterns == x.patterns) && (this.connection == x.connection)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.SshBasedRepository".##) + name.##) + patterns.##) + connection.##)
  }
  override def toString: String = {
    "SshBasedRepository(" + name + ", " + patterns + ", " + connection + ")"
  }
}
object SshBasedRepository {
  
}
