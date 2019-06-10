package org.problems.p12

import org.scalatest.{ Matchers, WordSpec }

class RunLengthDeocderTest extends WordSpec with Matchers {

  "P12 - #RunLengthDecoder" should {
    "create a valid decode" in {
      val actual = RunLengthDeocder.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
      actual shouldBe List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    }
  }
}
