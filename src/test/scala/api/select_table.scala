package api

import config.BaseHelpers.localhostApp
import io.gatling.core.structure._
import io.gatling.http.Predef._
import io.gatling.core.Predef._

object select_table {
  def tableselection(): ChainBuilder =
  {
    exec(
      http("click on a table")
        .get(localhostApp + "products/living-room-table7")
    )
  }
}
