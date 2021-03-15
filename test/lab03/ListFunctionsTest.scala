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

  @Test def testFlatMap(): Unit ={
    val expected = Cons(11, Cons(21, Cons(31, Nil())))
    assertEquals(expected, flatMap(list)(v => Cons(v+1, Nil())))
  }

  @Test def testFlatMap2(): Unit ={
    val expected = Cons(11, Cons(12, Cons(21, Cons(22, Cons(31, Cons(32, Nil()))))))
    assertEquals(expected, flatMap(list)(v => Cons(v+1, Cons(v+2, Nil()))))
  }

  @Test def testFlatMapOnEmptyList(): Unit ={
    val emptyList = Nil()
    assertEquals(Nil(), flatMap(emptyList)((v:Int) => Cons(v+1, Nil())))
  }

  @Test def testMap(): Unit ={
    val mapper : Int => String = {
      case n if n > 10 => "a"
      case _ => "b"
    }
    val expected = Cons("b", Cons("a", Cons("a", Nil())))
    assertEquals(expected, ListFunctions.map(list)(mapper))
  }


}
