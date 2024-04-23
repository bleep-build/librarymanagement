package bleep.nosbt.librarymanagement

import java.net.{URI, URL}

/**
 * Commonly used software licenses
 * Names are SPDX ids:
 * https://raw.githubusercontent.com/spdx/license-list-data/master/json/licenses.json
 */
object License {
  lazy val Apache2: (String, URL) =
    ("Apache-2.0", URI.create("https://www.apache.org/licenses/LICENSE-2.0.txt").toURL)

  lazy val MIT: (String, URL) =
    ("MIT", URI.create("https://opensource.org/licenses/MIT").toURL)

  lazy val CC0: (String, URL) =
    ("CC0-1.0", URI.create("https://creativecommons.org/publicdomain/zero/1.0/legalcode").toURL)

  def PublicDomain: (String, URL) = CC0

  lazy val GPL3_or_later: (String, URL) =
    ("GPL-3.0-or-later", URI.create("https://spdx.org/licenses/GPL-3.0-or-later.html").toURL)
}
