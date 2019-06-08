package org.problems.p06

object PalindromeList {

  def isPalindrome[A](list: List[A]): Boolean = {
    list == list.reverse
  }
}
