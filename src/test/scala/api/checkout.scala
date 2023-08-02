package api

import config.BaseHelpers.localhostApp
import io.gatling.core.structure._
import io.gatling.http.Predef._
import io.gatling.core.Predef._

object checkout
{
def checkout(): ChainBuilder = {
  exec(
    http("move_to_checkout")
      .get(localhostApp + "checkout")
  )
}
}
