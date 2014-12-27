object MultiplesOf3And5 {

  def sumBelow(limit: Int): Int = {
    val by3 = 0 until limit by 3
    val by5 = 0 until limit by 5

    val set = by3.toSet ++ by5.toSet
    set.sum
  }
}
