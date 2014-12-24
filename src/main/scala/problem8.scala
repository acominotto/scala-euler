
object LargestProductInASeries {

	def apply(input: String, limit: Int) = {
		val intInput = input.trim.split("").filterNot(_.isEmpty).map(_.toInt)

		val scanned = intInput.foldLeft(List.empty[List[Int]]){ (acc, elem) =>
			val firsts = acc.take(limit - 1)
			val added = firsts.map(elem :: _)
			List(elem) :: added ++ acc.drop(limit - 1)
		}

		scanned.foldLeft(BigInt(1)){(acc, e) => 
			val product = e.foldLeft(BigInt(1))(_ * _)
			if(acc > product) acc else product
		}
	}
	
}