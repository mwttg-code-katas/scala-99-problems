package org.problems.p02

object LastButOneElementOfList {

  def penultimate[A](list: List[A]): A = {
    val length = list.length
    list(length - 2)
  }
}
