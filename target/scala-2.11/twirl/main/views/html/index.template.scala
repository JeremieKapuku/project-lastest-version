
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Home", user)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-12">
              <!-- Header -->
          <header id="header">
              <h1><a href=""""),_display_(/*10.29*/routes/*10.35*/.HomeController.index()),format.raw/*10.58*/(""""><span class="glyphicon glyphicon-book"></span> DUT Library</a></h1>
              <nav>
                  <a href="#menu">Menu</a>
              </nav>
          </header>

              <!-- Banner -->
          <section id="banner">
              <div class="inner">
                  <h2><span class="glyphicon glyphicon-book"></span> DUT Library</h2>
                  <p> A service to all our students</p>
              </div>
          </section>

              <!-- Wrapper -->
          <section id="wrapper">

                  <!-- One -->
              <section id="one" class="wrapper spotlight style1">
                  <div class="inner">
                      <a href="#" class="image"><img src=""""),_display_(/*30.60*/routes/*30.66*/.Assets.versioned("images/pic01.jpg")),format.raw/*30.103*/("""" alt="" /></a>
                      <div class="content">
                          <h2 class="major">Loan products</h2>
                          <p>Our services provides our student's with a service to download exam papers and books.</p>
                          """),_display_(/*34.28*/if(user != null)/*34.44*/ {_display_(Seq[Any](format.raw/*34.46*/("""
                          """),format.raw/*35.27*/("""<a href=""""),_display_(/*35.37*/routes/*35.43*/.HomeController.rent()),format.raw/*35.65*/("""" class="special">Have a look</a>
                          """)))}/*36.28*/else/*36.33*/{_display_(Seq[Any](format.raw/*36.34*/("""
                          """),format.raw/*37.27*/("""<a href=""""),_display_(/*37.37*/routes/*37.43*/.HomeController.products()),format.raw/*37.69*/("""" class="special">Have a look</a>
                          """)))}),format.raw/*38.28*/("""
                      """),format.raw/*39.23*/("""</div>
                  </div>
              </section>

                  <!-- Two -->
              <section id="two" class="wrapper alt spotlight style2">
                  <div class="inner">
                      <a href="#" class="image"><img src=""""),_display_(/*46.60*/routes/*46.66*/.Assets.versioned("images/pic02.jpg")),format.raw/*46.103*/("""" alt="" /></a>
                      <div class="content">
                          <h2 class="major">Open for all students</h2>
                          <p>Sign up now and gain an advantage on your exams!</p>
                          <a href=""""),_display_(/*50.37*/routes/*50.43*/.HomeController.signup()),format.raw/*50.67*/("""" class="special">Learn more</a>
                      </div>
                  </div>
              </section>

                  <!-- Three -->
              <section id="three" class="wrapper spotlight style3">
                  <div class="inner">
                      <a href="#" class="image"><img src=""""),_display_(/*58.60*/routes/*58.66*/.Assets.versioned("images/pic03.jpg")),format.raw/*58.103*/("""" alt="" /></a>
                      <div class="content">
                          <h2 class="major">Products ranging from hardware to software</h2>
                          <p>Each product enables our students to further their passion for your course and guarantee's a successful future</p>
                     """),_display_(/*62.23*/if(user != null)/*62.39*/ {_display_(Seq[Any](format.raw/*62.41*/("""
                          """),format.raw/*63.27*/("""<a href=""""),_display_(/*63.37*/routes/*63.43*/.HomeController.rent()),format.raw/*63.65*/("""" class="special">Have a look</a>
                          """)))}/*64.28*/else/*64.33*/{_display_(Seq[Any](format.raw/*64.34*/("""
                          """),format.raw/*65.27*/("""<a href=""""),_display_(/*65.37*/routes/*65.43*/.HomeController.products()),format.raw/*65.69*/("""" class="special">Have a look</a>
                          """)))}),format.raw/*66.28*/(""" """),format.raw/*66.29*/("""</div>
                  </div>
              </section>
      </div>
  </div>
  <!-- End of content for main -->
""")))}),format.raw/*72.2*/("""

"""))
      }
    }
  }

  def render(user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 20:11:52 IST 2017
                  SOURCE: /home/wdd/webapps/project-latest-version/app/views/index.scala.html
                  HASH: 92c1aa77d04842e0800a53dd587527bcb22b1969
                  MATRIX: 757->1|878->27|906->29|966->62|994->63|1040->82|1068->83|1096->84|1143->106|1169->124|1208->126|1237->129|1444->309|1459->315|1503->338|2245->1053|2260->1059|2319->1096|2615->1365|2640->1381|2680->1383|2735->1410|2772->1420|2787->1426|2830->1448|2910->1509|2923->1514|2962->1515|3017->1542|3054->1552|3069->1558|3116->1584|3208->1645|3259->1668|3542->1924|3557->1930|3616->1967|3892->2216|3907->2222|3952->2246|4290->2557|4305->2563|4364->2600|4709->2918|4734->2934|4774->2936|4829->2963|4866->2973|4881->2979|4924->3001|5004->3062|5017->3067|5056->3068|5111->3095|5148->3105|5163->3111|5210->3137|5302->3198|5331->3199|5476->3314
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|41->10|41->10|41->10|61->30|61->30|61->30|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|70->39|77->46|77->46|77->46|81->50|81->50|81->50|89->58|89->58|89->58|93->62|93->62|93->62|94->63|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|96->65|97->66|97->66|103->72
                  -- GENERATED --
              */
          