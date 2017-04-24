
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object transactionUpdate_Scope0 {
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

     object transactionUpdate_Scope1 {
import helper._

class transactionUpdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(UsersLibraryForm: play.data.Form[models.Users_library], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.84*/("""

"""),format.raw/*6.102*/("""


"""),_display_(/*9.2*/main("Update Transaction", user)/*9.34*/ {_display_(Seq[Any](format.raw/*9.36*/("""


	"""),format.raw/*12.2*/("""<!-- Use the views.html.helpers package to create the form -->

	"""),_display_(/*14.3*/form(action = routes.HomeController.addTransactionSubmit(), 'class -> "form-horizontal", 'role->"form")/*14.106*/ {_display_(Seq[Any](format.raw/*14.108*/("""


        """),format.raw/*17.9*/("""<div style="display: none">

        """),_display_(/*19.10*/inputText(UsersLibraryForm("Id"), '_label -> "Id",'class -> "form-control",'style -> "display: none")),format.raw/*19.111*/("""
        """),_display_(/*20.10*/inputText(UsersLibraryForm("User_product_id"), '_label -> "User_product_id",'class -> "form-control",'style -> "display: none")),format.raw/*20.137*/("""
        """),_display_(/*21.10*/inputText(UsersLibraryForm("User_email"), '_label -> "User_email",'class -> "form-control",'style -> "display: none")),format.raw/*21.127*/("""
        """),_display_(/*22.10*/inputDate(UsersLibraryForm("Date_transaction"), '_label -> "Date_transaction",'class -> "form-control",'style -> "display: none")),format.raw/*22.139*/("""
        """),_display_(/*23.10*/inputDate(UsersLibraryForm("Expiring_date"), '_label -> "Expiring_date",'class -> "form-control",'style -> "display: none")),format.raw/*23.133*/("""

        """),format.raw/*25.9*/("""</div>





	<!-- Add a submit button -->

        <!-- Two -->
    <section id="two" class="wrapper alt spotlight style2">
        <div class="inner">
            <div class="content">
                <div class="actions">
                    <h2>Item has been extended by 3 days.</h2>
                    <input type="submit" value="Continue" class="btn btn-primary">
                    <a href=""""),_display_(/*40.31*/routes/*40.37*/.HomeController.transactionUpdate()),format.raw/*40.72*/(""""></a>
                </div>
            </div>
        </div>
    </section>


	""")))}),format.raw/*47.3*/(""" """),format.raw/*47.4*/("""<!-- End Form definition -->
""")))}),format.raw/*48.2*/("""
"""),format.raw/*49.1*/("""-- End of page content -->"""))
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
object transactionUpdate extends transactionUpdate_Scope0.transactionUpdate_Scope1.transactionUpdate
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 20:11:51 IST 2017
                  SOURCE: /home/wdd/webapps/project-latest-version/app/views/transactionUpdate.scala.html
                  HASH: c8aa886b5639cb3b4ac59666f40ceb5c6b7c85a8
                  MATRIX: 874->109|1051->191|1081->294|1110->298|1150->330|1189->332|1220->336|1312->402|1425->505|1466->507|1504->518|1569->556|1692->657|1729->667|1878->794|1915->804|2054->921|2091->931|2242->1060|2279->1070|2424->1193|2461->1203|2888->1603|2903->1609|2959->1644|3072->1727|3100->1728|3160->1758|3188->1759
                  LINES: 30->4|35->4|37->6|40->9|40->9|40->9|43->12|45->14|45->14|45->14|48->17|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|56->25|71->40|71->40|71->40|78->47|78->47|79->48|80->49
                  -- GENERATED --
              */
          