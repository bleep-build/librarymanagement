package bleep.nosbt.internal.librarymanagement.formats

import bleep.nosbt.librarymanagement.LogicalClock
import sjsonnew.*

trait LogicalClockFormats { self: BasicJsonProtocol =>
  implicit lazy val LogicalClockFormat: JsonFormat[LogicalClock] =
    projectFormat[LogicalClock, String](
      cl => cl.toString,
      str => LogicalClock(str)
    )
}
