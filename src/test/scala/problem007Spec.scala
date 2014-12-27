import org.scalatest._

class XthPrimeSpec extends FlatSpec with Matchers {

  "Xth Prime" should "be 2 for number = 1" in {
    XthPrime(0) should be(2)
  }

  it should "be 17 for number = 5" in {
    XthPrime(5) should be(13)
  }

  it should "be 104743 for number = 10000" in {
    XthPrime(10000) should be(104743)
  }  
  
}
