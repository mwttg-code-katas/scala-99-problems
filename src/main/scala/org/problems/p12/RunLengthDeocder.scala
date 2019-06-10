package org.problems.p12

import scala.annotation.tailrec

object RunLengthDeocder {

  def decode[A](list: List[(Int, A)]): List[A] = {

    def duplicateInto(list: List[A], n: Int, item: A) = {
      @tailrec
      def duplicateHelper(currentN: Int, accumulator: List[A]): List[A] = {
        if (currentN <= 0) accumulator
        else {
          val newAccumulator = accumulator :+ item
          val newCurrentN = currentN - 1
          duplicateHelper(newCurrentN, newAccumulator)
        }
      }
      duplicateHelper(n, list)
    }

    @tailrec
    def decodeHelper(list: List[(Int, A)], accumulator: List[A]): List[A] = {
      list match {
        case Nil => accumulator
        case head :: tail =>
          val amount = head._1
          val item = head._2
          val newAccumulator = duplicateInto(accumulator, amount, item)
          decodeHelper(tail, newAccumulator)
      }
    }

    decodeHelper(list, List.empty)
  }
}
