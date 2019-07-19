package org.problems.p38




object TotientCompare extends App {
  val start1 = System.currentTimeMillis()
  val result1 = executeP34
  val end1 = System.currentTimeMillis()

  val start2 = System.currentTimeMillis()
  val result2 = executeP37
  val end2 = System.currentTimeMillis()

  println("Summary")
  println(s"P34 took ${end1 - start1} ms for calculating phi(10090). The result is $result1")
  println(s"P36 took ${end2 - start2} ms for calculating phi(10090). The result is $result2")

  def executeP34 = {
    import org.problems.p34.Totient.Improvements
    10090.totient
  }

  def executeP37 = {
    import org.problems.p37.Totient.TotientImprovements
    10090.totient
  }
}


