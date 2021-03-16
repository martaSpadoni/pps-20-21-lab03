package lab03

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test


class PersonListsTest {

  import u03.Lists.List._
  import u03.Lists._
  import u02.Modules.Person._
  import u02.Modules.Person
  import PersonListFunctions._

  val list: List[Person] = Cons(Student("Maria", 2016 ), Cons(Teacher("Bianchi", "OOP"), Cons(Student("Mario", 2016 ), Nil())))
  val teacherList: List[Person] = Cons(Teacher("Rossi", "SD" ), Cons(Teacher("Bianchi", "OOP"), Cons(Teacher("Verdi", "LCMC" ), Nil())))
  val studentList: List[Person] = Cons(Student("Maria", 2016 ), Cons(Student("Carlo", 2018), Cons(Student("Mario", 2016 ), Nil())))

  @Test def testGetTeachersCourse(): Unit ={
    assertEquals(Cons("OOP", Nil()), getTeachersCourses(list))
  }

  @Test def testGetTeachersCourseOnTeacherList(): Unit ={
    assertEquals(Cons("SD", Cons("OOP", Cons("LCMC", Nil()))), getTeachersCourses(teacherList))
  }

  @Test def testGetTeachersCourseOnStudentList(): Unit ={
    assertEquals(Nil(), getTeachersCourses(studentList))
  }

  @Test def testGetTeachersCourseOnEmptyList(): Unit ={
    assertEquals(Nil(), getTeachersCourses(Nil()))
  }



}
