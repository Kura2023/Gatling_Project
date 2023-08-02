package config

import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef.http
import io.gatling.http.protocol.HttpProtocolBuilder

object BaseHelpers {

  val localhostApp = "http://localhost/"


  def thinkTimer(Min :Int = 2, Max :Int =5): ChainBuilder ={
    pause(Min, Max)
  }
val httpProtocol: HttpProtocolBuilder = http
  .acceptHeader(value = "*/*")
  .acceptEncodingHeader(value= "gzip, deflate, br")
  .acceptLanguageHeader(value= "en-GB,en-US;q=0.8")
  .upgradeInsecureRequestsHeader(value= "1")
  .userAgentHeader( value= "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.5790.99 Safari/537.36")

}
