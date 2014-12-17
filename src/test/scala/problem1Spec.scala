import org.scalatest._

class MultiplesOf3And5Spec extends FlatSpec with Matchers {

  "sum of multiples of 3 And 5" should "equal 3 for all N below 5" in {
    MultiplesOf3And5.sumBelow(5) should be(3)
  }

  it should "equal 23 for all N below 10" in {
    MultiplesOf3And5.sumBelow(10) should be(23)
  }

  it should "equal 233168 for all N below 1000" in {
    MultiplesOf3And5.sumBelow(1000) should be(233168)
  }

  it should "equal 23331668 for all N below 10000" in {
    MultiplesOf3And5.sumBelow(10000) should be(23331668)
  }
}
