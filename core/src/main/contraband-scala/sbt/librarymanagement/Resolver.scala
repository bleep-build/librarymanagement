/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
abstract class Resolver(
  val name: String) extends Serializable {
  /** check for HTTP */
  private[nosbt] def validateProtocol(logger: bleep.nosbt.util.Logger): Boolean = false
  
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: Resolver => (this.name == x.name)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (17 + "bleep.nosbt.librarymanagement.Resolver".##) + name.##)
  }
  override def toString: String = {
    "Resolver(" + name + ")"
  }
}
object Resolver extends bleep.nosbt.librarymanagement.ResolverFunctions {
  
}
