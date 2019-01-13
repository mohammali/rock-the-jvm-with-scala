package lectures.part1Basics

/**
  * 1/13/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object CBNvsCBV extends App {

  def callByValue(x: Long): Unit = {
    println("By value: " + x)
    println("By value: " + x)
  }

  def callByName(x: => Long): Unit = {
    println("By name: " + x)
    println("By name: " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int): Unit = println(x)

  printFirst(1, infinite())

}
