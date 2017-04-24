
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/project-latest-version/conf/routes
// @DATE:Sun Apr 23 21:34:01 IST 2017

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginController LoginController = new controllers.security.ReverseLoginController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginController LoginController = new controllers.security.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
  }

}
