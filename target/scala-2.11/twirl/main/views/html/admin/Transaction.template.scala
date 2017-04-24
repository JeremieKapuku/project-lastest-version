
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Transaction_Scope0 {
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

class Transaction extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Transaction: List[models.Users_library], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("transaction", user)/*4.38*/ {_display_(Seq[Any](format.raw/*4.40*/("""

    """),format.raw/*6.5*/("""<!-- HTML content for the index view -->
    <div class="container-fluid">

            <!-- Wrapper -->
        <section id="wrapper">

                <!-- One -->
            <section id="one" class="wrapper spotlight style1">
                <div class="inner">

                    <div class="content">
                        <div class="row">
                            <div class="content">
                                <table class="table table-bordered table-hover table-condensed">
                                    <thead>
                                            <!-- The header row-->

                                        <h1>All User's Transactions</h1>

                                        <tr>

                                            <th>ID</th>
                                            <th>Product ID</th>
                                            <th>User Email</th>
                                            <th>Date Transaction</th>
                                            <th>Expire Date</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                            <!-- Product row(s) -->
                                            <!-- Start of For loop - For each p in products add a row -->
                                        """),_display_(/*37.42*/for(p <- Transaction) yield /*37.63*/ {_display_(Seq[Any](format.raw/*37.65*/("""
                                            """),format.raw/*38.45*/("""<tr>
                                                <td>"""),_display_(/*39.54*/p/*39.55*/.getId),format.raw/*39.61*/("""</td>
                                                <td>"""),_display_(/*40.54*/p/*40.55*/.getUser_product_id),format.raw/*40.74*/("""</td>
                                                <td>"""),_display_(/*41.54*/p/*41.55*/.getUser_email),format.raw/*41.69*/("""</td>
                                                <td>"""),_display_(/*42.54*/p/*42.55*/.getDate_transaction),format.raw/*42.75*/("""</td>
                                                <td>"""),_display_(/*43.54*/p/*43.55*/.getExpiring_date),format.raw/*43.72*/("""</td>


                                            </tr>
                                        """)))}),format.raw/*47.42*/(""" """),format.raw/*47.43*/("""<!-- End of For loop -->
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    </div>
            </section>
        </section>
    </div>

""")))}))
      }
    }
  }

  def render(Transaction:List[models.Users_library],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(Transaction,user)

  def f:((List[models.Users_library],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (Transaction,user) => apply(Transaction,user)

  def ref: this.type = this

}


}

/**/
object Transaction extends Transaction_Scope0.Transaction
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:25:37 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/admin/Transaction.scala.html
                  HASH: 1fa4f2cae570333526f0002ed42659bc4d84fc90
                  MATRIX: 802->1|964->68|992->70|1052->103|1080->104|1126->123|1154->124|1182->125|1229->147|1241->152|1280->183|1319->185|1351->191|2777->1590|2814->1611|2854->1613|2927->1658|3012->1716|3022->1717|3049->1723|3135->1782|3145->1783|3185->1802|3271->1861|3281->1862|3316->1876|3402->1935|3412->1936|3453->1956|3539->2015|3549->2016|3587->2033|3717->2132|3746->2133
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|37->6|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|78->47|78->47
                  -- GENERATED --
              */
          