package lab03

import u03.Lists.List._
import u03.Lists._

import scala.annotation.tailrec

object FoldFunctions {

  @tailrec
  def foldLeft[A,B](list:List[A])(init:B)(op:(B,A)=>B):B = list match {
    case Cons(h,t) => foldLeft(t)(op(init,h))(op)
    case Nil() => init
  }

  def foldRight[A,B](list:List[A])(init:B)(op:(A, B)=>B):B = list match {
    case Cons(h,t) => op(h, foldRight(t)(init)(op))
    case Nil() => init
  }

}
