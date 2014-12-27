import org.scalatest._

class SummationOfPrimesSpec extends FlatSpec with Matchers {

  "Summation of primes" should "be 17 for all primes below 10" in {
    SummationOfPrimes(10) should be(17)
  }

  it should "be 142913828922 all primes below 2000000" in {
  	SummationOfPrimes(2000000) should be(BigInt("142913828922"))
  }

  
}