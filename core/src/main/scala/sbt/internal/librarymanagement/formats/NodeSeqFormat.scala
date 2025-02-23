package bleep.nosbt.internal.librarymanagement.formats

import sjsonnew.*

import scala.xml.*

trait NodeSeqFormat { self: BasicJsonProtocol =>
  implicit lazy val NodeSeqFormat: JsonFormat[NodeSeq] = projectFormat[NodeSeq, String](
    xml => <binary>{xml}</binary>.toString,
    str => XML.loadString(str).child
  )
}
