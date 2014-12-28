
object LatticePaths {
	
	def fact(i: BigInt): BigInt = if(i == 1) 1 else i * fact(i - 1)


	def apply(gridSize: Int) = { //use combinatronics (this helps: http://www.mathwarehouse.com/probability/permutations-repeated-items.php)
		fact(gridSize * 2) / (fact(gridSize) * fact(gridSize))
	}
}