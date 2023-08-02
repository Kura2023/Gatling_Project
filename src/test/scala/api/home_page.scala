package api

import config.BaseHelpers.localhostApp
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object home_page {

  def blazeHome(): ChainBuilder = {
    exec(
      http(requestName= "Add items to cart")
        .get(localhostApp)
    )

    }

  def index(): ChainBuilder = {
    exec(
      http(requestName = "Place an Order")
        .get("http://localhost.com/")
    )
  }
  }

