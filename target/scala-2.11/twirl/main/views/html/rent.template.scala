
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rent_Scope0 {
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

class rent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products", user)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
    <section id="wrapper">

        <section id="products" class="wrapper spotlight style3">
            <div class="content">
                <div class="row">
                    <div class="col-sm-2">
                        <h4>Categories</h4>
                        <div class="list-group">
                                <!-- A link to display all products -->
                            <a href=""""),_display_(/*15.39*/routes/*15.45*/.HomeController.rent(0)),format.raw/*15.68*/("""" class="list-group-item">All categories</a>

                                <!-- Start of For loop - For each c in categories add a list item -->
                                <!-- Also show the number of products in each category -->
                            """),_display_(/*19.30*/for(c <- categories) yield /*19.50*/ {_display_(Seq[Any](format.raw/*19.52*/("""
                                """),format.raw/*20.33*/("""<a href=""""),_display_(/*20.43*/routes/*20.49*/.HomeController.rent(c.getId)),format.raw/*20.78*/("""" class="list-group-item">"""),_display_(/*20.105*/c/*20.106*/.getName),format.raw/*20.114*/("""
                                """),format.raw/*21.33*/("""<span class="badge">"""),_display_(/*21.54*/c/*21.55*/.getProducts.size()),format.raw/*21.74*/("""</span>
                                </a>
                            """)))}),format.raw/*23.30*/("""
                        """),format.raw/*24.25*/("""</div>
                    </div>
                    <div class="col-sm-10">

                        """),_display_(/*28.26*/if(flash.containsKey("success"))/*28.58*/ {_display_(Seq[Any](format.raw/*28.60*/("""
                            """),format.raw/*29.29*/("""<div class="alert alert-success">
                            """),_display_(/*30.30*/flash/*30.35*/.get("success")),format.raw/*30.50*/("""
                            """),format.raw/*31.29*/("""</div>
                        """)))}),format.raw/*32.26*/("""
                            """),format.raw/*33.29*/("""<!-- Two -->
                        <section id="two" class="wrapper alt spotlight style2">
                            <div class="inner">
                                <a href="#" class="image"><img src=""""),_display_(/*36.70*/routes/*36.76*/.Assets.versioned("images/pic01.jpg")),format.raw/*36.113*/("""" alt="" /></a>
                                <div class="content">
                                    <table>
                                        <thead>
                                                <!-- The header row-->
                                            <tr>
                                                <th>ID</th>
                                                <th>Name</th>
                                                <th>Description</th>
                                                <th>Stock</th>
                                                <th>loan length</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                                <!-- Product row(s) -->
                                                <!-- Start of For loop - For each p in products add a row -->
                                            """),_display_(/*52.46*/for(p <- products) yield /*52.64*/ {_display_(Seq[Any](format.raw/*52.66*/("""
                                                """),format.raw/*53.49*/("""<tr>
                                                    <td>"""),_display_(/*54.58*/p/*54.59*/.getId),format.raw/*54.65*/("""</td>
                                                    <td>"""),_display_(/*55.58*/p/*55.59*/.getName),format.raw/*55.67*/("""</td>
                                                    <td>"""),_display_(/*56.58*/p/*56.59*/.getDescription),format.raw/*56.74*/("""</td>
                                                    <td>"""),_display_(/*57.58*/p/*57.59*/.getStock),format.raw/*57.68*/("""</td>

                                                    <td>
                                                            <li>  <a href=""""),_display_(/*60.77*/routes/*60.83*/.HomeController.updateThreeDayLoan(p.getId)),format.raw/*60.126*/("""" class="btn btn-danger" role="button">3 Days</a> </li>
                                                            <li>  <a href=""""),_display_(/*61.77*/routes/*61.83*/.HomeController.updateFiveDayLoan(p.getId)),format.raw/*61.125*/("""" class="btn btn-danger" role="button">5 Days</a> </li>
                                                             <li> <a href=""""),_display_(/*62.77*/routes/*62.83*/.HomeController.updateSevenDayLoan(p.getId)),format.raw/*62.126*/("""" class="btn btn-danger" role="button">7 Days</a> </li>
                                                    </td>


                                                </tr>
                                            """)))}),format.raw/*67.46*/(""" """),format.raw/*67.47*/("""<!-- End of For loop -->
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </section>


                    </div>
                </div>
            </div>
        </section>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*82.27*/("""{"""),format.raw/*82.28*/("""
        """),format.raw/*83.9*/("""return confirm('Are you sure?');
    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/("""
  """),format.raw/*85.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


}

/**/
object rent extends rent_Scope0.rent
              /*
                  -- GENERATED --
                  DATE: Sun Apr 23 21:34:02 IST 2017
                  SOURCE: /home/wdd/webapps/project-latest-version/app/views/rent.scala.html
                  HASH: 8c4f0d5d3e22ea42c9b55350b589935cfb8a63cd
                  MATRIX: 798->1|986->94|1014->96|1074->129|1102->130|1148->149|1176->150|1204->151|1251->173|1281->195|1320->197|1349->200|1824->648|1839->654|1883->677|2178->945|2214->965|2254->967|2315->1000|2352->1010|2367->1016|2417->1045|2472->1072|2483->1073|2513->1081|2574->1114|2622->1135|2632->1136|2672->1155|2777->1229|2830->1254|2961->1358|3002->1390|3042->1392|3099->1421|3189->1484|3203->1489|3239->1504|3296->1533|3359->1565|3416->1594|3653->1804|3668->1810|3727->1847|4733->2826|4767->2844|4807->2846|4884->2895|4973->2957|4983->2958|5010->2964|5100->3027|5110->3028|5139->3036|5229->3099|5239->3100|5275->3115|5365->3178|5375->3179|5405->3188|5572->3328|5587->3334|5652->3377|5811->3509|5826->3515|5890->3557|6049->3689|6064->3695|6129->3738|6375->3953|6404->3954|6865->4387|6894->4388|6930->4397|6994->4434|7022->4435|7052->4438
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|46->15|46->15|46->15|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|54->23|55->24|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|64->33|67->36|67->36|67->36|83->52|83->52|83->52|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|98->67|98->67|113->82|113->82|114->83|115->84|115->84|116->85
                  -- GENERATED --
              */
          