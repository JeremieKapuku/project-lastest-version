
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminProducts_Scope0 {
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

class adminProducts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("Products", user)/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.AdminController.products(0)),format.raw/*11.61*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*15.18*/for(c <- categories) yield /*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
                    """),format.raw/*16.21*/("""<a href=""""),_display_(/*16.31*/routes/*16.37*/.AdminController.products(c.getId)),format.raw/*16.71*/("""" class="list-group-item">"""),_display_(/*16.98*/c/*16.99*/.getName),format.raw/*16.107*/("""
                      """),format.raw/*17.23*/("""<span class="badge">"""),_display_(/*17.44*/c/*17.45*/.getProducts.size()),format.raw/*17.64*/("""</span>
                    </a>
                """)))}),format.raw/*19.18*/("""
            """),format.raw/*20.13*/("""</div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*24.12*/if(flash.containsKey("success"))/*24.44*/ {_display_(Seq[Any](format.raw/*24.46*/("""
              """),format.raw/*25.15*/("""<div class="alert alert-success">
              """),_display_(/*26.16*/flash/*26.21*/.get("success")),format.raw/*26.36*/("""
              """),format.raw/*27.15*/("""</div>
          """)))}),format.raw/*28.12*/("""
          """),format.raw/*29.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*43.12*/for(p <- products) yield /*43.30*/ {_display_(Seq[Any](format.raw/*43.32*/("""
			        """),format.raw/*44.12*/("""<tr>
                  <td>"""),_display_(/*45.24*/p/*45.25*/.getId),format.raw/*45.31*/("""</td>
                  <td>"""),_display_(/*46.24*/p/*46.25*/.getName),format.raw/*46.33*/("""</td>
                  <td>"""),_display_(/*47.24*/p/*47.25*/.getCategory.getName),format.raw/*47.45*/("""</td>
                  <td>"""),_display_(/*48.24*/p/*48.25*/.getDescription),format.raw/*48.40*/("""</td>
                  <td>"""),_display_(/*49.24*/p/*49.25*/.getStock),format.raw/*49.34*/("""</td>

                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*53.33*/routes/*53.39*/.AdminController.updateProduct(p.getId)),format.raw/*53.78*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*58.33*/routes/*58.39*/.AdminController.deleteProduct(p.getId)),format.raw/*58.78*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				    </tr>
					""")))}),format.raw/*64.7*/(""" """),format.raw/*64.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*68.21*/routes/*68.27*/.AdminController.addProduct()),format.raw/*68.56*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*77.27*/("""{"""),format.raw/*77.28*/("""
        """),format.raw/*78.9*/("""return confirm('Are you sure?');
    """),format.raw/*79.5*/("""}"""),format.raw/*79.6*/("""
  """),format.raw/*80.3*/("""</script>

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
object adminProducts extends adminProducts_Scope0.adminProducts
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:25:36 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/admin/adminProducts.scala.html
                  HASH: 7672cc9377a3f18bfcf28bd31a1c3139c52a06cf
                  MATRIX: 822->1|1010->94|1038->96|1098->129|1126->130|1172->149|1200->150|1228->151|1275->173|1287->178|1323->206|1362->208|1391->211|1657->450|1672->456|1721->484|1972->708|2008->728|2048->730|2097->751|2134->761|2149->767|2204->801|2258->828|2268->829|2298->837|2349->860|2397->881|2407->882|2447->901|2528->951|2569->964|2658->1026|2699->1058|2739->1060|2782->1075|2858->1124|2872->1129|2908->1144|2951->1159|3000->1177|3039->1188|3504->1626|3538->1644|3578->1646|3618->1658|3673->1686|3683->1687|3710->1693|3766->1722|3776->1723|3805->1731|3861->1760|3871->1761|3912->1781|3968->1810|3978->1811|4014->1826|4070->1855|4080->1856|4110->1865|4246->1974|4261->1980|4321->2019|4580->2251|4595->2257|4655->2296|4912->2523|4940->2524|5060->2617|5075->2623|5125->2652|5388->2887|5417->2888|5453->2897|5517->2934|5545->2935|5575->2938
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|42->11|42->11|42->11|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|84->53|84->53|84->53|89->58|89->58|89->58|95->64|95->64|99->68|99->68|99->68|108->77|108->77|109->78|110->79|110->79|111->80
                  -- GENERATED --
              */
          