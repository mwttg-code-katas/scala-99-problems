package org.problems.p37

import org.problems.p36.PrimeFactor2.MoreImprovements

import scala.annotation.tailrec

object Totient {
  implicit class TotientImprovements(val number: Int) {
    def totient: Int = {
      @tailrec
      def helper(leftPrimes: List[(Int, Int)], accumulator: Int): Int = {
        leftPrimes match {
          case Nil => accumulator
          case head :: tail =>
            val prime = head._1
            val exponent = head._2
            val result = (prime - 1) * prime.power(exponent - 1)
            helper(tail, accumulator * result)
        }
      }

      val primes = number.primeFactorMultiplicity.toList
      helper(primes, 1)
    }


    private[Totient] def power(exponent: Int) = {
      @tailrec
      def helper(leftTimes: Int, accumulator: Int): Int = {
        if (leftTimes == 0)
          accumulator
        else helper(leftTimes - 1, accumulator * number)
      }
      helper(exponent, 1)
    }
  }

}
