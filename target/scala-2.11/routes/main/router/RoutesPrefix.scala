
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/project-latest-version/conf/routes
// @DATE:Sun Apr 23 21:34:01 IST 2017


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
