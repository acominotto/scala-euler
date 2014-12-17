
object EvenFibonacciNumbers {

  def sumBelow(limit: Int) = fibonacci.takeWhile(_ < limit).filter(_ %2 == 0).sum

  def fibonacci: Stream[Int] = 1 #:: fibonacci.scanLeft(2)(_ + _)
}