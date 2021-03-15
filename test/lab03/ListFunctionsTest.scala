package lab03

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test


class ListFunctionsTest {

  import ListFunctions._
  import u03.Lists.List._

  val list = Cons(10, Cons(20, Cons(30, Nil())))

  @Test def testDropOneElem(){
    assertEquals(Cons(20, Cons(30, Nil())), drop(list,1));
  }

  @Test def testDropTwoElem() {
    assertEquals(Cons(30, Nil()), drop(list,2));
  }

  @Test def testDropAll(){
    assertEquals(Nil(), drop(list,4));
  }

  @Test def testDropMoreElemThanListLength(): Unit ={
    assertEquals(Nil(), drop(list,5));
  }

}
