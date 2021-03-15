package lab03


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FoldFunctionsTest {
  import lab03.FoldFunctions._
  import u03.Lists.List._

  val list = Cons(3, Cons(7, Cons(1, Cons(5, Nil()))))

  @Test def testFoldLetf(): Unit ={
    assertEquals(-16, foldLeft(list)(0)(_-_))
  }

  @Test def testFoldLeftEmptyList(): Unit ={
    assertEquals(0, foldLeft(Nil())(0)((x:Int, y:Int) => x+ y))
  }


  @Test def testFoldRight(): Unit ={
    assertEquals(-8, foldRight(list)(0)(_-_))
  }

}
