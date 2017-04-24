
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addUsers_Scope0 {
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

     object addUsers_Scope1 {
import helper._

class addUsers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.users.Users],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addUsersForm: play.data.Form[models.users.Users
], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.29*/("""

"""),format.raw/*7.102*/("""

"""),_display_(/*9.2*/admin/*9.7*/.adminMain("Add Users", user)/*9.36*/ {_display_(Seq[Any](format.raw/*9.38*/("""
	"""),format.raw/*10.2*/("""<h3>Update user</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*13.3*/form(action = routes.AdminController.addUsersSubmit(), 'class -> "form-horizontal", 'role->"form")/*13.101*/ {_display_(Seq[Any](format.raw/*13.103*/("""

	"""),_display_(/*15.3*/inputText(addUsersForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*15.71*/("""
    """),_display_(/*16.6*/inputText(addUsersForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*16.81*/("""
    """),_display_(/*17.6*/inputText(addUsersForm("address"), '_label -> "Address",'class -> "form-control")),format.raw/*17.87*/("""
	"""),_display_(/*18.3*/inputText(addUsersForm("number"), '_label -> "Number",'class -> "form-control")),format.raw/*18.82*/("""
    """),_display_(/*19.6*/inputText(addUsersForm("password"), '_label -> "Password",'class -> "form-control")),format.raw/*19.89*/("""
	"""),_display_(/*20.3*/inputText(addUsersForm("points"), '_label -> "Points",'class -> "form-control")),format.raw/*20.82*/("""

	"""),format.raw/*22.2*/("""<!-- Add a submit button -->
	<div class="actions">
		<input type="submit" value="Save" class="btn btn-primary">
		<a href=""""),_display_(/*25.13*/routes/*25.19*/.AdminController.users(0)),format.raw/*25.44*/(""""><button  type="button" value="""),_display_(/*25.76*/routes/*25.82*/.AdminController.users(0)),format.raw/*25.107*/(""" """),format.raw/*25.108*/("""class="btn btn-warning">Cancel</button>
		</a>
	</div>

	""")))}),format.raw/*29.3*/(""" """),format.raw/*29.4*/("""<!-- End Form definition -->

""")))}),format.raw/*31.2*/(""" """),format.raw/*31.3*/("""<!-- End of page content -->"""))
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
object addUsers extends addUsers_Scope0.addUsers_Scope1.addUsers
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:25:37 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/admin/addUsers.scala.html
                  HASH: 28fdd7caa0178449e802ff34f06c0af10e6a78f6
                  MATRIX: 851->109|1023->186|1053->289|1081->292|1093->297|1130->326|1169->328|1198->330|1313->419|1421->517|1462->519|1492->523|1581->591|1613->597|1709->672|1741->678|1843->759|1872->762|1972->841|2004->847|2108->930|2137->933|2237->1012|2267->1015|2419->1140|2434->1146|2480->1171|2539->1203|2554->1209|2601->1234|2631->1235|2719->1293|2747->1294|2808->1325|2836->1326
                  LINES: 30->4|36->5|38->7|40->9|40->9|40->9|40->9|41->10|44->13|44->13|44->13|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|53->22|56->25|56->25|56->25|56->25|56->25|56->25|56->25|60->29|60->29|62->31|62->31
                  -- GENERATED --
              */
          