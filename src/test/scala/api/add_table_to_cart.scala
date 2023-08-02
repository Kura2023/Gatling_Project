package api

import config.BaseHelpers.localhostApp
import io.gatling.core.structure._
import io.gatling.http.Predef._
import io.gatling.core.Predef._

object add_table_to_cart
{
  def addtable(cat: String = "Tables"): ChainBuilder = {
    exec(
      http("add table to cart")
        //.post( localhostApp + "wp-admin/admin-ajax.php")
        .post( localhostApp + "products-category/tables-2")
       // .body(StringBody(string= s"""{"cat":"$cat"}"""))
        .body(StringBody("""("action":"ic_add_to_cart")"""))
    )
  }
}
