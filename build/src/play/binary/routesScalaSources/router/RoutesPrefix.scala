// @GENERATOR:play-routes-compiler
// @SOURCE:/home/oracle/test/ScalaPlayTest/conf/routes
// @DATE:Wed May 23 04:21:10 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
