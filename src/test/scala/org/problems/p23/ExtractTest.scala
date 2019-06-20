package org.problems.p23

import org.scalatest.{Matchers, WordSpec}

class ExtractTest extends WordSpec with Matchers {
  "P23 - #Extract" should {
    "Extract a given number of randomly selected elements from a list" in {
      val actual = Extract.randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
      actual.size shouldBe 3
      println(actual)
    }
    "Extract all randomly selected elements from a list" in {
      val actual = Extract.randomSelect(8, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h))
      actual.size shouldBe 8
      println(actual)
    }
  }
}
