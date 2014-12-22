
object SumSquareDifference {
	def apply(limit: Int): Double = {
		val sumOfSquare = (1 to limit).map(n => math.pow(n, 2)).sum
		val squareOfSums = math.pow((1 to limit).sum, 2)

		squareOfSums - sumOfSquare
	}
}