
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.Login],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.65*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""

    """),format.raw/*7.5*/("""<section id="two" class="wrapper alt spotlight style2">
        <div class="inner">
            <a href="#" class="image"><img src=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("images/pic08.jpg")),format.raw/*9.93*/("""" alt="" /></a>
            <div class="content">
                <div class="col-xs-12">
                    <h3> Sign in</h3>

                    """),_display_(/*14.22*/if(loginForm.hasGlobalErrors)/*14.51*/{_display_(Seq[Any](format.raw/*14.52*/("""
                        """),format.raw/*15.25*/("""<p class="alert alert-warning">
                        """),_display_(/*16.26*/loginForm/*16.35*/.globalError.message),format.raw/*16.55*/("""
                        """),format.raw/*17.25*/("""</p>
                    """)))}),format.raw/*18.22*/("""
                    """),_display_(/*19.22*/if(flash.containsKey("error"))/*19.52*/{_display_(Seq[Any](format.raw/*19.53*/("""
                        """),format.raw/*20.25*/("""<div class="alert alert-warning">
                        """),_display_(/*21.26*/flash/*21.31*/.get("loginRequired")),format.raw/*21.52*/("""
                        """),format.raw/*22.25*/("""</div>
                    """)))}),format.raw/*23.22*/("""

                    """),_display_(/*25.22*/helper/*25.28*/.form(action = controllers.security.routes.LoginController.loginSubmit())/*25.101*/{_display_(Seq[Any](format.raw/*25.102*/("""
                        """),format.raw/*26.25*/("""<div class="form-group">
                        """),_display_(/*27.26*/inputText(loginForm("email"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*27.129*/("""
                        """),format.raw/*28.25*/("""</div>
                        <div class="form-group">
                        """),_display_(/*30.26*/inputPassword(loginForm("password"),'_label -> "",'class -> "form-control input-xs",'placeholder -> "Password")),format.raw/*30.137*/("""
                        """),format.raw/*31.25*/("""</div>

                        <div class="form-group">
                            <input type="submit" value="Sign In" class="btn btn-primary">
                        </div>
                    """)))}),format.raw/*36.22*/(""" """),format.raw/*36.38*/("""
                """),format.raw/*37.17*/("""</div>
            </div>
        </div>
    </section>


""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 20:11:48 IST 2017
                  SOURCE: /home/wdd/webapps/project-latest-version/app/views/login.scala.html
                  HASH: 65fc1d4a1c42cca193af51c817aa4b3d689e0aa9
                  MATRIX: 782->1|955->64|982->82|1010->155|1037->157|1064->176|1102->177|1134->183|1293->316|1307->322|1364->359|1541->509|1579->538|1618->539|1671->564|1755->621|1773->630|1814->650|1867->675|1924->701|1973->723|2012->753|2051->754|2104->779|2190->838|2204->843|2246->864|2299->889|2358->917|2408->940|2423->946|2506->1019|2546->1020|2599->1045|2676->1095|2801->1198|2854->1223|2962->1304|3095->1415|3148->1440|3378->1639|3407->1655|3452->1672
                  LINES: 27->1|32->1|33->3|34->4|35->5|35->5|35->5|37->7|39->9|39->9|39->9|44->14|44->14|44->14|45->15|46->16|46->16|46->16|47->17|48->18|49->19|49->19|49->19|50->20|51->21|51->21|51->21|52->22|53->23|55->25|55->25|55->25|55->25|56->26|57->27|57->27|58->28|60->30|60->30|61->31|66->36|66->36|67->37
                  -- GENERATED --
              */
          