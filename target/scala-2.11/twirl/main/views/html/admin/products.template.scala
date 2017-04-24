
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("Products", user)/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
   """),format.raw/*5.4*/("""<!-- HTML content for the index view -->
  <div class="row" style ="margin-top: 25px">
                  <div class="col-sm-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="SubTitles" style="color:black;">Books</h4>
                    </div>
                    <div class="panel-body">
                            """),_display_(/*13.30*/if(flash.containsKey("success"))/*13.62*/ {_display_(Seq[Any](format.raw/*13.64*/("""
              """),format.raw/*14.15*/("""<div class="alert alert-success">
              """),_display_(/*15.16*/flash/*15.21*/.get("success")),format.raw/*15.36*/("""
              """),format.raw/*16.15*/("""</div>
          """)))}),format.raw/*17.12*/("""
                        """),format.raw/*18.25*/("""<p>
                            <a href=""""),_display_(/*19.39*/routes/*19.45*/.AdminController.addProduct()),format.raw/*19.74*/("""">
                                <button class="btn btn-primary">Add a Product</button>
                            </a>
                        </p>
          <table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th style="color:black;">ID</th>
            <th style="color:black;">Name</th>
            <th style="color:black;">Category</th>
            <th style="color:black;">Description</th>
            <th style="color:black;">Stock</th>
              <th style="color:black;">Edit</th>
              <th style="color:black;">Delete</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*39.12*/for(p <- products) yield /*39.30*/ {_display_(Seq[Any](format.raw/*39.32*/("""
			        """),format.raw/*40.12*/("""<tr>
                  <td style="color:black;">"""),_display_(/*41.45*/p/*41.46*/.getId),format.raw/*41.52*/("""</td>
                  <td style="color:black;">"""),_display_(/*42.45*/p/*42.46*/.getName),format.raw/*42.54*/("""</td>
                  <td style="color:black;">"""),_display_(/*43.45*/p/*43.46*/.getCategory.getName),format.raw/*43.66*/("""</td>
                  <td style="color:black;">"""),_display_(/*44.45*/p/*44.46*/.getDescription),format.raw/*44.61*/("""</td>
                  <td style="color:black;">"""),_display_(/*45.45*/p/*45.46*/.getStock),format.raw/*45.55*/("""</td>

                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*49.33*/routes/*49.39*/.AdminController.updateProduct(p.getId)),format.raw/*49.78*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*54.33*/routes/*54.39*/.AdminController.deleteProduct(p.getId)),format.raw/*54.78*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				    </tr>
					""")))}),format.raw/*60.7*/(""" """),format.raw/*60.8*/("""<!-- End of For loop -->
          </tbody>
        </table>

      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*69.27*/("""{"""),format.raw/*69.28*/("""
        """),format.raw/*70.9*/("""return confirm('Are you sure?');
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
  """),format.raw/*72.3*/("""</script>
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
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:25:36 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/admin/products.scala.html
                  HASH: 8d0f32c9aa4c27cd0b90e91bbb5b3e44e1516e08
                  MATRIX: 812->1|1000->94|1028->96|1088->129|1116->130|1162->149|1190->150|1218->151|1265->173|1277->178|1313->206|1352->208|1382->212|1815->618|1856->650|1896->652|1939->667|2015->716|2029->721|2065->736|2108->751|2157->769|2210->794|2279->836|2294->842|2344->871|3176->1676|3210->1694|3250->1696|3290->1708|3366->1757|3376->1758|3403->1764|3480->1814|3490->1815|3519->1823|3596->1873|3606->1874|3647->1894|3724->1944|3734->1945|3770->1960|3847->2010|3857->2011|3887->2020|4023->2129|4038->2135|4098->2174|4357->2406|4372->2412|4432->2451|4689->2678|4717->2679|4944->2878|4973->2879|5009->2888|5073->2925|5101->2926|5131->2929
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|50->19|50->19|50->19|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|80->49|80->49|80->49|85->54|85->54|85->54|91->60|91->60|100->69|100->69|101->70|102->71|102->71|103->72
                  -- GENERATED --
              */
          