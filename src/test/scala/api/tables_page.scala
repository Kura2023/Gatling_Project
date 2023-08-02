package api

import config.BaseHelpers.localhostApp
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object tables_page {
  def secondpage(): ChainBuilder = {
    exec(
      http("tables page")
        .get(localhostApp +"products-category/tables-2")
    )
  }
}
