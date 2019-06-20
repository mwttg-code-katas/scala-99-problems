package org.problems.p22

import org.scalatest.{Matchers, WordSpec}

class RangeTest extends WordSpec with Matchers {
  "P22" should {
    "Create a list containing all integers within a given range" in {
      val actual = Range.range(4, 9)
      actual shouldBe List(4, 5, 6, 7, 8, 9)
    }
  }
}
