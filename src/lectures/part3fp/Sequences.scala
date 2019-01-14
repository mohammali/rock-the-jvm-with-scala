package lectures.part3fp

import scala.util.Random

/**
  * 1/15/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object Sequences extends App {

  // seq
  val aSeq = Seq(1, 3, 2, 4)
  println(aSeq)
  println(aSeq.reverse)
  println(aSeq(2))
  println(aSeq ++ Seq(5, 6, 7))
  println((aSeq ++ Seq(5, 6, 7)).sorted)

  // range
  val range0: Seq[Int] = 0 to 10
  range0.foreach(x => print(x + " "))
  println()
  val range1: Seq[Int] = 0 until 10
  range1.foreach(x => print(x + " "))
  println()

  (0 until 10).foreach(_ => println("Hello"))

  // list
  val list = List(1, 2, 3)
  println(list)
  val x = 5
  val list2 = 0 +: list :+ 4 :+ x
  println(list2)
  println(list2.mkString("-"))

  val filledList = List.fill(5)("Potato") :+ "Banana"
  println(filledList)

  // arrays
  val numbers1 = Array(1, 2, 3, 4)
  println(numbers1.mkString(", "))
  val numbers2 = Array.ofDim[Int](4)
  // mutation
  numbers2(2) = 2
  println(numbers2.mkString(", "))

  // vectors
  val vector1 = Vector(1, 2, 3, 4)

  // vectors vs lists
  val maxRuns = 1000
  val maxCapacity = 1000000

  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random
    val times = for {
      it <- 1 to maxRuns
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), 0)
      System.nanoTime() - currentTime
    }

    times.sum * 1.0 / maxRuns
  }

  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector

  println(getWriteTime(numbersList))
  println(getWriteTime(numbersVector))



}
