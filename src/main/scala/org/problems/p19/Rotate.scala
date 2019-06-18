package org.problems.p19

object Rotate {
  def rotate[A](n: Int, list: List[A]): List[A] = {
    n match {
      case i if n < 0 => rotateRight(-i, list)
      case _ => rotateLeft(n, list)
    }
  }

  def rotateLeft[A](n: Int, list: List[A]): List[A] = {
    val leftPart = list.slice(0, n)
    list.drop(n) ::: leftPart
  }

  def rotateRight[A](n: Int, list: List[A]): List[A] = {
    val rightPart = list.slice(list.size - n, list.size)
    rightPart ::: list.splitAt(list.size - n)._1
  }
}
