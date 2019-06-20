package org.problems.p13

import org.scalatest.{ Matchers, WordSpec }

class RunLengthEncoderTest extends WordSpec with Matchers {
  "P13" should {
    "Run-length encoding of a list (direct solution)" in {
      val actual = RunLengthEncoder.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      actual shouldBe List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    }
  }
}
