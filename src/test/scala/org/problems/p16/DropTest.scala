package org.problems.p16

import org.scalatest.{ Matchers, WordSpec }

class DropTest extends WordSpec with Matchers {

  "P16 - #Drop" should {
    "drop every nth element from list" in {
      val actual = Drop.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual shouldBe List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    }
  }
}
