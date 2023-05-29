/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
/** sbt interface to an Ivy repository based on patterns, which is most Ivy repositories. */
abstract class PatternsBasedRepository(
  name: String,
  val patterns: bleep.nosbt.librarymanagement.Patterns) extends bleep.nosbt.librarymanagement.Resolver(name) with Serializable {
  
  
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: PatternsBasedRepository => (this.name == x.name) && (this.patterns == x.patterns)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.PatternsBasedRepository".##) + name.##) + patterns.##)
  }
  override def toString: String = {
    "PatternsBasedRepository(" + name + ", " + patterns + ")"
  }
}
object PatternsBasedRepository {
  
}
