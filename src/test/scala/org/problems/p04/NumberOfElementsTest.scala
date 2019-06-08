package org.problems.p04

import org.scalatest.{ Matchers, WordSpec }

class NumberOfElementsTest extends WordSpec with Matchers {

  "P04 - #number of elements of a list" should {
    "return number of elements" in {
      val actual = NumberOfElements.length(List(1, 1, 2, 3, 5, 8))
      actual shouldBe 6
    }
  }

}
