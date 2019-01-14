package lectures.part2oop

/**
  * 1/14/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object Objects {

  /*Scala dose not have class level functionality (static)*/
  object Person {
    /*this is singleton class*/
    val x = 10

    def isWork(): Boolean = true

    /*factory method*/
    def apply(person1: Person, person2: Person): Person = new Person(s"${person1.name} ${person2.name}")
  }

  /*Companions*/
  class Person(val name: String) {
    def isWork(): Boolean = false
    override def toString: String = s"My name is $name"
  }

  def main(array: Array[String]): Unit = {
    println(Person.isWork())
    val person1 = new Person("Test1")
    val person2 = new Person("Test2")
    println(person1.isWork())

    /*static factory method call*/
    val person3 = Person(person1, person2)
    println(person3)
  }

}
