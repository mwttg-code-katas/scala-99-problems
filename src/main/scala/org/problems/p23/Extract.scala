package org.problems.p23

import scala.annotation.tailrec
import scala.util.Random

object Extract {
  def randomSelect[A](n: Int, list: List[A]): List[A] = {
    val size = list.size

    @tailrec
    def helper(selectLeft: Int, left: List[A], accumulator: List[A]): List[A] =
      if (selectLeft > size) {
        list
      } else {
        (selectLeft, left) match {
          case (a, _) if a == 0 => accumulator
          case (b, l) =>
            val index = Random.nextInt(b)
            helper(b - 1, dropAt(index, l), accumulator :+ l(index))
        }
      }

    helper(n, list, List.empty)
  }

  private def dropAt[A](index: Int, list: List[A]): List[A] = {
    list.splitAt(index) match {
      case (Nil, _) if index < 0 => throw new NoSuchElementException
      case (pre, e :: post)  =>pre ::: post
      case (_, Nil)        => throw new NoSuchElementException
    }
  }
}
