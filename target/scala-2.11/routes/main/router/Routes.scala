
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/project-lastest-version/conf/routes
// @DATE:Mon Apr 24 12:25:30 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:72
  AdminController_0: controllers.AdminController,
  // @LINE:107
  LoginController_5: controllers.security.LoginController,
  // @LINE:118
  CountController_1: controllers.CountController,
  // @LINE:120
  AsyncController_3: controllers.AsyncController,
  // @LINE:123
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:72
    AdminController_0: controllers.AdminController,
    // @LINE:107
    LoginController_5: controllers.security.LoginController,
    // @LINE:118
    CountController_1: controllers.CountController,
    // @LINE:120
    AsyncController_3: controllers.AsyncController,
    // @LINE:123
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_2, AdminController_0, LoginController_5, CountController_1, AsyncController_3, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, AdminController_0, LoginController_5, CountController_1, AsyncController_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rent""", """controllers.HomeController.rent(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.HomeController.products(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reserve""", """controllers.HomeController.reserve"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """threeday""", """controllers.HomeController.threeday"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fiveday""", """controllers.HomeController.fiveday"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sevenday""", """controllers.HomeController.sevenday"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addReserveSubmit/""" + "$" + """email<[^/]+>""", """controllers.HomeController.addReserveSubmit(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateReserve/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateReserve(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ThreeDayLoan/""" + "$" + """email<[^/]+>""", """controllers.HomeController.ThreeDayLoan(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """FiveDayLoan/""" + "$" + """email<[^/]+>""", """controllers.HomeController.FiveDayLoan(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """SevenDayLoan/""" + "$" + """email<[^/]+>""", """controllers.HomeController.SevenDayLoan(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profileUpdate""", """controllers.HomeController.profileUpdate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactionUpadate""", """controllers.HomeController.transactionUpdate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """returnUpdate""", """controllers.HomeController.returnUpdate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProfileSubmit""", """controllers.HomeController.addProfileSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTransactionSubmit""", """controllers.HomeController.addTransactionSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addReturnSubmit/""" + "$" + """email<[^/]+>""", """controllers.HomeController.addReturnSubmit(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateThreeDayLoan/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateThreeDayLoan(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateFiveDayLoan/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateFiveDayLoan(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateSevenDayLoan/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateSevenDayLoan(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProfile/""" + "$" + """email<[^/]+>""", """controllers.HomeController.updateProfile(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateTrasaction/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateTransaction(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateReturn/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateReturn(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/products""", """controllers.AdminController.products(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/service""", """controllers.AdminController.service(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/Transaction""", """controllers.AdminController.Transaction"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/rent""", """controllers.HomeController.rent(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/users""", """controllers.AdminController.users(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addUsers""", """controllers.AdminController.addUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addUsersSubmit""", """controllers.AdminController.addUsersSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateUsers/""" + "$" + """email<[^/]+>""", """controllers.AdminController.updateUsers(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delUsers/""" + "$" + """email<[^/]+>""", """controllers.AdminController.deleteUsers(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addproduct""", """controllers.AdminController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addProductSubmit""", """controllers.AdminController.addProductSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.security.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.security.LoginController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUsersSubmit""", """controllers.HomeController.addUsersSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delProduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_2.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_rent2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rent")))
  )
  private[this] lazy val controllers_HomeController_rent2_invoker = createInvoker(
    HomeController_2.rent(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "rent",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """rent"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_products3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_products3_invoker = createInvoker(
    HomeController_2.products(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "products",
      Seq(classOf[Long]),
      "GET",
      """ products accepts a parameter default to 0 (Long)""",
      this.prefix + """products"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_signup4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup4_invoker = createInvoker(
    HomeController_2.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_profile5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile5_invoker = createInvoker(
    HomeController_2.profile(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_reserve6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reserve")))
  )
  private[this] lazy val controllers_HomeController_reserve6_invoker = createInvoker(
    HomeController_2.reserve,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "reserve",
      Nil,
      "GET",
      """""",
      this.prefix + """reserve"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_threeday7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("threeday")))
  )
  private[this] lazy val controllers_HomeController_threeday7_invoker = createInvoker(
    HomeController_2.threeday,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "threeday",
      Nil,
      "GET",
      """""",
      this.prefix + """threeday"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_fiveday8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fiveday")))
  )
  private[this] lazy val controllers_HomeController_fiveday8_invoker = createInvoker(
    HomeController_2.fiveday,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "fiveday",
      Nil,
      "GET",
      """""",
      this.prefix + """fiveday"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_sevenday9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sevenday")))
  )
  private[this] lazy val controllers_HomeController_sevenday9_invoker = createInvoker(
    HomeController_2.sevenday,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sevenday",
      Nil,
      "GET",
      """""",
      this.prefix + """sevenday"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_addReserveSubmit10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addReserveSubmit/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addReserveSubmit10_invoker = createInvoker(
    HomeController_2.addReserveSubmit(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addReserveSubmit",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """addReserveSubmit/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_updateReserve11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateReserve/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateReserve11_invoker = createInvoker(
    HomeController_2.updateReserve(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateReserve",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateReserve/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_ThreeDayLoan12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ThreeDayLoan/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_ThreeDayLoan12_invoker = createInvoker(
    HomeController_2.ThreeDayLoan(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ThreeDayLoan",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ThreeDayLoan/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_FiveDayLoan13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("FiveDayLoan/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_FiveDayLoan13_invoker = createInvoker(
    HomeController_2.FiveDayLoan(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "FiveDayLoan",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """FiveDayLoan/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_SevenDayLoan14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("SevenDayLoan/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_SevenDayLoan14_invoker = createInvoker(
    HomeController_2.SevenDayLoan(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "SevenDayLoan",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """SevenDayLoan/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_profileUpdate15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profileUpdate")))
  )
  private[this] lazy val controllers_HomeController_profileUpdate15_invoker = createInvoker(
    HomeController_2.profileUpdate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profileUpdate",
      Nil,
      "GET",
      """""",
      this.prefix + """profileUpdate"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_transactionUpdate16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactionUpadate")))
  )
  private[this] lazy val controllers_HomeController_transactionUpdate16_invoker = createInvoker(
    HomeController_2.transactionUpdate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "transactionUpdate",
      Nil,
      "GET",
      """""",
      this.prefix + """transactionUpadate"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_HomeController_returnUpdate17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("returnUpdate")))
  )
  private[this] lazy val controllers_HomeController_returnUpdate17_invoker = createInvoker(
    HomeController_2.returnUpdate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "returnUpdate",
      Nil,
      "GET",
      """""",
      this.prefix + """returnUpdate"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_HomeController_addProfileSubmit18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProfileSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProfileSubmit18_invoker = createInvoker(
    HomeController_2.addProfileSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProfileSubmit",
      Nil,
      "GET",
      """""",
      this.prefix + """addProfileSubmit"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_HomeController_addTransactionSubmit19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTransactionSubmit")))
  )
  private[this] lazy val controllers_HomeController_addTransactionSubmit19_invoker = createInvoker(
    HomeController_2.addTransactionSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addTransactionSubmit",
      Nil,
      "GET",
      """""",
      this.prefix + """addTransactionSubmit"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_HomeController_addReturnSubmit20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addReturnSubmit/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addReturnSubmit20_invoker = createInvoker(
    HomeController_2.addReturnSubmit(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addReturnSubmit",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """addReturnSubmit/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_HomeController_updateThreeDayLoan21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateThreeDayLoan/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateThreeDayLoan21_invoker = createInvoker(
    HomeController_2.updateThreeDayLoan(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateThreeDayLoan",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateThreeDayLoan/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_HomeController_updateFiveDayLoan22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateFiveDayLoan/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateFiveDayLoan22_invoker = createInvoker(
    HomeController_2.updateFiveDayLoan(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateFiveDayLoan",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateFiveDayLoan/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_HomeController_updateSevenDayLoan23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateSevenDayLoan/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateSevenDayLoan23_invoker = createInvoker(
    HomeController_2.updateSevenDayLoan(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateSevenDayLoan",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateSevenDayLoan/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_HomeController_updateProfile24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProfile/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProfile24_invoker = createInvoker(
    HomeController_2.updateProfile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProfile",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """updateProfile/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_HomeController_updateTransaction25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateTrasaction/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateTransaction25_invoker = createInvoker(
    HomeController_2.updateTransaction(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateTransaction",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateTrasaction/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_HomeController_updateReturn26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateReturn/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateReturn26_invoker = createInvoker(
    HomeController_2.updateReturn(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateReturn",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateReturn/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_AdminController_products27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/products")))
  )
  private[this] lazy val controllers_AdminController_products27_invoker = createInvoker(
    AdminController_0.products(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "products",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/products"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_AdminController_service28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/service")))
  )
  private[this] lazy val controllers_AdminController_service28_invoker = createInvoker(
    AdminController_0.service(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "service",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/service"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_AdminController_Transaction29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/Transaction")))
  )
  private[this] lazy val controllers_AdminController_Transaction29_invoker = createInvoker(
    AdminController_0.Transaction,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "Transaction",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/Transaction"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_HomeController_rent30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/rent")))
  )
  private[this] lazy val controllers_HomeController_rent30_invoker = createInvoker(
    HomeController_2.rent(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "rent",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/rent"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_AdminController_users31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users")))
  )
  private[this] lazy val controllers_AdminController_users31_invoker = createInvoker(
    AdminController_0.users(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "users",
      Seq(classOf[Long]),
      "GET",
      """ users accepts a parameter default to 0 (Long)""",
      this.prefix + """admin/users"""
    )
  )

  // @LINE:82
  private[this] lazy val controllers_AdminController_addUsers32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addUsers")))
  )
  private[this] lazy val controllers_AdminController_addUsers32_invoker = createInvoker(
    AdminController_0.addUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/addUsers"""
    )
  )

  // @LINE:84
  private[this] lazy val controllers_AdminController_addUsersSubmit33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addUsersSubmit")))
  )
  private[this] lazy val controllers_AdminController_addUsersSubmit33_invoker = createInvoker(
    AdminController_0.addUsersSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addUsersSubmit",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/addUsersSubmit"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_AdminController_updateUsers34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateUsers/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateUsers34_invoker = createInvoker(
    AdminController_0.updateUsers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateUsers",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/updateUsers/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:89
  private[this] lazy val controllers_AdminController_deleteUsers35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delUsers/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteUsers35_invoker = createInvoker(
    AdminController_0.deleteUsers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteUsers",
      Seq(classOf[String]),
      "GET",
      """ Delete a user by an email passed as a parameter""",
      this.prefix + """admin/delUsers/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:92
  private[this] lazy val controllers_AdminController_addProduct36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addproduct")))
  )
  private[this] lazy val controllers_AdminController_addProduct36_invoker = createInvoker(
    AdminController_0.addProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProduct",
      Nil,
      "GET",
      """ Request to load the add product form""",
      this.prefix + """admin/addproduct"""
    )
  )

  // @LINE:95
  private[this] lazy val controllers_AdminController_addProductSubmit37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminController_addProductSubmit37_invoker = createInvoker(
    AdminController_0.addProductSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProductSubmit",
      Nil,
      "POST",
      """ Data submitted by the form""",
      this.prefix + """admin/addProductSubmit"""
    )
  )

  // @LINE:98
  private[this] lazy val controllers_AdminController_deleteProduct38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteProduct38_invoker = createInvoker(
    AdminController_0.deleteProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      """ Delete a product by an id passed as a parameter""",
      this.prefix + """admin/delProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:101
  private[this] lazy val controllers_AdminController_updateProduct39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateProduct39_invoker = createInvoker(
    AdminController_0.updateProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      """ Update a product by id""",
      this.prefix + """admin/updateProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:107
  private[this] lazy val controllers_security_LoginController_login40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginController_login40_invoker = createInvoker(
    LoginController_5.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginController",
      "login",
      Nil,
      "GET",
      """###############
 Login Routes #
###############""",
      this.prefix + """login"""
    )
  )

  // @LINE:108
  private[this] lazy val controllers_security_LoginController_loginSubmit41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_security_LoginController_loginSubmit41_invoker = createInvoker(
    LoginController_5.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:109
  private[this] lazy val controllers_security_LoginController_logout42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginController_logout42_invoker = createInvoker(
    LoginController_5.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:112
  private[this] lazy val controllers_HomeController_addUsersSubmit43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUsersSubmit")))
  )
  private[this] lazy val controllers_HomeController_addUsersSubmit43_invoker = createInvoker(
    HomeController_2.addUsersSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUsersSubmit",
      Nil,
      "POST",
      """ Data submitted by the form""",
      this.prefix + """addUsersSubmit"""
    )
  )

  // @LINE:115
  private[this] lazy val controllers_HomeController_deleteProduct44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProduct44_invoker = createInvoker(
    HomeController_2.deleteProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      """ Delete a product by an id passed as a parameter""",
      this.prefix + """delProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:118
  private[this] lazy val controllers_CountController_count45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count45_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:120
  private[this] lazy val controllers_AsyncController_message46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message46_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:123
  private[this] lazy val controllers_Assets_versioned47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned47_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:9
    case controllers_HomeController_about1_route(params) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_2.about)
      }
  
    // @LINE:11
    case controllers_HomeController_rent2_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_rent2_invoker.call(HomeController_2.rent(cat))
      }
  
    // @LINE:14
    case controllers_HomeController_products3_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_products3_invoker.call(HomeController_2.products(cat))
      }
  
    // @LINE:16
    case controllers_HomeController_signup4_route(params) =>
      call { 
        controllers_HomeController_signup4_invoker.call(HomeController_2.signup)
      }
  
    // @LINE:18
    case controllers_HomeController_profile5_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_profile5_invoker.call(HomeController_2.profile(cat))
      }
  
    // @LINE:20
    case controllers_HomeController_reserve6_route(params) =>
      call { 
        controllers_HomeController_reserve6_invoker.call(HomeController_2.reserve)
      }
  
    // @LINE:22
    case controllers_HomeController_threeday7_route(params) =>
      call { 
        controllers_HomeController_threeday7_invoker.call(HomeController_2.threeday)
      }
  
    // @LINE:24
    case controllers_HomeController_fiveday8_route(params) =>
      call { 
        controllers_HomeController_fiveday8_invoker.call(HomeController_2.fiveday)
      }
  
    // @LINE:26
    case controllers_HomeController_sevenday9_route(params) =>
      call { 
        controllers_HomeController_sevenday9_invoker.call(HomeController_2.sevenday)
      }
  
    // @LINE:28
    case controllers_HomeController_addReserveSubmit10_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_addReserveSubmit10_invoker.call(HomeController_2.addReserveSubmit(email))
      }
  
    // @LINE:30
    case controllers_HomeController_updateReserve11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateReserve11_invoker.call(HomeController_2.updateReserve(id))
      }
  
    // @LINE:32
    case controllers_HomeController_ThreeDayLoan12_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_ThreeDayLoan12_invoker.call(HomeController_2.ThreeDayLoan(email))
      }
  
    // @LINE:34
    case controllers_HomeController_FiveDayLoan13_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_FiveDayLoan13_invoker.call(HomeController_2.FiveDayLoan(email))
      }
  
    // @LINE:36
    case controllers_HomeController_SevenDayLoan14_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_SevenDayLoan14_invoker.call(HomeController_2.SevenDayLoan(email))
      }
  
    // @LINE:38
    case controllers_HomeController_profileUpdate15_route(params) =>
      call { 
        controllers_HomeController_profileUpdate15_invoker.call(HomeController_2.profileUpdate)
      }
  
    // @LINE:40
    case controllers_HomeController_transactionUpdate16_route(params) =>
      call { 
        controllers_HomeController_transactionUpdate16_invoker.call(HomeController_2.transactionUpdate)
      }
  
    // @LINE:42
    case controllers_HomeController_returnUpdate17_route(params) =>
      call { 
        controllers_HomeController_returnUpdate17_invoker.call(HomeController_2.returnUpdate)
      }
  
    // @LINE:44
    case controllers_HomeController_addProfileSubmit18_route(params) =>
      call { 
        controllers_HomeController_addProfileSubmit18_invoker.call(HomeController_2.addProfileSubmit)
      }
  
    // @LINE:46
    case controllers_HomeController_addTransactionSubmit19_route(params) =>
      call { 
        controllers_HomeController_addTransactionSubmit19_invoker.call(HomeController_2.addTransactionSubmit)
      }
  
    // @LINE:48
    case controllers_HomeController_addReturnSubmit20_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_addReturnSubmit20_invoker.call(HomeController_2.addReturnSubmit(email))
      }
  
    // @LINE:50
    case controllers_HomeController_updateThreeDayLoan21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateThreeDayLoan21_invoker.call(HomeController_2.updateThreeDayLoan(id))
      }
  
    // @LINE:52
    case controllers_HomeController_updateFiveDayLoan22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateFiveDayLoan22_invoker.call(HomeController_2.updateFiveDayLoan(id))
      }
  
    // @LINE:54
    case controllers_HomeController_updateSevenDayLoan23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateSevenDayLoan23_invoker.call(HomeController_2.updateSevenDayLoan(id))
      }
  
    // @LINE:56
    case controllers_HomeController_updateProfile24_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_HomeController_updateProfile24_invoker.call(HomeController_2.updateProfile(email))
      }
  
    // @LINE:58
    case controllers_HomeController_updateTransaction25_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateTransaction25_invoker.call(HomeController_2.updateTransaction(id))
      }
  
    // @LINE:60
    case controllers_HomeController_updateReturn26_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateReturn26_invoker.call(HomeController_2.updateReturn(id))
      }
  
    // @LINE:72
    case controllers_AdminController_products27_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_AdminController_products27_invoker.call(AdminController_0.products(cat))
      }
  
    // @LINE:73
    case controllers_AdminController_service28_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_AdminController_service28_invoker.call(AdminController_0.service(cat))
      }
  
    // @LINE:75
    case controllers_AdminController_Transaction29_route(params) =>
      call { 
        controllers_AdminController_Transaction29_invoker.call(AdminController_0.Transaction)
      }
  
    // @LINE:77
    case controllers_HomeController_rent30_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_rent30_invoker.call(HomeController_2.rent(cat))
      }
  
    // @LINE:80
    case controllers_AdminController_users31_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_AdminController_users31_invoker.call(AdminController_0.users(cat))
      }
  
    // @LINE:82
    case controllers_AdminController_addUsers32_route(params) =>
      call { 
        controllers_AdminController_addUsers32_invoker.call(AdminController_0.addUsers)
      }
  
    // @LINE:84
    case controllers_AdminController_addUsersSubmit33_route(params) =>
      call { 
        controllers_AdminController_addUsersSubmit33_invoker.call(AdminController_0.addUsersSubmit)
      }
  
    // @LINE:86
    case controllers_AdminController_updateUsers34_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_AdminController_updateUsers34_invoker.call(AdminController_0.updateUsers(email))
      }
  
    // @LINE:89
    case controllers_AdminController_deleteUsers35_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_AdminController_deleteUsers35_invoker.call(AdminController_0.deleteUsers(email))
      }
  
    // @LINE:92
    case controllers_AdminController_addProduct36_route(params) =>
      call { 
        controllers_AdminController_addProduct36_invoker.call(AdminController_0.addProduct)
      }
  
    // @LINE:95
    case controllers_AdminController_addProductSubmit37_route(params) =>
      call { 
        controllers_AdminController_addProductSubmit37_invoker.call(AdminController_0.addProductSubmit)
      }
  
    // @LINE:98
    case controllers_AdminController_deleteProduct38_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_deleteProduct38_invoker.call(AdminController_0.deleteProduct(id))
      }
  
    // @LINE:101
    case controllers_AdminController_updateProduct39_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateProduct39_invoker.call(AdminController_0.updateProduct(id))
      }
  
    // @LINE:107
    case controllers_security_LoginController_login40_route(params) =>
      call { 
        controllers_security_LoginController_login40_invoker.call(LoginController_5.login)
      }
  
    // @LINE:108
    case controllers_security_LoginController_loginSubmit41_route(params) =>
      call { 
        controllers_security_LoginController_loginSubmit41_invoker.call(LoginController_5.loginSubmit)
      }
  
    // @LINE:109
    case controllers_security_LoginController_logout42_route(params) =>
      call { 
        controllers_security_LoginController_logout42_invoker.call(LoginController_5.logout)
      }
  
    // @LINE:112
    case controllers_HomeController_addUsersSubmit43_route(params) =>
      call { 
        controllers_HomeController_addUsersSubmit43_invoker.call(HomeController_2.addUsersSubmit)
      }
  
    // @LINE:115
    case controllers_HomeController_deleteProduct44_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProduct44_invoker.call(HomeController_2.deleteProduct(id))
      }
  
    // @LINE:118
    case controllers_CountController_count45_route(params) =>
      call { 
        controllers_CountController_count45_invoker.call(CountController_1.count)
      }
  
    // @LINE:120
    case controllers_AsyncController_message46_route(params) =>
      call { 
        controllers_AsyncController_message46_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:123
    case controllers_Assets_versioned47_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned47_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
