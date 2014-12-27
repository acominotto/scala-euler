import org.scalatest._

class SmallestMultipleSpec extends FlatSpec with Matchers {

  "Smallest Multiple" should "be 60 for all divisors under 5" in {
    SmallestMultiple(5) should be(60)
  }

  it should "be 2520 for all divisors under 10" in {
    SmallestMultiple(10) should be(2520)
  }

  it should "be 232792560 for all divisors under 20" in {
    SmallestMultiple(20) should be(232792560)
  }
  
}
