package api

import config.BaseHelpers.localhostApp
import io.gatling.core.structure._
import io.gatling.http.Predef._
import io.gatling.core.Predef._

object randomchair
{
def selectchair(): ChainBuilder =
{
exec(
  http("select_random_chair")
    .get( localhostApp +"products/modern-chair7")
)
}
}
