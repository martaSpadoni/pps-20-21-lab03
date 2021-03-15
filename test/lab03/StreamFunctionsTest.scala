package lab03

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.Optionals.Option._




class StreamFunctionsTest {

  import u03.Streams._
  import StreamFunctions._
  import u03.Lists.List._

  val s = Stream.take(Stream.iterate(0)(_+1))(10)

  @Test def testDrop(): Unit ={
    assertEquals(Cons(6,Cons(7, Cons(8, Cons(9, Nil())))), Stream.toList(drop(s)(6)))
  }

  @Test def testDropOnEmptyList(): Unit ={
    assertEquals(Nil(), Stream.toList(drop(Stream.Empty())(6)))
  }

  @Test def testConstant(): Unit ={
    assertEquals(Cons("x",Cons("x", Cons("x", Cons("x", Nil())))), Stream.toList(Stream.take(constant("x"))(4)))
  }

  @Test def testFibonacci(): Unit ={
    val fibs: Stream[Int] = fibonacci()
    val expected = Cons(0, Cons(1, Cons(1, Cons(2, Cons(3, Cons(5, Cons(8, Cons(13, Nil()))))))))
    assertEquals(expected, Stream.toList(Stream.take(fibs)(8)))
  }



}
