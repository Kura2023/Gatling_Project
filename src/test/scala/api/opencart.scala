package api
import config.BaseHelpers. localhostApp
import io.gatling.core.structure._
import io.gatling.http.Predef._
import io.gatling.core.Predef._

object opencart
{
def cart(): ChainBuilder = {
  exec(
    http("click_on_cart")
      .get(localhostApp +"cart")
  )
}
}
