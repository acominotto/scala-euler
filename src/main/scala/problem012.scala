
object HighlyDivisibleTriangularNumber {
  def apply(numberOfDivisors: Int) = triangulars.dropWhile(x => divisors(BigInt(x)).size <= numberOfDivisors).head

  val triangulars: Stream[Int] = Stream.from(1).map(x => (0 to x).foldLeft(0)(_ + _))

  def divisors(value: BigInt): Set[BigInt] = {
    val divs: Set[Int] = (1 to math.sqrt(value.toDouble).toInt).toSet
    val ret = divs.flatMap { i =>
      if(value % i == 0) Set(BigInt(i), value / i) else Set.empty[BigInt]
    }
    //println(s"divisors = $ret")
    ret 
  }

}