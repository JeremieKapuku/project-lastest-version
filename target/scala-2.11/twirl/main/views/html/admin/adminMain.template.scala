
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMain_Scope0 {
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

     object adminMain_Scope1 {
import controllers.security.LoginController
import controllers.security

class adminMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.Users,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, user: models.users.Users)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.58*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*8.62*/("""
        """),format.raw/*9.9*/("""<title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

            <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

            <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="https://afeld.github.io/emoji-css/emoji.css" rel="stylesheet">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("assets/css/main.css")),format.raw/*21.100*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*22.59*/routes/*22.65*/.Assets.versioned("images/favicon.png")),format.raw/*22.104*/("""">
    </head>
    <body>






<!-- Page Wrapper -->
            <div id="page-wrapper">
                        <!--OTHER PAGE-->
                        <!-- Header -->
"""),_display_(/*35.2*/if(title == "service" || title == "transaction")/*35.50*/{_display_(Seq[Any](format.raw/*35.51*/("""
                    """),format.raw/*36.21*/("""<header id="header">
			
                        <h1><a href=""""),_display_(/*38.39*/routes/*38.45*/.HomeController.index()),format.raw/*38.68*/(""""><span class="glyphicon glyphicon-book"></span>DUT Library</a></h1>
                        <nav>
                            <a href="#menu">Menu</a>
                        </nav>
			
                    </header>
""")))}),format.raw/*44.2*/("""

            """),format.raw/*46.13*/("""<!-- Menu -->
        <nav id="menu">
            <div class="inner">
                <h2>Menu</h2>
                <ul class="links">
                     <li """),_display_(/*51.27*/if(title == "service")/*51.49*/{_display_(Seq[Any](format.raw/*51.50*/("""class="active"""")))}),format.raw/*51.65*/("""><a href=""""),_display_(/*51.76*/routes/*51.82*/.AdminController.service()),format.raw/*51.108*/("""">Service</a></li>
                    <li """),_display_(/*52.26*/if(title == "transaction")/*52.52*/{_display_(Seq[Any](format.raw/*52.53*/("""class="active"""")))}),format.raw/*52.68*/("""><a href=""""),_display_(/*52.79*/routes/*52.85*/.AdminController.Transaction()),format.raw/*52.115*/("""">Transactions</a></li>
                    <li """),_display_(/*53.26*/if(title == "Login")/*53.46*/{_display_(Seq[Any](format.raw/*53.47*/("""class="active"""")))}),format.raw/*53.62*/(""">
                    """),_display_(/*54.22*/if(user != null)/*54.38*/{_display_(Seq[Any](format.raw/*54.39*/("""
                        """),format.raw/*55.25*/("""<a href=""""),_display_(/*55.35*/controllers/*55.46*/.security.routes.LoginController.logout()),format.raw/*55.87*/("""">Logout """),_display_(/*55.97*/user/*55.101*/.getName()),format.raw/*55.111*/("""</a>
                    """)))}/*56.23*/else/*56.28*/{_display_(Seq[Any](format.raw/*56.29*/("""
                        """),format.raw/*57.25*/("""<a href=""""),_display_(/*57.35*/controllers/*57.46*/.security.routes.LoginController.login()),format.raw/*57.86*/("""">Login</a>
                    """)))}),format.raw/*58.22*/("""
                    """),format.raw/*59.21*/("""</li>
                </ul>
                <a href="#" class="close">Close</a>
            </div>
        </nav>

    
    <div class="container-fluid">
        """),format.raw/*68.32*/("""
        """),_display_(/*69.10*/content),format.raw/*69.17*/("""
    """),format.raw/*70.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*79.66*/("""" type="text/javascript"></script>
        <!-- Load JavaScript libs last -->
    <script src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("assets/js/skel.min.js")),format.raw/*81.67*/(""""></script>
    <script src=""""),_display_(/*82.19*/routes/*82.25*/.Assets.versioned("assets/js/jquery.min.js")),format.raw/*82.69*/(""""></script>
    <script src=""""),_display_(/*83.19*/routes/*83.25*/.Assets.versioned("assets/js/jquery.scrollex.min.js")),format.raw/*83.78*/(""""></script>
    <script src=""""),_display_(/*84.19*/routes/*84.25*/.Assets.versioned("assets/js/util.js")),format.raw/*84.63*/(""""></script>
    <script src=""""),_display_(/*85.19*/routes/*85.25*/.Assets.versioned("assets/js/ie/respond.min.js")),format.raw/*85.73*/(""""></script>
    <script src=""""),_display_(/*86.19*/routes/*86.25*/.Assets.versioned("assets/js/main.js")),format.raw/*86.63*/(""""></script>
    <script src=""""),_display_(/*87.19*/routes/*87.25*/.Assets.versioned("https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js")),format.raw/*87.110*/(""""></script>
    <script src=""""),_display_(/*88.19*/routes/*88.25*/.Assets.versioned("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js")),format.raw/*88.113*/(""""></script>
    <script src=""""),_display_(/*89.19*/routes/*89.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*89.66*/("""" type="text/javascript"></script>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.Users,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.Users) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}
}

/**/
object adminMain extends adminMain_Scope0.adminMain_Scope1.adminMain
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 17:37:27 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/admin/adminMain.scala.html
                  HASH: a1826fc25895b06f299138bf02b3ec8545da460f
                  MATRIX: 887->75|1038->131|1066->133|1145->238|1180->247|1214->255|1239->260|2322->1316|2337->1322|2399->1362|2487->1423|2502->1429|2563->1468|2762->1641|2819->1689|2858->1690|2907->1711|2997->1774|3012->1780|3056->1803|3304->2021|3346->2035|3534->2196|3565->2218|3604->2219|3650->2234|3688->2245|3703->2251|3751->2277|3822->2321|3857->2347|3896->2348|3942->2363|3980->2374|3995->2380|4047->2410|4123->2459|4152->2479|4191->2480|4237->2495|4287->2518|4312->2534|4351->2535|4404->2560|4441->2570|4461->2581|4523->2622|4560->2632|4574->2636|4606->2646|4651->2673|4664->2678|4703->2679|4756->2704|4793->2714|4813->2725|4874->2765|4938->2798|4987->2819|5177->3071|5214->3081|5242->3088|5274->3093|5636->3428|5651->3434|5713->3475|5836->3571|5851->3577|5914->3619|5971->3649|5986->3655|6051->3699|6108->3729|6123->3735|6197->3788|6254->3818|6269->3824|6328->3862|6385->3892|6400->3898|6469->3946|6526->3976|6541->3982|6600->4020|6657->4050|6672->4056|6779->4141|6836->4171|6851->4177|6961->4265|7018->4295|7033->4301|7095->4342
                  LINES: 31->3|36->3|38->5|41->8|42->9|42->9|42->9|54->21|54->21|54->21|55->22|55->22|55->22|68->35|68->35|68->35|69->36|71->38|71->38|71->38|77->44|79->46|84->51|84->51|84->51|84->51|84->51|84->51|84->51|85->52|85->52|85->52|85->52|85->52|85->52|85->52|86->53|86->53|86->53|86->53|87->54|87->54|87->54|88->55|88->55|88->55|88->55|88->55|88->55|88->55|89->56|89->56|89->56|90->57|90->57|90->57|90->57|91->58|92->59|100->68|101->69|101->69|102->70|111->79|111->79|111->79|113->81|113->81|113->81|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|121->89|121->89|121->89
                  -- GENERATED --
              */
          