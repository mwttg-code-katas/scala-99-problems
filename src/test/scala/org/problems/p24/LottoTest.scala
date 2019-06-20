package org.problems.p24

import org.scalatest.{Matchers, WordSpec}

class LottoTest extends WordSpec with Matchers {
  "P24" should {
    "Lotto: Draw N different random numbers from the set 1..M" in {
      val actual = Lotto.lotto(6, 49)
      actual.size shouldBe 6
    }
  }
}
