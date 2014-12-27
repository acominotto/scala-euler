
object SummationOfPrimes {

  def apply(limit: Int): BigInt = {
	Primes.below(limit).foldLeft(BigInt(0))(_ + _)
  }

}