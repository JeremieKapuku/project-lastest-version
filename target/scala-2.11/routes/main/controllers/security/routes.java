
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/project-lastest-version/conf/routes
// @DATE:Mon Apr 24 12:25:30 IST 2017

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginController LoginController = new controllers.security.ReverseLoginController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginController LoginController = new controllers.security.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
  }

}
