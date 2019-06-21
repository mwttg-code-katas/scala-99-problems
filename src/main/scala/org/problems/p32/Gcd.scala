package org.problems.p32

import scala.annotation.tailrec

object Gcd {
  def gcd(firstNumber: Int, secondNumber: Int): Int = {

    @tailrec
    def helper(n2: Int, rest: Int): Int =
      if (rest == 0) n2
      else helper(rest, n2 % rest)

    helper(secondNumber, firstNumber % secondNumber)
  }
}
