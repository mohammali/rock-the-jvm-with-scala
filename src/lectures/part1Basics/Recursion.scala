package lectures.part1Basics

import scala.annotation.tailrec

/**
  * 1/13/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object Recursion extends App {

  def factorial(n: Int): Int = if (n <= 1) 1 else n * factorial(n - 1)

  def tailFactorial(n: Int): BigInt = {
    @tailrec
    def helper(x: Int, acc: BigInt): BigInt = if (x <= 1) acc else helper(x - 1, x * acc)

    helper(n, 1)
  }

  def concat(str: String, nTimes: Int): String = {
    if (nTimes <= 1) str + " " + nTimes
    else str + " " + nTimes + "\n" + concat(str, nTimes - 1)
  }

  def tailConcat(str: String, nTimes: Int): String = {
    @tailrec
    def helper(hStr: String, hNTimes: Int, acc: String): String = {
      if (hNTimes <= 0) acc
      else helper(hStr, hNTimes - 1, hStr + " " + hNTimes + "\n" + acc)
    }

    helper(str, nTimes, "")
  }

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  def tailIsPrime(n: Int): Boolean = {
    @tailrec
    def helper(t: Int, acc: Boolean): Boolean = {
      if (!acc) false
      else if (t <= 1) true
      else helper(t - 1, n % 2 != 0 && acc)
    }

    helper(t = n / 2, acc = true)
  }

  def fibonacci(n: Int): Int = if (n <= 2) 1 else fibonacci(n - 1) + fibonacci(n - 2)

  def tailFibonacci(n: Int): Int = {
    @tailrec
    def helper(hN: Int, accLast: Int, accNext: Int): Int = {
      if (hN >= n) accLast
      else helper(hN + 1, accLast + accNext, accLast)
    }

    if (n <= 2) 1
    else helper(2, 1, 1)
  }

  //println(tailIsPrime(11))
  println(tailFibonacci(8))
  //println(concat("mx", 10000))
  //println(tailConcat("Mx", 10000))

}
