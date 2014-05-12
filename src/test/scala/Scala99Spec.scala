import org.scalatest.{Matchers, WordSpecLike}

/**
 * Created by giordanoscalzo on 12/05/2014.
 */
class Scala99Spec extends WordSpecLike with Matchers {


  "scala P06" must {

    "detect a palindrome list" in {

      val list = List(1, 2, 1)

      Scala99.palindrome(list) should equal(true)
    }

    "detect a single element list as palindrome" in {
      val list = List(2)
      Scala99.palindrome(list) should equal(true)
    }

    "detect a palindrome list with an even number of elements" in {
      val list = List(1, 2, 2, 1)
      Scala99.palindrome(list) should equal(true)
    }

    "detect a non palindrome list" in {
      val list = (1 to 4).toList
      Scala99.palindrome(list) should equal(false)

    }
  }

}
