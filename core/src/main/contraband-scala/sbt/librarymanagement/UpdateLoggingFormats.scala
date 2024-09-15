/**
 * This code is generated using [[https://www.scala-bleep.nosbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package bleep.nosbt.librarymanagement
import _root_.sjsonnew.{Builder, JsonFormat, Unbuilder, deserializationError}
trait UpdateLoggingFormats { self: sjsonnew.BasicJsonProtocol =>
implicit lazy val UpdateLoggingFormat: JsonFormat[bleep.nosbt.librarymanagement.UpdateLogging] = new JsonFormat[bleep.nosbt.librarymanagement.UpdateLogging] {
  override def read[J](__jsOpt: Option[J], unbuilder: Unbuilder[J]): bleep.nosbt.librarymanagement.UpdateLogging = {
    __jsOpt match {
      case Some(__js) =>
      unbuilder.readString(__js) match {
        case "Full" => bleep.nosbt.librarymanagement.UpdateLogging.Full
        case "DownloadOnly" => bleep.nosbt.librarymanagement.UpdateLogging.DownloadOnly
        case "Quiet" => bleep.nosbt.librarymanagement.UpdateLogging.Quiet
        case "Default" => bleep.nosbt.librarymanagement.UpdateLogging.Default
      }
      case None =>
      deserializationError("Expected JsString but found None")
    }
  }
  override def write[J](obj: bleep.nosbt.librarymanagement.UpdateLogging, builder: Builder[J]): Unit = {
    val str = obj match {
      case bleep.nosbt.librarymanagement.UpdateLogging.Full => "Full"
      case bleep.nosbt.librarymanagement.UpdateLogging.DownloadOnly => "DownloadOnly"
      case bleep.nosbt.librarymanagement.UpdateLogging.Quiet => "Quiet"
      case bleep.nosbt.librarymanagement.UpdateLogging.Default => "Default"
    }
    builder.writeString(str)
  }
}
}
