import org.scalatest._

class LargestPalindromeProductSpec extends FlatSpec with Matchers {

  "Largest Palindrome Product" should "determine whether a string is a palindrome" in {
    LargestPalindromeProduct.isPalindrome("a") should be(true)
    LargestPalindromeProduct.isPalindrome("hello") should be(false)
    LargestPalindromeProduct.isPalindrome("akka") should be(true)
    LargestPalindromeProduct.isPalindrome("play") should be(false)
    LargestPalindromeProduct.isPalindrome("ababa") should be(true)
  }

  it should "equal 9 for the product of one digit numbers" in {
    LargestPalindromeProduct(1) should be(9)
  }

  it should "equal 9009 for product of two digits numbers" in {
    LargestPalindromeProduct(2) should be(9009)
  }

  it should "equal 906609 for the product of three digits numbers" in {
    LargestPalindromeProduct(3) should be(906609)
  }
  
}
