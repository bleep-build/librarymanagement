/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
final class URLRepository private (
  name: String,
  patterns: bleep.nosbt.librarymanagement.Patterns,
  val allowInsecureProtocol: Boolean) extends bleep.nosbt.librarymanagement.PatternsBasedRepository(name, patterns) with Serializable {
  private[nosbt] override def validateProtocol(logger: bleep.nosbt.util.Logger): Boolean = Resolver.validateURLRepository(this, logger)
  private def this(name: String, patterns: bleep.nosbt.librarymanagement.Patterns) = this(name, patterns, false)
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: URLRepository => (this.name == x.name) && (this.patterns == x.patterns) && (this.allowInsecureProtocol == x.allowInsecureProtocol)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.URLRepository".##) + name.##) + patterns.##) + allowInsecureProtocol.##)
  }
  override def toString: String = {
    "URLRepository(" + name + ", " + patterns + ", " + allowInsecureProtocol + ")"
  }
  private[this] def copy(name: String = name, patterns: bleep.nosbt.librarymanagement.Patterns = patterns, allowInsecureProtocol: Boolean = allowInsecureProtocol): URLRepository = {
    new URLRepository(name, patterns, allowInsecureProtocol)
  }
  def withName(name: String): URLRepository = {
    copy(name = name)
  }
  def withPatterns(patterns: bleep.nosbt.librarymanagement.Patterns): URLRepository = {
    copy(patterns = patterns)
  }
  def withAllowInsecureProtocol(allowInsecureProtocol: Boolean): URLRepository = {
    copy(allowInsecureProtocol = allowInsecureProtocol)
  }
}
object URLRepository {
  
  def apply(name: String, patterns: bleep.nosbt.librarymanagement.Patterns): URLRepository = new URLRepository(name, patterns)
  def apply(name: String, patterns: bleep.nosbt.librarymanagement.Patterns, allowInsecureProtocol: Boolean): URLRepository = new URLRepository(name, patterns, allowInsecureProtocol)
}
