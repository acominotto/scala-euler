import org.scalatest._

class LargestPrimeFactorSpec extends FlatSpec with Matchers {

  "Largest Prime Factor" should "equal 5 for all primes divisors of 10" in {
    LargestPrimeFactor(10) should be(Some(5))
  }

  it should "equal 29 for all primes divisors of 13195" in {
    LargestPrimeFactor(13195) should be(Some(29))
  }

  it should "equal 6857 for all primes divisors of 600851475143 " in {
    LargestPrimeFactor(BigInt("600851475143")) should be(Some(6857))
  }

  it should "be None for 1" in {
    LargestPrimeFactor(1) should be(None)
  }

  it should "be None for primes" in {
    LargestPrimeFactor(5) should be(None)
    LargestPrimeFactor(17) should be(None)
  }
  
}
