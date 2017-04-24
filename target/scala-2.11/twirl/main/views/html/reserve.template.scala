
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object reserve_Scope0 {
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

     object reserve_Scope1 {
import helper._

class reserve extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addProductForm: play.data.Form[models.Product],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.75*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/main("Confirm Reservation", user)/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
	"""),format.raw/*9.2*/("""<h3>Reservation</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.HomeController.addReserveSubmit(user.getEmail), 'class -> "form-horizontal", 'role->"form")/*12.115*/ {_display_(Seq[Any](format.raw/*12.117*/("""
		"""),format.raw/*13.3*/("""<!-- Hidden ID field - required for product updates -->	
		"""),_display_(/*14.4*/inputText(addProductForm("stock"), '_label -> "", 'style -> "display: none")),format.raw/*14.80*/("""
		"""),_display_(/*15.4*/inputText(addProductForm("id"), '_label -> "", 'style -> "display: none")),format.raw/*15.77*/("""
		"""),_display_(/*16.4*/inputText(addProductForm("name"), '_label -> "", 'style -> "display: none")),format.raw/*16.79*/("""

	"""),format.raw/*18.2*/("""<section id="two" class="wrapper alt spotlight style2">
		<div class="inner">
			<div class="content">

				<div class="actions">
					<h2>Your reservation has been stored within our system. Enter continue to confirm your reservation.</h2>
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

  def render(addProductForm:play.data.Form[models.Product],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user)

  def f:((play.data.Form[models.Product],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user) => apply(addProductForm,user)

  def ref: this.type = this

}


}
}

/**/
object reserve extends reserve_Scope0.reserve_Scope1.reserve
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 20:46:13 IST 2017
                  SOURCE: /home/wdd/webapps/project-latest-version/app/views/reserve.scala.html
                  HASH: a11f12cd47a8247d151c83b2e6599d1c9d4eee63
                  MATRIX: 838->109|1006->182|1036->285|1064->288|1105->321|1144->323|1172->325|1287->414|1409->526|1450->528|1480->531|1566->591|1663->667|1693->671|1787->744|1817->748|1913->823|1943->826|2293->1149|2308->1155|2351->1177|2433->1229|2461->1230|2522->1261|2550->1262
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|40->9|43->12|43->12|43->12|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|56->25|56->25|56->25|62->31|62->31|64->33|64->33
                  -- GENERATED --
              */
          