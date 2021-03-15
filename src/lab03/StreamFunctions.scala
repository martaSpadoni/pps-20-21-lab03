package lab03

import scala.annotation.tailrec

object StreamFunctions {

  import u03.Streams._
  import u03.Streams.Stream._


  @tailrec
  def drop[A](stream: Stream[A])(n:Int):Stream[A] = (stream,n) match {
    case (Cons(_, tail), n) if n>0 => drop(tail())(n-1)
    case _ => stream
  }

  def constant[A](c: A): Stream[A] = iterate(c)(x => x)

  def fibonacci():Stream[Int] = {
    def _fib( prev: => Int, actual: => Int) : Stream[Int] = cons(actual,_fib(actual, prev+actual))
    _fib(1, 0)
  }




}
