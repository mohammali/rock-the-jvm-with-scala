package lectures.part1Basics

/**
  * 1/13/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object StringOps extends App {

  val str = "Hello, This is me"

  println(str.charAt(2))
  println(str.take(2))


  /*S - Interpolator*/
  def sInterpolator(name: String, age: Int): String = s"Hello, this is $name and i am $age years old"
  println(sInterpolator("Mx", 28))

  /*F - Interpolator*/
  def fInterpolator(itemName: String, price: Double): String = f"$itemName: $price%04.2f"
  println(fInterpolator("Potato", 2.5))
  println(fInterpolator("Banana", 1.7))
  println(fInterpolator("iMAC", 1999.99))

  val raw = "Line1\nLine2"
  println(raw"Line1\nLine2")
  println(raw"$raw")
}
