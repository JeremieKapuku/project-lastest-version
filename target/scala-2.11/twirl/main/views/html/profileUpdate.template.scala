
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profileUpdate_Scope0 {
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

     object profileUpdate_Scope1 {
import helper._

class profileUpdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.users.Users],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addUsersForm: play.data.Form[models.users.Users], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.78*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/main("Update Profile", user)/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""
	
	
	"""),format.raw/*11.2*/("""<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.HomeController.addProfileSubmit(), 'class -> "form-horizontal", 'role->"form")/*12.102*/ {_display_(Seq[Any](format.raw/*12.104*/("""
	"""),format.raw/*13.2*/("""<br>
	<br>
	<br>
	<h3>Update your Profile</h3>
	"""),_display_(/*17.3*/inputText(addUsersForm("email"), '_label -> "", 'style -> "display: none")),format.raw/*17.77*/("""	
	"""),_display_(/*18.3*/inputText(addUsersForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*18.78*/("""
    """),_display_(/*19.6*/inputText(addUsersForm("address"), '_label -> "Address",'class -> "form-control")),format.raw/*19.87*/("""
	"""),_display_(/*20.3*/inputText(addUsersForm("number"), '_label -> "Number",'class -> "form-control")),format.raw/*20.82*/("""
    """),_display_(/*21.6*/inputText(addUsersForm("password"), '_label -> "Password",'class -> "form-control")),format.raw/*21.89*/("""
	"""),format.raw/*22.2*/("""<!-- Add a submit button -->
	<div class="actions">
		<input type="submit" value="Save" class="btn btn-primary">
		<a href=""""),_display_(/*25.13*/routes/*25.19*/.HomeController.profile()),format.raw/*25.44*/(""""><button  type="button" value= """),_display_(/*25.77*/routes/*25.83*/.HomeController.profile()),format.raw/*25.108*/(""" """),format.raw/*25.109*/("""class="btn btn-warning">Cancel</button>
		</a>
	</div>
	""")))}),format.raw/*28.3*/(""" """),format.raw/*28.4*/("""<!-- End Form definition -->
""")))}))
      }
    }
  }

  def render(addUsersForm:play.data.Form[models.users.Users],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addUsersForm,user)

  def f:((play.data.Form[models.users.Users],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addUsersForm,user) => apply(addUsersForm,user)

  def ref: this.type = this

}


}
}

/**/
object profileUpdate extends profileUpdate_Scope0.profileUpdate_Scope1.profileUpdate
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 20:11:52 IST 2017
                  SOURCE: /home/wdd/webapps/project-latest-version/app/views/profileUpdate.scala.html
                  HASH: 6b468a2ec9a1d395653bae3cd88369eb34c7c8e1
                  MATRIX: 860->109|1031->185|1061->288|1089->291|1125->319|1164->321|1197->327|1288->392|1397->491|1438->493|1467->495|1542->544|1637->618|1667->622|1763->697|1795->703|1897->784|1926->787|2026->866|2058->872|2162->955|2191->957|2343->1082|2358->1088|2404->1113|2464->1146|2479->1152|2526->1177|2556->1178|2643->1235|2671->1236
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|42->11|43->12|43->12|43->12|44->13|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|56->25|56->25|56->25|56->25|56->25|56->25|56->25|59->28|59->28
                  -- GENERATED --
              */
          