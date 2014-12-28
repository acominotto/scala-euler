import org.scalatest._

class LatticePathsSpec extends FlatSpec with Matchers {

  "Lattice Paths" should "count paths in 2x2 matrices" in {
	   LatticePaths(2) should be(6)
  }

  it should "count paths in 20x20 matrices" in {
    LatticePaths(20) should be(BigInt("137846528820"))
  }

}