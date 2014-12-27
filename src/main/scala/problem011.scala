
object LargestProductInAGrid {
	def apply(grid: Array[Array[Int]], number: Int) = {
		val min = number - 1
		val maxes = for {
			i <- min.until(grid.length )
			j <- min.until(grid(0).length)

		} yield {
			val hor = (for(l <- (j - number + 1).to(j)) yield grid(i)(l)).product
			val vert = (for(k <- (i - number + 1).to(i)) yield grid(k)(j)).product
			val leftDiag = (for(n <- min to 0 by -1; k = i - n; l = j - n) yield grid(k)(l)).product
			val rightDiag = (for(n <- 0  until number; k = i - min + n; l = j - n) yield grid(k)(l)).product
			Set(hor, vert, leftDiag, rightDiag).max
		}
		maxes.max
	}
}