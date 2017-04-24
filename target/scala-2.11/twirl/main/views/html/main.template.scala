
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.Users,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, user: models.users.Users)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.58*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

            <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

            <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="https://afeld.github.io/emoji-css/emoji.css" rel="stylesheet">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*25.54*/routes/*25.60*/.Assets.versioned("assets/css/main.css")),format.raw/*25.100*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*26.59*/routes/*26.65*/.Assets.versioned("images/favicon.png")),format.raw/*26.104*/("""">
    </head>
    <body>
            <!-- Page Wrapper -->
        <div id="page-wrapper">

                <!-- Page Wrapper -->
            <div id="page-wrapper">

                """),_display_(/*35.18*/if(title == "Home")/*35.37*/{_display_(Seq[Any](format.raw/*35.38*/("""
                        """),format.raw/*36.25*/("""<!--HOMEPAGE-->
                        <!-- Header -->
                    <header id="header" class="alt">
                        <h1><a href=""""),_display_(/*39.39*/routes/*39.45*/.HomeController.index()),format.raw/*39.68*/(""""><span class="glyphicon glyphicon-book"></span> DUT Library</a></h1>
                        <nav>
                            <a href="#menu">Menu</a>
                        </nav>
                    </header>
                """)))}),format.raw/*44.18*/("""
                """),_display_(/*45.18*/if(title != "Home")/*45.37*/{_display_(Seq[Any](format.raw/*45.38*/("""
                        """),format.raw/*46.25*/("""<!--OTHER PAGE-->
                        <!-- Header -->
                    <header id="header">
                        <h1><a href=""""),_display_(/*49.39*/routes/*49.45*/.HomeController.index()),format.raw/*49.68*/(""""><span class="glyphicon glyphicon-book"></span>DUT Library</a></h1>
                        <nav>
                            <a href="#menu">Menu</a>
                        </nav>
                    </header>

                """)))}),format.raw/*55.18*/("""


            """),format.raw/*58.13*/("""<!-- Menu -->
        <nav id="menu">
            <div class="inner">
                <h2>Menu</h2>
                <ul class="links">
                    <li """),_display_(/*63.26*/if(title == "Home")/*63.45*/{_display_(Seq[Any](format.raw/*63.46*/("""class="active"""")))}),format.raw/*63.61*/("""><a href=""""),_display_(/*63.72*/routes/*63.78*/.HomeController.index()),format.raw/*63.101*/("""">Home</a></li>
                    <li """),_display_(/*64.26*/if(title == "About")/*64.46*/{_display_(Seq[Any](format.raw/*64.47*/("""class="active"""")))}),format.raw/*64.62*/("""><a href=""""),_display_(/*64.73*/routes/*64.79*/.HomeController.about()),format.raw/*64.102*/("""">About Us</a></li>
                    <li """),_display_(/*65.26*/if(title == "Products")/*65.49*/{_display_(Seq[Any](format.raw/*65.50*/("""class="active"""")))}),format.raw/*65.65*/(""">
                    """),_display_(/*66.22*/if(user != null)/*66.38*/ {_display_(Seq[Any](format.raw/*66.40*/("""
                        """),format.raw/*67.25*/("""<a href=""""),_display_(/*67.35*/routes/*67.41*/.HomeController.rent()),format.raw/*67.63*/("""">Products</a>
                    """)))}/*68.23*/else/*68.28*/{_display_(Seq[Any](format.raw/*68.29*/("""
                        """),format.raw/*69.25*/("""<a href=""""),_display_(/*69.35*/routes/*69.41*/.HomeController.products()),format.raw/*69.67*/("""">Products</a>
                    """)))}),format.raw/*70.22*/("""
                    """),format.raw/*71.21*/("""</li>
                    <li """),_display_(/*72.26*/if(title == "Sign Up")/*72.48*/{_display_(Seq[Any](format.raw/*72.49*/("""class="active"""")))}),format.raw/*72.64*/(""">
                    """),_display_(/*73.22*/if(user == null)/*73.38*/ {_display_(Seq[Any](format.raw/*73.40*/("""
                        """),format.raw/*74.25*/("""<a href=""""),_display_(/*74.35*/routes/*74.41*/.HomeController.signup()),format.raw/*74.65*/("""">Sign Up</a>
                    """)))}),format.raw/*75.22*/("""
                    """),format.raw/*76.21*/("""</li>
                    <li """),_display_(/*77.26*/if(title == "Login")/*77.46*/{_display_(Seq[Any](format.raw/*77.47*/("""class="active"""")))}),format.raw/*77.62*/(""">
                    """),_display_(/*78.22*/if(user != null)/*78.38*/{_display_(Seq[Any](format.raw/*78.39*/("""
                        """),format.raw/*79.25*/("""<li ><a href=""""),_display_(/*79.40*/routes/*79.46*/.HomeController.profile()),format.raw/*79.71*/("""">Profile</a></li>
                        <li><a href=""><p class="Navbar-FontStyle">Balance: """),_display_(/*80.78*/user/*80.82*/.getPoints()),format.raw/*80.94*/(""" """),format.raw/*80.95*/("""<span class="glyphicon glyphicon-bitcoin"></span></p></a></li>
                        <li ><a href=""""),_display_(/*81.40*/controllers/*81.51*/.security.routes.LoginController.logout()),format.raw/*81.92*/(""""><p class="Navbar-FontStyle">Logout """),_display_(/*81.130*/user/*81.134*/.getName()),format.raw/*81.144*/(""" """),format.raw/*81.145*/("""<span class="glyphicon glyphicon-log-in"></span></p></a></li>
                    """)))}/*82.23*/else/*82.28*/{_display_(Seq[Any](format.raw/*82.29*/("""
                        """),format.raw/*83.25*/("""<a href=""""),_display_(/*83.35*/controllers/*83.46*/.security.routes.LoginController.login()),format.raw/*83.86*/("""">Login</a>
                    """)))}),format.raw/*84.22*/("""
                """),format.raw/*85.17*/("""</ul>
                <a href="#" class="close">Close</a>
            </div>
        </nav>
    
    <div class="container-fluid">
        """),format.raw/*92.32*/("""
        """),_display_(/*93.10*/content),format.raw/*93.17*/("""
    """),format.raw/*94.5*/("""</div>
    <footer class="container-fluid">
        <section id="footer">
            <div class="inner">
                <h2 class="major">Get in touch</h2>
                <p>Wish to become a student at Dublin's university of techology and gain access to sports events, college etc. Contact us below and we'll guide you on your way to success!! <i class="em em-ok_hand"></i> </p>


                <table width="100%" border="1" cellspacing="5" cellpadding="1">
                    <tr>
                        <td width="70%" rowspan="5"><ul class="contact">
                            <li class="fa-home">
                        DUT Inc<br />
                                3rd Block #2894
                                <br />
                                Tallaght, Dublin 24
                    </li>
                            <li class="fa-phone">(1800) 122-5823
                            </li>
                        </ul></td>
                        <td width="30%"><a href=""""),_display_(/*114.51*/routes/*114.57*/.HomeController.index()),format.raw/*114.80*/("""" style = "float: right;"> Home </a></td>
                    </tr>
                    <tr>
                        <td><a href=""""),_display_(/*117.39*/routes/*117.45*/.HomeController.about()),format.raw/*117.68*/("""" style = "float: right; padding-right: 10px">About Us</a></td>
                    </tr>
                    <tr>
                        <td><a href=""""),_display_(/*120.39*/routes/*120.45*/.HomeController.products()),format.raw/*120.71*/("""" style = "float: right;"> Products</a></td>
                    </tr>
                    <tr>
                        <td><a href=""""),_display_(/*123.39*/routes/*123.45*/.HomeController.signup()),format.raw/*123.69*/("""" style = "float: right;"> Sign up </a></td>
                    </tr>
                    <tr>
                        <td><a href=""""),_display_(/*126.39*/controllers/*126.50*/.security.routes.LoginController.login()),format.raw/*126.90*/("""" style = "float: right;"> Login </a></td>
                    </tr>
                </table>
               
                <ul class="copyright">
                    <li>&copy; Second Year Project</li>
                </ul>
            </div>
        </section>
     </footer>

            </div>
        </div>

    </body>

        <!-- Load JavaScript libs last -->
    <script src=""""),_display_(/*143.19*/routes/*143.25*/.Assets.versioned("assets/js/skel.min.js")),format.raw/*143.67*/(""""></script>
    <script src=""""),_display_(/*144.19*/routes/*144.25*/.Assets.versioned("assets/js/jquery.min.js")),format.raw/*144.69*/(""""></script>
    <script src=""""),_display_(/*145.19*/routes/*145.25*/.Assets.versioned("assets/js/jquery.scrollex.min.js")),format.raw/*145.78*/(""""></script>
    <script src=""""),_display_(/*146.19*/routes/*146.25*/.Assets.versioned("assets/js/util.js")),format.raw/*146.63*/(""""></script>
    <script src=""""),_display_(/*147.19*/routes/*147.25*/.Assets.versioned("assets/js/ie/respond.min.js")),format.raw/*147.73*/(""""></script>
    <script src=""""),_display_(/*148.19*/routes/*148.25*/.Assets.versioned("assets/js/main.js")),format.raw/*148.63*/(""""></script>
    <script src=""""),_display_(/*149.19*/routes/*149.25*/.Assets.versioned("https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js")),format.raw/*149.110*/(""""></script>
    <script src=""""),_display_(/*150.19*/routes/*150.25*/.Assets.versioned("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js")),format.raw/*150.113*/(""""></script>
    <script src=""""),_display_(/*151.19*/routes/*151.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*151.66*/("""" type="text/javascript"></script>
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

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 17:35:45 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/main.scala.html
                  HASH: 7a7c5f64add9040e4629dd15807565a6cde68c7d
                  MATRIX: 1021->260|1172->316|1200->318|1280->423|1316->432|1351->440|1377->445|2460->1501|2475->1507|2537->1547|2625->1608|2640->1614|2701->1653|2913->1838|2941->1857|2980->1858|3033->1883|3207->2030|3222->2036|3266->2059|3528->2290|3573->2308|3601->2327|3640->2328|3693->2353|3857->2490|3872->2496|3916->2519|4178->2750|4221->2765|4408->2925|4436->2944|4475->2945|4521->2960|4559->2971|4574->2977|4619->3000|4687->3041|4716->3061|4755->3062|4801->3077|4839->3088|4854->3094|4899->3117|4971->3162|5003->3185|5042->3186|5088->3201|5138->3224|5163->3240|5203->3242|5256->3267|5293->3277|5308->3283|5351->3305|5406->3342|5419->3347|5458->3348|5511->3373|5548->3383|5563->3389|5610->3415|5677->3451|5726->3472|5784->3503|5815->3525|5854->3526|5900->3541|5950->3564|5975->3580|6015->3582|6068->3607|6105->3617|6120->3623|6165->3647|6231->3682|6280->3703|6338->3734|6367->3754|6406->3755|6452->3770|6502->3793|6527->3809|6566->3810|6619->3835|6661->3850|6676->3856|6722->3881|6845->3977|6858->3981|6891->3993|6920->3994|7049->4096|7069->4107|7131->4148|7197->4186|7211->4190|7243->4200|7273->4201|7375->4285|7388->4290|7427->4291|7480->4316|7517->4326|7537->4337|7598->4377|7662->4410|7707->4427|7874->4656|7911->4666|7939->4673|7971->4678|8997->5676|9013->5682|9058->5705|9217->5836|9233->5842|9278->5865|9459->6018|9475->6024|9523->6050|9685->6184|9701->6190|9747->6214|9909->6348|9930->6359|9992->6399|10410->6789|10426->6795|10490->6837|10548->6867|10564->6873|10630->6917|10688->6947|10704->6953|10779->7006|10837->7036|10853->7042|10913->7080|10971->7110|10987->7116|11057->7164|11115->7194|11131->7200|11191->7238|11249->7268|11265->7274|11373->7359|11431->7389|11447->7395|11558->7483|11616->7513|11632->7519|11695->7560
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|55->25|55->25|55->25|56->26|56->26|56->26|65->35|65->35|65->35|66->36|69->39|69->39|69->39|74->44|75->45|75->45|75->45|76->46|79->49|79->49|79->49|85->55|88->58|93->63|93->63|93->63|93->63|93->63|93->63|93->63|94->64|94->64|94->64|94->64|94->64|94->64|94->64|95->65|95->65|95->65|95->65|96->66|96->66|96->66|97->67|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|99->69|99->69|100->70|101->71|102->72|102->72|102->72|102->72|103->73|103->73|103->73|104->74|104->74|104->74|104->74|105->75|106->76|107->77|107->77|107->77|107->77|108->78|108->78|108->78|109->79|109->79|109->79|109->79|110->80|110->80|110->80|110->80|111->81|111->81|111->81|111->81|111->81|111->81|111->81|112->82|112->82|112->82|113->83|113->83|113->83|113->83|114->84|115->85|121->92|122->93|122->93|123->94|143->114|143->114|143->114|146->117|146->117|146->117|149->120|149->120|149->120|152->123|152->123|152->123|155->126|155->126|155->126|172->143|172->143|172->143|173->144|173->144|173->144|174->145|174->145|174->145|175->146|175->146|175->146|176->147|176->147|176->147|177->148|177->148|177->148|178->149|178->149|178->149|179->150|179->150|179->150|180->151|180->151|180->151
                  -- GENERATED --
              */
          