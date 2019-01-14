package lectures.part3fp

/**
  * 1/14/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object HigherOrderFunction extends App {

  // function that applies a function N times over a value x
  // nTimes(f, n, x)
  // nTimes(f, 3, x) = f(f(f(x)))
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))

  // simple function
  val fPlusOne = (x: Int) => x + 1
  println(nTimes(fPlusOne, 10, 1))

  // return function can applies n times
  def nTimesBetter(f: Int => Int, n: Int): Int => Int =
    if (n < 1) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n - 1)(f(x))

  val fPlusTen = nTimesBetter(fPlusOne, 10)
  println(fPlusTen(1))

  // curried function
  val fSupperSup: Int => Int => Int = (x: Int) => (y: Int) => y - x
  val fSup5 = fSupperSup(5)
  println(fSup5(10)) // 5
  println(fSupperSup(5)(10)) // 5
  println(fSupperSup(10)(5)) // -5

  // (c: String) parameter list1
  // (x: Double) parameter list2
  def curriedFormatter(c: String)(x: Double): String = c.format(x)

  val fFormatter1: Double => String = curriedFormatter("%4.2f")
  val fFormatter2: Double => String = curriedFormatter("%4.10f")

  println(fFormatter1(Math.PI))
  println(fFormatter2(Math.PI))

}
