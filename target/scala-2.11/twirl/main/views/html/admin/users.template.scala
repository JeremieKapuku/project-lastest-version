
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object users_Scope0 {
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

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.users.Users],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Users], user: models.users.Users   ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""


"""),format.raw/*4.1*/("""<!-- Pass page title and content """),format.raw/*4.34*/("""{"""),format.raw/*4.35*/("""html between braces"""),format.raw/*4.54*/("""}"""),format.raw/*4.55*/(""" """),format.raw/*4.56*/("""to the main view -->
"""),_display_(/*5.2*/admin/*5.7*/.adminMain("Users", user)/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""
   """),format.raw/*6.4*/("""<!-- HTML content for the index view -->
  <div class="row" style ="margin-top: 25px">
                  <div class="col-sm-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="SubTitles" style="color:black;">Users</h4>
                    </div>
                    <div class="panel-body">
                            """),_display_(/*14.30*/if(flash.containsKey("success"))/*14.62*/ {_display_(Seq[Any](format.raw/*14.64*/("""
              """),format.raw/*15.15*/("""<div class="alert alert-success">
              """),_display_(/*16.16*/flash/*16.21*/.get("success")),format.raw/*16.36*/("""
              """),format.raw/*17.15*/("""</div>
          """)))}),format.raw/*18.12*/("""
          """),format.raw/*19.11*/("""<table class="table table-bordered table-hover table-condensed" >
          <thead>
          <!-- The header row-->
          <tr >
            <th style="color:black;">Email</th>
            <th style="color:black;">Name</th>
            <th style="color:black;">Address</th>
            <th style="color:black;">Number</th>
            <th style="color:black;">Password</th>
            <th style="color:black;">Points</th>
              <th style="color:black;">Edit</th>
              <th style="color:black;">Delete</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*36.12*/for(p <- users) yield /*36.27*/ {_display_(Seq[Any](format.raw/*36.29*/("""
			        """),format.raw/*37.12*/("""<tr>
                  <td style="color:black;">"""),_display_(/*38.45*/p/*38.46*/.getEmail),format.raw/*38.55*/("""</td>
                  <td style="color:black;">"""),_display_(/*39.45*/p/*39.46*/.getName),format.raw/*39.54*/("""</td>
                  <td style="color:black;">"""),_display_(/*40.45*/p/*40.46*/.getAddress),format.raw/*40.57*/("""</td>
                  <td style="color:black;">"""),_display_(/*41.45*/p/*41.46*/.getNumber),format.raw/*41.56*/("""</td>
                  <td style="color:black;">"""),_display_(/*42.45*/p/*42.46*/.getPassword),format.raw/*42.58*/("""</td>
                  <td style="color:black;">"""),_display_(/*43.45*/p/*43.46*/.getPoints),format.raw/*43.56*/("""</td>

                 <td>
                      <a href=""""),_display_(/*46.33*/routes/*46.39*/.AdminController.updateUsers(p.getEmail)),format.raw/*46.79*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*51.33*/routes/*51.39*/.AdminController.deleteUsers(p.getEmail)),format.raw/*51.79*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				    </tr>
					""")))}),format.raw/*57.7*/(""" """),format.raw/*57.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
      </div>
                </div>


  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*66.27*/("""{"""),format.raw/*66.28*/("""
        """),format.raw/*67.9*/("""return confirm('Are you sure?');
    """),format.raw/*68.5*/("""}"""),format.raw/*68.6*/("""
  """),format.raw/*69.3*/("""</script>
""")))}))
      }
    }
  }

  def render(users:List[models.users.Users],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[models.users.Users],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


}

/**/
object users extends users_Scope0.users
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 12:25:37 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/admin/users.scala.html
                  HASH: e7ca73e7b0311851f945591805c49b30b0b1a368
                  MATRIX: 788->1|945->63|974->66|1034->99|1062->100|1108->119|1136->120|1164->121|1211->143|1223->148|1256->173|1295->175|1325->179|1758->585|1799->617|1839->619|1882->634|1958->683|1972->688|2008->703|2051->718|2100->736|2139->747|2860->1441|2891->1456|2931->1458|2971->1470|3047->1519|3057->1520|3087->1529|3164->1579|3174->1580|3203->1588|3280->1638|3290->1639|3322->1650|3399->1700|3409->1701|3440->1711|3517->1761|3527->1762|3560->1774|3637->1824|3647->1825|3678->1835|3766->1896|3781->1902|3842->1942|4101->2174|4116->2180|4177->2220|4434->2447|4462->2448|4703->2661|4732->2662|4768->2671|4832->2708|4860->2709|4890->2712
                  LINES: 27->1|32->1|35->4|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|36->5|37->6|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|50->19|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|77->46|77->46|77->46|82->51|82->51|82->51|88->57|88->57|97->66|97->66|98->67|99->68|99->68|100->69
                  -- GENERATED --
              */
          