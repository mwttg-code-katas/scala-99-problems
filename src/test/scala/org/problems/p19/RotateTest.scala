package org.problems.p19

import org.scalatest.{ Matchers, WordSpec }

class RotateTest extends WordSpec with Matchers {
  "P19" should {
    "Rotate a list N places to the left" in {
      val actual = Rotate.rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    }
    "Rotate a list N places to the left - negative n" in {
      val actual = Rotate.rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
    }
  }
}
