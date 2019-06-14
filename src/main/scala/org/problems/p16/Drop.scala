package org.problems.p16

import scala.annotation.tailrec

object Drop {
  def drop[A](n: Int, list: List[A]): List[A] = {
    @tailrec
    def helper(i: Int, xs: List[A], accumulator: List[A]): List[A] =
      if (i == list.size) {
        accumulator
      } else {
        val newI = i + 1
        if ((i + 1) % n  == 0 && i != 0) {
          val newList = xs.tail
          helper(newI, newList, accumulator)
        } else {
          val newAccumulator = accumulator :+ xs.head
          val newList       = xs.tail
          helper(newI, newList, newAccumulator)
        }
      }

    helper(0, list, List.empty)
  }
}
