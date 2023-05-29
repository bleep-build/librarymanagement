/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
final class ChainedResolver private (
  name: String,
  val resolvers: Vector[bleep.nosbt.librarymanagement.Resolver]) extends bleep.nosbt.librarymanagement.Resolver(name) with Serializable {
  private[nosbt] override def validateProtocol(logger: bleep.nosbt.util.Logger): Boolean = !resolvers.forall(!_.validateProtocol(logger))
  
  
  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: ChainedResolver => (this.name == x.name) && (this.resolvers == x.resolvers)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (17 + "bleep.nosbt.librarymanagement.ChainedResolver".##) + name.##) + resolvers.##)
  }
  override def toString: String = {
    "ChainedResolver(" + name + ", " + resolvers + ")"
  }
  private[this] def copy(name: String = name, resolvers: Vector[bleep.nosbt.librarymanagement.Resolver] = resolvers): ChainedResolver = {
    new ChainedResolver(name, resolvers)
  }
  def withName(name: String): ChainedResolver = {
    copy(name = name)
  }
  def withResolvers(resolvers: Vector[bleep.nosbt.librarymanagement.Resolver]): ChainedResolver = {
    copy(resolvers = resolvers)
  }
}
object ChainedResolver {
  
  def apply(name: String, resolvers: Vector[bleep.nosbt.librarymanagement.Resolver]): ChainedResolver = new ChainedResolver(name, resolvers)
}
