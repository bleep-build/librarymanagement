package bleep.nosbt.librarymanagement

private[librarymanagement] abstract class MakePomConfigurationFunctions {
  private[nosbt] lazy val constTrue: MavenRepository => Boolean = _ => true

  def apply(): MakePomConfiguration =
    MakePomConfiguration(
      None,
      None,
      None,
      None,
      identity(_: scala.xml.Node),
      constTrue,
      true,
      Set(Artifact.DefaultType, Artifact.PomType)
    )
}
