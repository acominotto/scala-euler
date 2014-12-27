import collection.mutable.Buffer

object Primes {
	private var cache = Buffer(3, 2)

	private def fillNext() = {
		val h = Stream.from(cache.head + 2, 2).filter(x => cache.forall(x % _ != 0)).head
		cache.prepend(h)
	}

	def below(limit: Int) = {
	  while(cache.head < limit) {
		fillNext()
		//println(cache)
	  }
	  cache.dropWhile(_ > limit).toList
	}
}