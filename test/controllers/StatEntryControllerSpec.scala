package controllers

import org.scalatestplus.play.PlaySpec
import play.api.test.FakeRequest
import play.api.test.Helpers._

/**
  * Created by david on 03/02/18.
  */
class StatEntryControllerSpec extends PlaySpec {

  val testStatEntryController = new StatEntryController(stubControllerComponents())

  "Calling statEntry" should {
    "return a 200" in {
      status(testStatEntryController.statEntry(FakeRequest())) mustEqual 200
    }
  }
}
