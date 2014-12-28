
object LargeSum {
	def apply(numbers: List[BigInt]) = {
		numbers.foldLeft(BigInt(0))(_ + _)
	}
}