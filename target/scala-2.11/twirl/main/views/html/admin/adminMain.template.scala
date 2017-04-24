
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
    <!-- start of nav section -->
        """),_display_(/*26.10*/if(title == "service" || title == "transaction")/*26.58*/{_display_(Seq[Any](format.raw/*26.59*/("""
        """),format.raw/*27.9*/("""<header id="header">
            <nav>
                    <!-- nav header/ branding -->
                <div class="navbar-header">
                    <span class="glyphicon glyphicon-book"></span> DUT Library
                </div>
                    <!-- List containing nav links -->
                <ul class="nav navbar-nav">
                    <li """),_display_(/*35.26*/if(title == "service")/*35.48*/{_display_(Seq[Any](format.raw/*35.49*/("""class="active"""")))}),format.raw/*35.64*/("""><a href=""""),_display_(/*35.75*/routes/*35.81*/.AdminController.service()),format.raw/*35.107*/("""">Service</a></li>
                    <li """),_display_(/*36.26*/if(title == "transaction")/*36.52*/{_display_(Seq[Any](format.raw/*36.53*/("""class="active"""")))}),format.raw/*36.68*/("""><a href=""""),_display_(/*36.79*/routes/*36.85*/.AdminController.Transaction()),format.raw/*36.115*/("""">Transactions</a></li>
                    <li """),_display_(/*37.26*/if(title == "Login")/*37.46*/{_display_(Seq[Any](format.raw/*37.47*/("""class="active"""")))}),format.raw/*37.62*/(""">
                    """),_display_(/*38.22*/if(user != null)/*38.38*/{_display_(Seq[Any](format.raw/*38.39*/("""
                        """),format.raw/*39.25*/("""<a href=""""),_display_(/*39.35*/controllers/*39.46*/.security.routes.LoginController.logout()),format.raw/*39.87*/("""">Logout """),_display_(/*39.97*/user/*39.101*/.getName()),format.raw/*39.111*/("""</a>
                    """)))}/*40.23*/else/*40.28*/{_display_(Seq[Any](format.raw/*40.29*/("""
                        """),format.raw/*41.25*/("""<a href=""""),_display_(/*41.35*/controllers/*41.46*/.security.routes.LoginController.login()),format.raw/*41.86*/("""">Login</a>
                    """)))}),format.raw/*42.22*/("""
                    """),format.raw/*43.21*/("""</li>
                </ul>
             </nav>
            </header>
        """)))}),format.raw/*47.10*/("""

    
    """),format.raw/*50.5*/("""<div class="container-fluid">
        """),format.raw/*52.32*/("""
        """),_display_(/*53.10*/content),format.raw/*53.17*/("""
    """),format.raw/*54.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*63.19*/routes/*63.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*63.66*/("""" type="text/javascript"></script>
        <!-- Load JavaScript libs last -->
    <script src=""""),_display_(/*65.19*/routes/*65.25*/.Assets.versioned("assets/js/skel.min.js")),format.raw/*65.67*/(""""></script>
    <script src=""""),_display_(/*66.19*/routes/*66.25*/.Assets.versioned("assets/js/jquery.min.js")),format.raw/*66.69*/(""""></script>
    <script src=""""),_display_(/*67.19*/routes/*67.25*/.Assets.versioned("assets/js/jquery.scrollex.min.js")),format.raw/*67.78*/(""""></script>
    <script src=""""),_display_(/*68.19*/routes/*68.25*/.Assets.versioned("assets/js/util.js")),format.raw/*68.63*/(""""></script>
    <script src=""""),_display_(/*69.19*/routes/*69.25*/.Assets.versioned("assets/js/ie/respond.min.js")),format.raw/*69.73*/(""""></script>
    <script src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.versioned("assets/js/main.js")),format.raw/*70.63*/(""""></script>
    <script src=""""),_display_(/*71.19*/routes/*71.25*/.Assets.versioned("https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js")),format.raw/*71.110*/(""""></script>
    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js")),format.raw/*72.113*/(""""></script>
    <script src=""""),_display_(/*73.19*/routes/*73.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*73.66*/("""" type="text/javascript"></script>
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
                  DATE: Mon Apr 24 12:25:36 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/admin/adminMain.scala.html
                  HASH: d7c3521166f019323ab168a921957091e5dbebde
                  MATRIX: 887->75|1038->131|1066->133|1145->238|1180->247|1214->255|1239->260|2322->1316|2337->1322|2399->1362|2487->1423|2502->1429|2563->1468|2659->1537|2716->1585|2755->1586|2791->1595|3177->1954|3208->1976|3247->1977|3293->1992|3331->2003|3346->2009|3394->2035|3465->2079|3500->2105|3539->2106|3585->2121|3623->2132|3638->2138|3690->2168|3766->2217|3795->2237|3834->2238|3880->2253|3930->2276|3955->2292|3994->2293|4047->2318|4084->2328|4104->2339|4166->2380|4203->2390|4217->2394|4249->2404|4294->2431|4307->2436|4346->2437|4399->2462|4436->2472|4456->2483|4517->2523|4581->2556|4630->2577|4740->2656|4778->2667|4844->2795|4881->2805|4909->2812|4941->2817|5303->3152|5318->3158|5380->3199|5503->3295|5518->3301|5581->3343|5638->3373|5653->3379|5718->3423|5775->3453|5790->3459|5864->3512|5921->3542|5936->3548|5995->3586|6052->3616|6067->3622|6136->3670|6193->3700|6208->3706|6267->3744|6324->3774|6339->3780|6446->3865|6503->3895|6518->3901|6628->3989|6685->4019|6700->4025|6762->4066
                  LINES: 31->3|36->3|38->5|41->8|42->9|42->9|42->9|54->21|54->21|54->21|55->22|55->22|55->22|59->26|59->26|59->26|60->27|68->35|68->35|68->35|68->35|68->35|68->35|68->35|69->36|69->36|69->36|69->36|69->36|69->36|69->36|70->37|70->37|70->37|70->37|71->38|71->38|71->38|72->39|72->39|72->39|72->39|72->39|72->39|72->39|73->40|73->40|73->40|74->41|74->41|74->41|74->41|75->42|76->43|80->47|83->50|84->52|85->53|85->53|86->54|95->63|95->63|95->63|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73
                  -- GENERATED --
              */
          