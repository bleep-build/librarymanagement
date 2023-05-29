/*
 * sbt
 * Copyright 2011 - 2018, Lightbend, Inc.
 * Copyright 2008 - 2010, Mark Harrah
 * Licensed under Apache License 2.0 (see LICENSE)
 */

package bleep.nosbt
package internal
package librarymanagement

import java.util.Locale
import scala.util.control.NonFatal

object LMSysProp {
  def booleanOpt(name: String): Option[Boolean] =
    sys.props.get(name).flatMap { x =>
      x.toLowerCase(Locale.ENGLISH) match {
        case "1" | "always" | "true" => Some(true)
        case "0" | "never" | "false" => Some(false)
        case "auto"                  => None
        case _                       => None
      }
    }

  def getOrFalse(name: String): Boolean = booleanOpt(name).getOrElse(false)
  def getOrTrue(name: String): Boolean = booleanOpt(name).getOrElse(true)

  // System property style:
  //   1. use bleep.nosbt. prefix
  //   2. prefer short nouns
  //   3. use dot for namespacing, and avoid making dot-separated English phrase
  //   4. make active/enable properties, instead of "bleep.nosbt.disable."
  //
  // Good: bleep.nosbt.offline
  //
  // Bad:
  // bleep.nosbt.disable.interface.classloader.cache
  // bleep.nosbt.task.timings.on.shutdown
  // bleep.nosbt.skip.version.write -> bleep.nosbt.genbuildprops=false

  val useSecureResolvers: Boolean = getOrTrue("bleep.nosbt.repository.secure")

  lazy val modifyVersionRange: Boolean = getOrTrue("bleep.nosbt.modversionrange")

  lazy val isJavaVersion9Plus: Boolean = javaVersion > 8
  lazy val javaVersion: Int = {
    try {
      // See Oracle section 1.5.3 at:
      // https://docs.oracle.com/javase/8/docs/technotes/guides/versioning/spec/versioning2.html
      val version = sys.props("java.specification.version").split("\\.").toList.map(_.toInt)
      version match {
        case 1 :: minor :: _ => minor
        case major :: _      => major
        case _               => 0
      }
    } catch {
      case NonFatal(_) => 0
    }
  }

  lazy val useGigahorse: Boolean = getOrFalse("bleep.nosbt.gigahorse")
  lazy val maxPublishAttempts: Int =
    java.lang.Integer.getInteger("bleep.nosbt.repository.publish.attempts", 3)

}
