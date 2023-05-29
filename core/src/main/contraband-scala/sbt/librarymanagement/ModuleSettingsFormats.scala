/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement

import _root_.sjsonnew.JsonFormat
trait ModuleSettingsFormats { self: bleep.nosbt.librarymanagement.ScalaModuleInfoFormats with sjsonnew.BasicJsonProtocol with bleep.nosbt.librarymanagement.IvyFileConfigurationFormats with bleep.nosbt.librarymanagement.PomConfigurationFormats with bleep.nosbt.librarymanagement.ModuleIDFormats with bleep.nosbt.librarymanagement.ModuleInfoFormats with bleep.nosbt.librarymanagement.InclExclRuleFormats with bleep.nosbt.internal.librarymanagement.formats.NodeSeqFormat with bleep.nosbt.librarymanagement.ConfigurationFormats with bleep.nosbt.librarymanagement.ConflictManagerFormats with bleep.nosbt.librarymanagement.ModuleDescriptorConfigurationFormats =>
implicit lazy val ModuleSettingsFormat: JsonFormat[bleep.nosbt.librarymanagement.ModuleSettings] = flatUnionFormat3[bleep.nosbt.librarymanagement.ModuleSettings, bleep.nosbt.librarymanagement.IvyFileConfiguration, bleep.nosbt.librarymanagement.PomConfiguration, bleep.nosbt.librarymanagement.ModuleDescriptorConfiguration]("type")
}
