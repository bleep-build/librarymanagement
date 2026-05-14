/** This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
  */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement

import _root_.sjsonnew.JsonFormat
trait ModuleSettingsFormats {
  self: bleep.nosbt.librarymanagement.ScalaModuleInfoFormats & sjsonnew.BasicJsonProtocol & bleep.nosbt.librarymanagement.IvyFileConfigurationFormats &
    bleep.nosbt.librarymanagement.PomConfigurationFormats & bleep.nosbt.librarymanagement.ModuleIDFormats & bleep.nosbt.librarymanagement.ModuleInfoFormats &
    bleep.nosbt.librarymanagement.InclExclRuleFormats & bleep.nosbt.internal.librarymanagement.formats.NodeSeqFormat &
    bleep.nosbt.librarymanagement.ConfigurationFormats & bleep.nosbt.librarymanagement.ConflictManagerFormats &
    bleep.nosbt.librarymanagement.ModuleDescriptorConfigurationFormats =>
  implicit lazy val ModuleSettingsFormat: JsonFormat[bleep.nosbt.librarymanagement.ModuleSettings] = flatUnionFormat3[
    bleep.nosbt.librarymanagement.ModuleSettings,
    bleep.nosbt.librarymanagement.IvyFileConfiguration,
    bleep.nosbt.librarymanagement.PomConfiguration,
    bleep.nosbt.librarymanagement.ModuleDescriptorConfiguration
  ]("type")
}
