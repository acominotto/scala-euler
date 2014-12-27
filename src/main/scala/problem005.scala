
object SmallestMultiple {
	def apply(numberOfDivisors: Int) = {
		val allDivisors = (1 to (numberOfDivisors - 1))
		val divisors = allDivisors.filterNot{ d => 
			val sups = (numberOfDivisors to (d + 1) by -1)
			sups.exists(_ % d == 0)
		} // optimisation
		Stream.from(numberOfDivisors, numberOfDivisors).filter(n => divisors.forall(n % _ == 0)).head
	}
}