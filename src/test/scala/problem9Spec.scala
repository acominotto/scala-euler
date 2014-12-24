import org.scalatest._

class SpecialPythagoreanTripletSpec extends FlatSpec with Matchers {

  "Special Pythagorean Triplet" should "be 60 for a + b + c = 12" in {
    SpecialPythagoreanTriplet(12).headOption should be(Some(60))
  }

  it should "be None for a + b + c = 13" in {
    SpecialPythagoreanTriplet(13).headOption should be(None)
  }

  it should "be 31875000 for a + b + c = 1000" in {
   SpecialPythagoreanTriplet(1000).headOption should be(Some(31875000)) 
  }
  
}