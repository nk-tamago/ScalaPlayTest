// @GENERATOR:play-routes-compiler
// @SOURCE:/work/play/myproject/conf/routes
// @DATE:Mon May 14 22:57:45 GMT 2018


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
