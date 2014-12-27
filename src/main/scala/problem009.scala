
object SpecialPythagoreanTriplet {
	
	def apply(number: Int) = {
		def isPythagore(a: Int, b: Int, c: Int): Boolean = {
			math.pow(a, 2) + math.pow(b, 2) == math.pow(c, 2)
		}

		for { // I'm not at all satisfied with this solution...
			c <- number to (number / 3).toInt by -1
			b <- (number - c - 1) until 2 by -1 if(b > number - b - c)
			a = number - b - c if(isPythagore(a,b,c))
		} yield a * b * c
	}
}