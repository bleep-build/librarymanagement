/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.internal.librarymanagement
final class SemComparator private (
  val op: bleep.nosbt.internal.librarymanagement.SemSelOperator,
  val major: Option[Long],
  val minor: Option[Long],
  val patch: Option[Long],
  val tags: Seq[String]) extends bleep.nosbt.internal.librarymanagement.SemComparatorExtra with Serializable {
  def matches(version: bleep.nosbt.librarymanagement.VersionNumber): Boolean = this.matchesImpl(version)
  def expandWildcard: Seq[SemComparator] = {
      if (op == bleep.nosbt.internal.librarymanagement.SemSelOperator.Eq && !allFieldsSpecified) {
      Seq(
      this.withOp(bleep.nosbt.internal.librarymanagement.SemSelOperator.Gte),
      this.withOp(bleep.nosbt.internal.librarymanagement.SemSelOperator.Lte)
      )
    } else { Seq(this) }
  }


  override def equals(o: Any): Boolean = this.eq(o.asInstanceOf[AnyRef]) || (o match {
    case x: SemComparator => (this.op == x.op) && (this.major == x.major) && (this.minor == x.minor) && (this.patch == x.patch) && (this.tags == x.tags)
    case _ => false
  })
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (37 * (17 + "bleep.nosbt.internal.librarymanagement.SemComparator".##) + op.##) + major.##) + minor.##) + patch.##) + tags.##)
  }
  override def toString: String = {
    this.toStringImpl
  }
  private[this] def copy(op: bleep.nosbt.internal.librarymanagement.SemSelOperator = op, major: Option[Long] = major, minor: Option[Long] = minor, patch: Option[Long] = patch, tags: Seq[String] = tags): SemComparator = {
    new SemComparator(op, major, minor, patch, tags)
  }
  def withOp(op: bleep.nosbt.internal.librarymanagement.SemSelOperator): SemComparator = {
    copy(op = op)
  }
  def withMajor(major: Option[Long]): SemComparator = {
    copy(major = major)
  }
  def withMinor(minor: Option[Long]): SemComparator = {
    copy(minor = minor)
  }
  def withPatch(patch: Option[Long]): SemComparator = {
    copy(patch = patch)
  }
  def withTags(tags: Seq[String]): SemComparator = {
    copy(tags = tags)
  }
}
object SemComparator extends bleep.nosbt.internal.librarymanagement.SemComparatorFunctions {
  def apply(comparator: String): SemComparator = parse(comparator)
  def apply(op: bleep.nosbt.internal.librarymanagement.SemSelOperator, major: Option[Long], minor: Option[Long], patch: Option[Long], tags: Seq[String]): SemComparator = new SemComparator(op, major, minor, patch, tags)
}
