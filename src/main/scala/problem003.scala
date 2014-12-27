
import annotation.tailrec
import scala.util.Try

object LargestPrimeFactor {
  def apply(value: BigInt): Option[BigInt] = Try(divisors(value).filter(x => divisors(x).isEmpty).max).toOption

  def divisors(value: BigInt): Set[BigInt] = {
    val divs: Set[Int] = (2 to math.sqrt(value.toDouble).toInt).toSet
    divs.flatMap { i =>
      if(value % i == 0) Set(BigInt(i), value / i) else Set.empty[BigInt]
    } 
  }
}