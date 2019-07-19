package org.problems.p40

import org.problems.p39.PrimeList.listPrimeInRange

import scala.annotation.tailrec

object Goldbach {
  implicit class GoldbachImprovements(val number: Int) {
    def goldbach: (Int, Int) = {
      @tailrec
      def helper(leftPrimes: List[Int], accumulator: Option[(Int, Int)]): (Int, Int) =
        (accumulator, leftPrimes) match {
          case (Some(result), _) => result
          case (None, head :: tail) =>
            val rest = number - head
            if (tail.toSet.contains(rest))
              helper(tail, Some(head, rest))
            else
              helper(tail, None)
        }

      val primes = listPrimeInRange(2 to number).reverse
      helper(primes, None)
    }
  }
}
