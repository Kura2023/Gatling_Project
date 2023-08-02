package api

import config.BaseHelpers.localhostApp
import io.gatling.core.structure._
import io.gatling.http.Predef._
import io.gatling.core.Predef._

object chairs_page
{
def clickonchairs(): ChainBuilder = {
  exec (
    http("chairs tab")
      .get( localhostApp +"chairs")
  )
}


}
