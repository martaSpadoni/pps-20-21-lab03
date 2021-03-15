package lab03

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test


class PersonListsTest {

  import u03.Lists.List._
  import u03.Lists._
  import u02.Modules.Person._
  import u02.Modules.Person
  import PersonLists._

  val list: List[Person] = Cons(Student("Maria", 2016 ), Cons(Teacher("Bianchi", "OOP"), Cons(Student("Mario", 2016 ), Nil())))

  @Test def testGetTeachersCourse(): Unit ={
    assertEquals(Cons("OOP", Nil()), getTeachersCourses(list))
  }



}
