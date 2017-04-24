
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sevenday_Scope0 {
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

     object sevenday_Scope1 {
import helper._

class sevenday extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addSevenDayForm: play.data.Form[models.Product],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.76*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/main("Confirm Loan", user)/*8.28*/ {_display_(Seq[Any](format.raw/*8.30*/("""
	"""),format.raw/*9.2*/("""<h3>Seven Day Loan</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.HomeController.SevenDayLoan(user.getEmail), 'class -> "form-horizontal", 'role->"form")/*12.111*/ {_display_(Seq[Any](format.raw/*12.113*/("""
		"""),format.raw/*13.3*/("""<!-- Hidden ID field - required for product updates -->	
		"""),_display_(/*14.4*/inputText(addSevenDayForm("stock"), '_label -> "", 'style -> "display: none")),format.raw/*14.81*/("""
		"""),_display_(/*15.4*/inputText(addSevenDayForm("id"), '_label -> "", 'style -> "display: none")),format.raw/*15.78*/("""
		"""),_display_(/*16.4*/inputText(addSevenDayForm("name"), '_label -> "", 'style -> "display: none")),format.raw/*16.80*/("""

	"""),format.raw/*18.2*/("""<section id="two" class="wrapper alt spotlight style2">
		<div class="inner">
			<div class="content">

				<div class="actions">
					<h2>Item has been stored within your profile. Enter continue to confirm your loan.</h2>
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

  def render(addSevenDayForm:play.data.Form[models.Product],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addSevenDayForm,user)

  def f:((play.data.Form[models.Product],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addSevenDayForm,user) => apply(addSevenDayForm,user)

  def ref: this.type = this

}


}
}

/**/
object sevenday extends sevenday_Scope0.sevenday_Scope1.sevenday
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 20:11:52 IST 2017
                  SOURCE: /home/wdd/webapps/project-latest-version/app/views/sevenday.scala.html
                  HASH: a27e8c734c486686015d3334fb79fb116c13835f
                  MATRIX: 841->109|1010->183|1040->286|1068->289|1102->315|1141->317|1169->319|1287->411|1405->519|1446->521|1476->524|1562->584|1660->661|1690->665|1785->739|1815->743|1912->819|1942->822|2275->1128|2290->1134|2333->1156|2415->1208|2443->1209|2504->1240|2532->1241
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|40->9|43->12|43->12|43->12|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|56->25|56->25|56->25|62->31|62->31|64->33|64->33
                  -- GENERATED --
              */
          