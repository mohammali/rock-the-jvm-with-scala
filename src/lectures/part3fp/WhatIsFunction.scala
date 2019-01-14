package lectures.part3fp

/**
  * 1/14/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object WhatIsFunction extends App {

  val fun2: (Int, Int) => Int = (v1: Int, v2: Int) => v1 + v2
  val fun3 = (v1: Int, v2: Int) => v1 + v2
  val fun4: (String, String, String) => Int = (p1: String, p2: String, p3: String) => p1.toInt + p2.toInt + p3.toInt
  val fun5: (String, Int) => String = (x, y) => x + y

  println(fun4("1", "2", "3"))
  println(fun3(1, 2))
  println(fun5("mx", 2))


  val fun6 = () => 4
  println(fun6)
  println(fun6())

  val fun7 = () => {
    val x = 5
    val y = 6
    x + y
  }
  println(fun7())


}
