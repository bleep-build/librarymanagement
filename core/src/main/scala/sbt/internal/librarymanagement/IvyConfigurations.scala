/* sbt -- Simple Build Tool
 * Copyright 2008, 2009, 2010  Mark Harrah
 */
package bleep.nosbt.librarymanagement

private[librarymanagement] abstract class InlineConfigurationFunctions {
  def configurations(
      explicitConfigurations: Iterable[Configuration],
      defaultConfiguration: Option[Configuration]
  ) =
    if (explicitConfigurations.isEmpty) {
      defaultConfiguration match {
        case Some(Configurations.DefaultIvyConfiguration) => Configurations.Default :: Nil
        case Some(Configurations.DefaultMavenConfiguration) =>
          Configurations.defaultMavenConfigurations
        case _ => Nil
      }
    } else
      explicitConfigurations
}
