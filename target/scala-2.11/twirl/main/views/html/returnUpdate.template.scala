
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object returnUpdate_Scope0 {
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

     object returnUpdate_Scope1 {
import helper._

class returnUpdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(UsersLibraryForm: play.data.Form[models.Users_library], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.84*/("""

"""),format.raw/*6.102*/("""


"""),_display_(/*9.2*/main("Return Books/Exam Paper", user)/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
	"""),format.raw/*10.2*/("""<h3>Return your product</h3>


	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*14.3*/form(action = routes.HomeController.addReturnSubmit(user.getEmail), 'class -> "form-horizontal", 'role->"form")/*14.114*/ {_display_(Seq[Any](format.raw/*14.116*/("""
		"""),format.raw/*15.3*/("""<div style="display: none">
		"""),_display_(/*16.4*/inputText(UsersLibraryForm("id"), '_label -> "", 'hidden -> "hidden", 'style -> "display: none")),format.raw/*16.100*/("""
		"""),_display_(/*17.4*/inputText(UsersLibraryForm("user_product_id"), '_label -> "user_product_id",'class -> "form-control", 'style -> "display: none")),format.raw/*17.132*/("""
		"""),_display_(/*18.4*/inputText(UsersLibraryForm("user_email"), '_label -> "user_email",'class -> "form-control", 'style -> "display: none")),format.raw/*18.122*/("""
		"""),_display_(/*19.4*/inputText(UsersLibraryForm("date_transaction"), '_label -> "date_transaction",'class -> "form-control", 'style -> "display: none")),format.raw/*19.134*/("""
		"""),_display_(/*20.4*/inputText(UsersLibraryForm("expiring_date"), '_label -> "expiring_date",'class -> "form-control", 'style -> "display: none")),format.raw/*20.128*/("""
		"""),_display_(/*21.4*/inputText(UsersLibraryForm("extendable"), '_label -> "extendable",'class -> "form-control", 'style -> "display: none")),format.raw/*21.122*/("""
		"""),_display_(/*22.4*/inputText(UsersLibraryForm("returned"), '_label -> "returned",'class -> "form-control", 'style -> "display: none")),format.raw/*22.118*/("""
        """),_display_(/*23.10*/inputText(UsersLibraryForm("tempo"), '_label -> "", 'style -> "display: none")),format.raw/*23.88*/("""
        """),_display_(/*24.10*/inputText(UsersLibraryForm("tempo2"), '_label -> "", 'style -> "display: none")),format.raw/*24.89*/("""
        """),_display_(/*25.10*/inputText(UsersLibraryForm("tempo3"), '_label -> "", 'style -> "display: none")),format.raw/*25.89*/("""
			"""),format.raw/*26.4*/("""</div>



	<!-- Add a submit button -->

		<!-- Two -->
	<section id="two" class="wrapper alt spotlight style2">
		<div class="inner">
			<div class="content">

				<div class="actions">
					<h2>Item has been returned. Points has been retrieved.</h2>
					<input type="submit" value="Continue" class="btn btn-primary">
					<a href=""""),_display_(/*40.16*/routes/*40.22*/.HomeController.returnUpdate()),format.raw/*40.52*/(""""></a>

				</div>
			</div>
		</div>
	</section>
	""")))}),format.raw/*46.3*/(""" """),format.raw/*46.4*/("""<!-- End Form definition -->
""")))}),format.raw/*47.2*/("""
"""),format.raw/*48.1*/("""-- End of page content -->"""))
      }
    }
  }

  def render(UsersLibraryForm:play.data.Form[models.Users_library],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(UsersLibraryForm,user)

  def f:((play.data.Form[models.Users_library],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (UsersLibraryForm,user) => apply(UsersLibraryForm,user)

  def ref: this.type = this

}


}
}

/**/
object returnUpdate extends returnUpdate_Scope0.returnUpdate_Scope1.returnUpdate
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:25:32 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/returnUpdate.scala.html
                  HASH: 473ea82236b8609016430d6e2c1407cf073d8d1a
                  MATRIX: 859->109|1036->191|1066->294|1095->298|1140->335|1179->337|1208->339|1331->436|1452->547|1493->549|1523->552|1580->583|1698->679|1728->683|1878->811|1908->815|2048->933|2078->937|2230->1067|2260->1071|2406->1195|2436->1199|2576->1317|2606->1321|2742->1435|2779->1445|2878->1523|2915->1533|3015->1612|3052->1622|3152->1701|3183->1705|3545->2040|3560->2046|3611->2076|3693->2128|3721->2129|3781->2159|3809->2160
                  LINES: 30->4|35->4|37->6|40->9|40->9|40->9|41->10|45->14|45->14|45->14|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|57->26|71->40|71->40|71->40|77->46|77->46|78->47|79->48
                  -- GENERATED --
              */
          