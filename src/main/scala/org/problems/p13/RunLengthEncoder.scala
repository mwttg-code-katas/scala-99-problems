package org.problems.p13

import scala.annotation.tailrec

object RunLengthEncoder {

  def encodeDirect[A](list: List[A]): List[(Int, A)] = {

    @tailrec
    def encodeHelper(list: List[A], currentItem: A, accumulator: List[(Int, A)]): List[(Int, A)] =
      list match {
        case Nil => accumulator
        case head :: tail =>
          val n              = tail.takeWhile(item => item == head).size + 1
          val newTail        = tail.dropWhile(item => item == head) // can't find another solution than this :( atm
          val newAccumulator = accumulator :+ (n, head)
          encodeHelper(newTail, head, newAccumulator)
      }
    encodeHelper(list, list.head, List.empty)
  }
}
