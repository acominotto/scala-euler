

object LargestPalindromeProduct {
	def apply(numberOfDigits: Int): Int = { 
		val start: Int = if(numberOfDigits == 1) 1 else math.pow(10, numberOfDigits - 1).toInt
		val stop: Int = math.pow(10, numberOfDigits).toInt - 1

		val palindromes = for { 
			i <- start to stop
			j <- start to stop
			x = (i * j) if(isPalindrome((i * j).toString))
		} yield x

		palindromes.max
	}

	def isPalindrome(str: String) = {
		val pivot = str.length / 2

		val left = str.substring(0, pivot)
		val right = str.reverse.substring(0, pivot)

		left == right
	}
}