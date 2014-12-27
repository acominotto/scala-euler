import org.scalatest._

class HighlyDivisibleTriangularNumberSpec extends FlatSpec with Matchers {

  "Highly divisible triangular number" should "be able to calculate triangular numbers" in {
	HighlyDivisibleTriangularNumber.triangulars.take(7).toList should be(List(1,3,6,10,15,21,28))

  }

  it should "be 28 for number of divisors = 5" in {
  	HighlyDivisibleTriangularNumber(5) should be(28)
  }

  it should "be 76576500 for number of divisors = 500" in {
  	HighlyDivisibleTriangularNumber(500) should be(76576500)
  }
}