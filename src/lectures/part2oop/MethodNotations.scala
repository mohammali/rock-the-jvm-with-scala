package lectures.part2oop

/**
  * 1/13/2019
  *
  * @author Mohammad Al-Najjar (Mx NINJA)
  */
object MethodNotations extends App {

  class Person(val name: String, favMovie: String) {
    def like(movie: String): Boolean = movie == favMovie
    def hangOut(person: Person): String = s"${this.name} hang out with ${person.name}"
  }

  val m = new Person("M", "movie1")
  println(m.like("movie1"))
  println(m like "movie1")

  val t = new Person("T", "movie2")
  println(m hangOut t)

}
