package lab03


import scala.annotation.tailrec

object ListFunctions {

  import u03.Lists._
  import List._
  import u02.Optionals._
  import u02.Optionals.Option._

  @tailrec
  def drop[A](l: List[A], n: Int): List[A] = l match {
    case Cons(_, t) if n > 0 => drop(t, n-1)
    case _ => l
  }

  def flatMap[A,B](l:List[A])(f: A => List[B]): List[B] = l match {
    case Cons(h, t) => append(f(h), flatMap(t)(f))
    case _ => Nil()
  }

  def map[A,B](l: List[A])(mapper: A=>B): List[B] = flatMap(l)(a => Cons(mapper(a), Nil()))

  def filter[A](l1: List[A])(pred: A=>Boolean): List[A] = flatMap(l1)(a => pred(a) match {
    case true => Cons(a, Nil())
    case _ => Nil()
  })

  @tailrec
  def max(l: List[Int]):Option[Int] = l match {
    case Cons(h,t) => filter(t)(_ > h) match {
      case Nil() => Some(h)
      case _ => max(drop(l,1))
    }
    case Nil() => None()
  }

}
