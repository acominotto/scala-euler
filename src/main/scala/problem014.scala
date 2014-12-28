import annotation.tailrec

object LongestCollatzSequence {
	private var cache: Map[BigInt, Seq[BigInt]] = Map(BigInt(1) -> Seq(BigInt(1)))
	def collatz(start: BigInt) = {
		@tailrec def loop(number: BigInt, others: Seq[BigInt]): Seq[BigInt] = {
			if(cache.contains(number)) {
				val result = others ++ cache(number)
				cache += start -> result
				result
			}
			else
				loop(if(number % 2 == 0) number / 2 else {3 * number + 1}, others :+ number)
		}
		loop(start, Seq.empty[BigInt])
	} // had to add caching for perf.

	def apply(limit: Int) = {
		val collatzes = for(i <- 2 to limit) yield (BigInt(i) -> collatz(i).size)
		collatzes.foldLeft(BigInt(0) -> 0)((acc, e) => if(acc._2 > e._2) acc else e)._1
	}
}