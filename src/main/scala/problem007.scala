
object XthPrime {
  def apply(number: Int) = {
    primes(number)
  }

  def primes: Stream[Int] = Stream.from(2).filter(x => divisors(x).isEmpty) // divisors is optimized like a sieve and doesn't suffer stackoverflow

  def divisors(value: BigInt): Set[BigInt] = {
    val divs: Set[Int] = (2 to math.sqrt(value.toDouble).toInt).toSet
    divs.flatMap { i =>
      if(value % i == 0) Set(BigInt(i), value / i) else Set.empty[BigInt]
    } 
  }
}