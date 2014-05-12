import scala.annotation.tailrec

/**
 * Created by giordanoscalzo on 12/05/2014.
 */
object Scala99 {


  @tailrec
  def palindrome(list: List[Int]): Boolean = {
    list match {
      case Nil => true
      case List(x) => true
      case x :: xs =>
        x == xs.last && palindrome(xs.dropRight(1))
    }
  }

}
