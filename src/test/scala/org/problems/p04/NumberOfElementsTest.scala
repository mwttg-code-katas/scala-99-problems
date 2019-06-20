package org.problems.p04

import org.scalatest.{ Matchers, WordSpec }

class NumberOfElementsTest extends WordSpec with Matchers {
  "P04" should {
    "Find the number of elements of a list" in {
      val actual = NumberOfElements.length(List(1, 1, 2, 3, 5, 8))
      actual shouldBe 6
    }
  }

}
