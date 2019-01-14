package lectures.part2oop

/**
  * 1/13/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object OOBasic extends App {

  val person = new Person("Mx", 28)
  person.greeting("Zed")

}

class Person(val name: String,val age: Int) {

  def greeting(name: String): Unit = println(s"${this.name} say hi to $name")

}