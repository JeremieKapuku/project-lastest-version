
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object threeday_Scope0 {
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

     object threeday_Scope1 {
import helper._

class threeday extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addThreeDayForm: play.data.Form[models.Product],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.76*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/main("Confirm Loan", user)/*8.28*/ {_display_(Seq[Any](format.raw/*8.30*/("""
	"""),format.raw/*9.2*/("""<h3>Three Day Loan</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.HomeController.ThreeDayLoan(user.getEmail), 'class -> "form-horizontal", 'role->"form")/*12.111*/ {_display_(Seq[Any](format.raw/*12.113*/("""
		"""),format.raw/*13.3*/("""<!-- Hidden ID field - required for product updates -->	
		"""),_display_(/*14.4*/inputText(addThreeDayForm("stock"), '_label -> "", 'style -> "display: none")),format.raw/*14.81*/("""
		"""),_display_(/*15.4*/inputText(addThreeDayForm("id"), '_label -> "", 'style -> "display: none")),format.raw/*15.78*/("""
		"""),_display_(/*16.4*/inputText(addThreeDayForm("name"), '_label -> "", 'style -> "display: none")),format.raw/*16.80*/("""

	"""),format.raw/*18.2*/("""<section id="two" class="wrapper alt spotlight style2">
		<div class="inner">
			<div class="content">

				<div class="actions">
					<h2>Processing...</h2>
					<input type="submit" value="Continue" class="btn btn-primary">
					<a href=""""),_display_(/*25.16*/routes/*25.22*/.HomeController.rent()),format.raw/*25.44*/(""""></a>

				</div>
			</div>
		</div>
	</section>
	""")))}),format.raw/*31.3*/(""" """),format.raw/*31.4*/("""<!-- End Form definition -->

""")))}),format.raw/*33.2*/(""" """),format.raw/*33.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addThreeDayForm:play.data.Form[models.Product],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addThreeDayForm,user)

  def f:((play.data.Form[models.Product],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addThreeDayForm,user) => apply(addThreeDayForm,user)

  def ref: this.type = this

}


}
}

/**/
object threeday extends threeday_Scope0.threeday_Scope1.threeday
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 16:50:03 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/threeday.scala.html
                  HASH: ef66f9a6ebb41b415426f911127e325e2c44719e
                  MATRIX: 841->109|1010->183|1040->286|1068->289|1102->315|1141->317|1169->319|1287->411|1405->519|1446->521|1476->524|1562->584|1660->661|1690->665|1785->739|1815->743|1912->819|1942->822|2210->1063|2225->1069|2268->1091|2350->1143|2378->1144|2439->1175|2467->1176
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|40->9|43->12|43->12|43->12|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|56->25|56->25|56->25|62->31|62->31|64->33|64->33
                  -- GENERATED --
              */
          