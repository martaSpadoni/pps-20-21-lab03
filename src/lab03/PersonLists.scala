package lab03

object PersonLists {

  import u03.Lists._
  import u03.Lists.List._
  import ListFunctions._
  import u02.Modules._
  import u02.Modules.Person._


  def getTeachersCourses(list:List[Person]):List[String]=flatMap(list)(p => p match {
    case Teacher(_, course) => Cons(course, Nil())
    case _ => Nil()
  })

}
