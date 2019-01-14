package lectures.part3fp

/**
  * 1/15/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object MapFlatMapFilterAndForComprehensions extends App {

  val number = List(1, 2, 3, 4)

  // foreach
  number.foreach(println)

  // filter
  println(number.filter(x => x % 2 == 0))

  //map
  println(number.map(_ + "M"))

  // flatMap
  val toPair = (x: Int) => List(x, x + 1)
  println(number.flatMap(toPair))

  // print all combination between 3 lists
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("Black", "White")

  // iterating
  val combinationNumberAndChars =
    number.flatMap(number =>
      chars.flatMap(char =>
        colors.map(color =>
          char.toString + number.toString + "-" + color)))
  println(combinationNumberAndChars)

  // For Comprehensions
  val forComprehensions = for {
    n <- number if n % 2 == 0
    c <- chars if c == 'c'
    color <- colors if color == "Black"
  } yield c.toString + n.toString + "-" + color

  println(forComprehensions)

  for {
    n <- number if n % 2 != 0
  } println(n)

  number.map { x =>
    (x + 1) * 3
  }.foreach(println)


}
