package org.problems.p24

import scala.annotation.tailrec
import scala.util.Random

object Lotto {
  def lotto(draw: Int, max: Int): List[Int] = {

    @tailrec
    def drawRandomDistinct(accumulator: List[Int]): List[Int] =
      Random.nextInt(max - 1) + 1 match {   // counting from 1
        case n if accumulator.contains(n) => drawRandomDistinct(accumulator)
        case m => accumulator :+ m
      }

    @tailrec
    def drawHelper(currentDraw: Int, accumulator: List[Int]): List[Int] =
      currentDraw match {
        case i if i == 0 => accumulator
        case _ => drawHelper(currentDraw - 1, drawRandomDistinct(accumulator))
      }

    drawHelper(draw, List.empty)
  }
}
