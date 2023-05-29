/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
/** sbt interface for an Ivy filesystem repository.  More convenient construction is done using Resolver.file. */
final class FileRepository private (
  name: String,
  patterns: bleep.nosbt.librarymanagement.Patterns,
  val configuration: bleep.nosbt.librarymanagement.FileConfiguration) extends bleep.nosbt.librarymanagement.PatternsBasedRepository(name, patterns) with Serializable {
  def this(name: String, configuration: bleep.nosbt.librarymanagement.FileConfiguration, patterns: bleep.nosbt.librarymanagement.Patterns) =
  this(name, patterns, configuration)
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: FileRepository => (this.name == x.name) && (this.patterns == x.patterns) && (this.configuration == x.configuration)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.FileRepository".##) + name.##) + patterns.##) + configuration.##)
  }
  override def toString: String = {
    "FileRepository(" + name + ", " + patterns + ", " + configuration + ")"
  }
  private[this] def copy(name: String = name, patterns: bleep.nosbt.librarymanagement.Patterns = patterns, configuration: bleep.nosbt.librarymanagement.FileConfiguration = configuration): FileRepository = {
    new FileRepository(name, patterns, configuration)
  }
  def withName(name: String): FileRepository = {
    copy(name = name)
  }
  def withPatterns(patterns: bleep.nosbt.librarymanagement.Patterns): FileRepository = {
    copy(patterns = patterns)
  }
  def withConfiguration(configuration: bleep.nosbt.librarymanagement.FileConfiguration): FileRepository = {
    copy(configuration = configuration)
  }
}
object FileRepository {
  def apply(name: String, configuration: bleep.nosbt.librarymanagement.FileConfiguration, patterns: bleep.nosbt.librarymanagement.Patterns) =
  new FileRepository(name, patterns, configuration)
  def apply(name: String, patterns: bleep.nosbt.librarymanagement.Patterns, configuration: bleep.nosbt.librarymanagement.FileConfiguration): FileRepository = new FileRepository(name, patterns, configuration)
}
