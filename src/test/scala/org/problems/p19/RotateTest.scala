package org.problems.p19

import org.scalatest.{ Matchers, WordSpec }

class RotateTest extends WordSpec with Matchers {

  "P19 - #Rotate" should {
    "return a list to the left by n" in {
      val actual = Rotate.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    }
    "return a list to the right by n" in {
      val actual = Rotate.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    }
  }
}
