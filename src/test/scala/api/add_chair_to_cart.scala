package api

import config.BaseHelpers.localhostApp
import io.gatling.core.structure._
import io.gatling.http.Predef._
import io.gatling.core.Predef._

object add_chair_to_cart
{
def addchair(): ChainBuilder = {
  exec(
    http("add_chair_to_cart")
      //.post(localhostApp + "wp-admin/admin-ajax.php")
      .post(localhostApp + "products/modern-chair7")
      .body(StringBody("""("action":"ic_add_to_cart")"""))
  )
}
}
