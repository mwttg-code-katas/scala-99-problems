package org.problems.p18

import scala.annotation.tailrec

object Slice {
  def sliceBuildIn[A](n: Int, k: Int, list: List[A]): List[A] = list.slice(n, k)

  def slice[A](n: Int, k: Int, list: List[A]): List[A] = {
    @tailrec
    def helper(index: Int, xs: List[A], accumulator: List[A]): List[A] =
      xs match {
        case Nil => accumulator
        case head :: tail =>
          if (index >= n && index < k) {
            val newAccumulator = accumulator :+ head
            val newIndex       = index + 1
            helper(newIndex, tail, newAccumulator)
          } else {
            helper(index + 1, tail, accumulator)
          }
      }
    if (n <= 0 || k > list.size) {
      List.empty
    } else {
      helper(0, list, List.empty)
    }
  }
}
