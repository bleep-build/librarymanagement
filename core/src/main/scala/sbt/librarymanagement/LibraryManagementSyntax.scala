package bleep.nosbt.librarymanagement

trait LibraryManagementSyntax0 {
}

trait LibraryManagementSyntax
    extends LibraryManagementSyntax0
    with DependencyBuilders{
  // See http://www.scala-lang.org/news/2.12.0#traits-compile-to-interfaces
  // Avoid defining fields (val or var, but a constant is ok – final val without result type)
  // Avoid calling super
  // Avoid initializer statements in the body

  type ExclusionRule = InclExclRule
  final val ExclusionRule = InclExclRule

  type InclusionRule = InclExclRule
  final val InclusionRule = InclExclRule

  import bleep.nosbt.librarymanagement.{ Configurations => C }
  final val Compile = C.Compile
  final val Test = C.Test
  final val Runtime = C.Runtime
  @deprecated("Create a separate subproject for testing instead", "1.9.0")
  final val IntegrationTest = C.IntegrationTest
  final val Default = C.Default
  final val Provided = C.Provided
  // java.lang.System is more important, so don't alias this one
  //  final val System = C.System
  final val Optional = C.Optional
}

object syntax extends LibraryManagementSyntax
