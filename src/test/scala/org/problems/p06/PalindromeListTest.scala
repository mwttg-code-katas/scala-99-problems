package org.problems.p06

import org.scalatest.{Matchers, WordSpec}

class PalindromeListTest extends WordSpec with Matchers {

  "P06 - #PalindromeList" should {
    "return true if list is a palindrome" in {
      val actual = PalindromeList.isPalindrome(List(1, 2, 3, 2, 1))
      actual shouldBe true
    }
    "return false if list is not a palindrome" in {
      val actual = PalindromeList.isPalindrome(List(1, 2, 3, 4, 5))
      actual shouldBe false
    }
  }
}
