package lectures.part3fp

/**
  * 1/15/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object TuplesAndMaps extends App {

  // Tuples
  val tuples0 = Tuple1(1, "Mx")
  val tuples1 = (1, "Mx")

  println(tuples1._1)
  println(tuples1.copy(2, "NiNja"))
  println(tuples1.swap)

  // Maps
  val aMaps: Map[String, Int] = Map()
  val phoneBook = Map(("Ninja", 111), "MxNINJA" -> 222).withDefaultValue(-1)
  println(phoneBook)
  println(phoneBook.contains("Ninja"))
  println(phoneBook("Ninja"))
  println(phoneBook("test"))

  // add new pair
  val newPair = ("TEST", 6)
  val newPhoneBook = phoneBook + ("ZedMan" -> 5) + newPair
  println(newPhoneBook("test"))
  println(newPhoneBook("ZedMan"))
  println(newPhoneBook)

  // conversion to other collection
  val names = Vector("Chad", "Sliifer", "Solid", "Mx", "NiNja", "Cont", "Mz")
  val groupName = names.groupBy(name => name.charAt(0))
  println(groupName)
}
