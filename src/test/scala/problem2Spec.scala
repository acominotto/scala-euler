import org.scalatest._

class EvenFibonacciNumbersSpec extends FlatSpec with Matchers {

  "sum of even of fibonacci numbers" should "equal 2 for all fib below 5" in {
    EvenFibonacciNumbers.sumBelow(5) should be(2)
  }

  it should "equal 44 for all fib below 100" in {
    EvenFibonacciNumbers.sumBelow(100) should be(44)
  }

  it should "equal 4613732 for all fib below 4000000" in {
    EvenFibonacciNumbers.sumBelow(4000000) should be(4613732)
  }
  
}
