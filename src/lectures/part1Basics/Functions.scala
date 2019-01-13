package lectures.part1Basics

/**
  * 1/12/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object Functions extends App {

  println(a("Mx", 28))
  println(factorial(5))
  println(fibonacci(8))
  println(isPrime(37))
  println(isPrime(11))
  println(isPrime(10))

  def a(name: String, age: Int): String = s"My name is $name and i am $age years old"

  def factorial(n: Int): Int = if (n <= 0) 1 else factorial(n - 1) * n

  def fibonacci(n: Int): Int = if (n <= 2) 1 else fibonacci(n - 1) + fibonacci(n - 2)

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

}
