package org.problems.p05

import org.scalatest.{ Matchers, WordSpec }

class ReverseListTest extends WordSpec with Matchers {
  "P05" should {
    "Reverse a list" in {
      val actual = ReverseList.reverse(List(1, 1, 2, 3, 5, 8))
      actual shouldBe List(8, 5, 3, 2, 1, 1)
    }
  }
}
