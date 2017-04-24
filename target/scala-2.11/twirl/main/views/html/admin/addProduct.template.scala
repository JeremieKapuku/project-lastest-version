
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

     object addProduct_Scope1 {
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addProductForm: play.data.Form[models.Product], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.76*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Add Product", user)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
	"""),format.raw/*9.2*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal", 'role->"form")/*12.103*/ {_display_(Seq[Any](format.raw/*12.105*/("""
		
		"""),_display_(/*14.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*14.81*/("""
		"""),_display_(/*15.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*15.95*/("""

		"""),_display_(/*17.4*/select(
			addProductForm("category.id"),
			
			options(Category.options),
			'_label -> "Category", '_default -> "-- Choose a category --",
			'_showConstraints -> false, 'class -> "form-control"
		)),format.raw/*23.4*/("""
		"""),_display_(/*24.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*24.83*/("""

		"""),format.raw/*26.3*/("""<!-- Hidden ID field - required for product updates -->
		"""),_display_(/*27.4*/inputText(addProductForm("id"), '_label -> "", 'style -> "display:none")),format.raw/*27.76*/("""

	"""),format.raw/*29.2*/("""<!-- Add a submit button -->
	<div class="actions">
		<input type="submit" value="Save" class="btn btn-primary">
		<a href=""""),_display_(/*32.13*/routes/*32.19*/.AdminController.products()),format.raw/*32.46*/(""""><button  type="button" value="""),_display_(/*32.78*/routes/*32.84*/.AdminController.products()),format.raw/*32.111*/(""" """),format.raw/*32.112*/("""class="btn btn-warning">Cancel</button>
		</a>
	</div>
	""")))}),format.raw/*35.3*/(""" """),format.raw/*35.4*/("""<!-- End Form definition -->

""")))}),format.raw/*37.2*/(""" """),format.raw/*37.3*/("""<!-- End of page content -->

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
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:25:37 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/admin/addProduct.scala.html
                  HASH: ecaa31f8b0ae8a7c0eb1ccc50cc732cc01bd4a82
                  MATRIX: 853->109|1022->183|1052->286|1080->289|1092->294|1131->325|1170->327|1198->329|1319->424|1429->524|1470->526|1503->533|1601->610|1631->614|1743->705|1774->710|1995->911|2025->915|2125->994|2156->998|2241->1057|2334->1129|2364->1132|2516->1257|2531->1263|2579->1290|2638->1322|2653->1328|2702->1355|2732->1356|2819->1413|2847->1414|2908->1445|2936->1446
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|39->8|40->9|43->12|43->12|43->12|45->14|45->14|46->15|46->15|48->17|54->23|55->24|55->24|57->26|58->27|58->27|60->29|63->32|63->32|63->32|63->32|63->32|63->32|63->32|66->35|66->35|68->37|68->37
                  -- GENERATED --
              */
          