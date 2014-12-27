import org.scalatest._

class SumSquareDifferenceSpec extends FlatSpec with Matchers {

  "Sum Square Difference" should "be 2640 for limit = 10" in {
    SumSquareDifference(10) should be(2640)
  }

  it should "be 25164150 for limit = 100" in {
    SumSquareDifference(100) should be(25164150)
  }
  
}
