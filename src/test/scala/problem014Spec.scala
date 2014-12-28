import org.scalatest._

class LongestCollatzSequenceSpec extends FlatSpec with Matchers {

  "Longest Collatz Sequence" should "create collatz sequences" in {
	LongestCollatzSequence.collatz(13) should be(Seq(13, 40, 20, 10, 5, 16, 8, 4, 2, 1))
	LongestCollatzSequence.collatz(9) should be(Seq(9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1))
  }

  it should "determine the number who has the longest sequence when limit = 10" in {
  	LongestCollatzSequence(10) should be(9)
  }

  it should "determine the number who has the longest sequence when limit = 100" in {
  	LongestCollatzSequence(100) should be(97)
  }

  it should "determine the number who has the longest sequence when limit = 1000000" in {
  	LongestCollatzSequence(1000000) should be(837799)
  }

}