package org.problems.p25

import scala.annotation.tailrec
import scala.util.Random

object Permutation {
  def randomPermute[A](list: List[A]): List[A] = {

    @tailrec
    def helper(left: List[A], accumulator: List[A]): List[A] =
      left.size match {
        case i if i <= 1 => accumulator :+ left.head
        case size =>
          val index = Random.nextInt(size)
          helper(dropAt(index, left), accumulator :+ left(index))
      }

    def dropAt[A](index: Int, list: List[A]) =
      list.splitAt(index) match {
        case (Nil, post) => post.slice(1, post.length)
        case (pre, Nil) => pre.slice(0, pre.length - 1)
        case (pre, post) => pre ::: post.drop(1)
      }

    helper(list, List.empty)
  }
}
