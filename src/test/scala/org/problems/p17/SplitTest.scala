package org.problems.p17

import org.scalatest.{ Matchers, WordSpec }

class SplitTest extends WordSpec with Matchers {
  "P17" should {
    "Split a list into two parts" in {
      val actual = Split.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    }
  }
}
