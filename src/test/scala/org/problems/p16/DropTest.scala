package org.problems.p16

import org.scalatest.{ Matchers, WordSpec }

class DropTest extends WordSpec with Matchers {

  "P14 - #Duplicate" should {
    "should duplicate each element of a list by n" in {
      val actual = Drop.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    }
  }
}
