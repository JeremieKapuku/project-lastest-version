
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

     object signup_Scope1 {
import helper._

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.users.Users],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.4*/(addUsersForm: Form[models.users.Users]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.44*/("""

  """),format.raw/*4.3*/("""<!DOCTYPE html>
  <html lang="en">
      <head>
          """),format.raw/*7.64*/("""
          """),format.raw/*8.11*/("""<meta charset="utf-8" />
          <meta name="viewport" content="width=device-width, initial-scale=1">
              <!-- Latest compiled and minified CSS -->
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

              <!-- Optional theme -->
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

              <!-- Latest compiled and minified JavaScript -->
          <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

          <link rel="stylesheet" media="screen" href=""""),_display_(/*19.56*/routes/*19.62*/.Assets.versioned("assets/css/main.css")),format.raw/*19.102*/("""">
          <link rel="shortcut icon" type="image/png" href=""""),_display_(/*20.61*/routes/*20.67*/.Assets.versioned("images/favicon.png")),format.raw/*20.106*/("""">
      </head>
      <body>
     """),_display_(/*23.7*/if(flash.containsKey("success"))/*23.39*/ {_display_(Seq[Any](format.raw/*23.41*/("""
              """),format.raw/*24.15*/("""<div class="alert alert-success">
              """),_display_(/*25.16*/flash/*25.21*/.get("success")),format.raw/*25.36*/("""
              """),format.raw/*26.15*/("""</div>
          """)))}),format.raw/*27.12*/("""
    """),format.raw/*28.5*/("""<div class="col-sm-12">
    <h3>Create your account</h3>

         """),_display_(/*31.11*/form(action = routes.HomeController.addUsersSubmit(), 'class -> "form-horizontal", 'role ->"form")/*31.109*/ {_display_(Seq[Any](format.raw/*31.111*/("""
        
        """),_display_(/*33.10*/inputText(addUsersForm("email"), '_label -> "Email",'class -> "form-control")),format.raw/*33.87*/("""
        """),_display_(/*34.10*/inputText(addUsersForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*34.85*/("""
        """),_display_(/*35.10*/inputText(addUsersForm("address"), '_label -> "Address",'class -> "form-control")),format.raw/*35.91*/("""
        """),_display_(/*36.10*/inputText(addUsersForm("number"), '_label -> "Number",'class -> "form-control")),format.raw/*36.89*/("""
        """),_display_(/*37.10*/inputText(addUsersForm("password"), '_label -> "Password",'class -> "form-control")),format.raw/*37.93*/("""
     
    """),format.raw/*39.5*/("""<div class="actions">
          <input type="submit" value=" Save Details " class="btn btn-primary">
          <a href=""""),_display_(/*41.21*/routes/*41.27*/.HomeController.index()),format.raw/*41.50*/(""""><button type="button" value= """),_display_(/*41.82*/routes/*41.88*/.HomeController.index()),format.raw/*41.111*/(""" """),format.raw/*41.112*/("""class = "btn btn-warning">Cancel</button></a>
    </div> 
    

    <br>
    <br>
        """)))}),format.raw/*47.10*/("""
  
"""),format.raw/*49.1*/("""</div>
    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*54.19*/routes/*54.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*54.66*/("""" type="text/javascript"></script>
</html>
"""))
      }
    }
  }

  def render(addUsersForm:Form[models.users.Users]): play.twirl.api.HtmlFormat.Appendable = apply(addUsersForm)

  def f:((Form[models.users.Users]) => play.twirl.api.HtmlFormat.Appendable) = (addUsersForm) => apply(addUsersForm)

  def ref: this.type = this

}


}
}

/**/
object signup extends signup_Scope0.signup_Scope1.signup
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 20:11:44 IST 2017
                  SOURCE: /home/wdd/webapps/project-latest-version/app/views/signup.scala.html
                  HASH: 53f927587b5e7b84ca475e48b472cc5c9833c4df
                  MATRIX: 810->20|945->60|975->64|1060->175|1098->186|2098->1159|2113->1165|2175->1205|2265->1268|2280->1274|2341->1313|2403->1349|2444->1381|2484->1383|2527->1398|2603->1447|2617->1452|2653->1467|2696->1482|2745->1500|2777->1505|2872->1573|2980->1671|3021->1673|3067->1692|3165->1769|3202->1779|3298->1854|3335->1864|3437->1945|3474->1955|3574->2034|3611->2044|3715->2127|3753->2138|3901->2259|3916->2265|3960->2288|4019->2320|4034->2326|4079->2349|4109->2350|4231->2441|4262->2445|4554->2710|4569->2716|4631->2757
                  LINES: 30->2|35->2|37->4|40->7|41->8|52->19|52->19|52->19|53->20|53->20|53->20|56->23|56->23|56->23|57->24|58->25|58->25|58->25|59->26|60->27|61->28|64->31|64->31|64->31|66->33|66->33|67->34|67->34|68->35|68->35|69->36|69->36|70->37|70->37|72->39|74->41|74->41|74->41|74->41|74->41|74->41|74->41|80->47|82->49|87->54|87->54|87->54
                  -- GENERATED --
              */
          