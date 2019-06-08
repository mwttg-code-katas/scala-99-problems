package org.problems.p08

import scala.annotation.tailrec

object EliminateDuplicates {

  def compress[A](list: List[A]): List[A] = {
    @tailrec
    def compressHelper(list: List[A], lastElement: Option[A], accumulator: List[A]): List[A] =
      list match {
        case Nil => accumulator
        case head :: tail =>
          lastElement match {
            case Some(value) =>
              if (value != head) {
                val newAccumulator = accumulator :+ head
                val newCurrentElement = Some(head)
                compressHelper(tail, newCurrentElement, newAccumulator)
              } else {
                compressHelper(tail, lastElement, accumulator)
              }
            // Initial case :(
            case None =>
              compressHelper(tail, Some(head), accumulator :+ head)
          }
      }
    compressHelper(list, None, List.empty[A])
  }

  // Unfortunately I had not found another solution for the lastElement using an option
  // so the whole match on this option is only for an initial value :(
}
