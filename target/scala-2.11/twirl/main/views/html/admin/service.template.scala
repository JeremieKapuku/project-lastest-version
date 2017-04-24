
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object service_Scope0 {
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

class service extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("service", user)/*4.34*/ {_display_(Seq[Any](format.raw/*4.36*/("""

    """),format.raw/*6.5*/("""<!-- HTML content for the index view -->
    <!-- Wrapper -->
    <section id="wrapper">

            <!-- One -->
        <section id="one" class="wrapper spotlight style1">
            """),format.raw/*12.36*/("""
                """),format.raw/*13.17*/("""<div class="content">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-sm-8">
                                <iframe src=""""),_display_(/*17.47*/routes/*17.53*/.AdminController.products()),format.raw/*17.80*/("""" width="100%" height="700px" seamless ></iframe>
                            </div>
                            <div class="col-sm-4">
                                <iframe src=""""),_display_(/*20.47*/routes/*20.53*/.AdminController.users()),format.raw/*20.77*/("""" width="100%" height="700px" seamless ></iframe>
                            </div>
                        </div>
                    """),format.raw/*23.31*/("""
                """),format.raw/*24.17*/("""</div>
            </div>
        </section>
    </section>

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
object service extends service_Scope0.service
              /*
                  -- GENERATED --
                  DATE: Sun Apr 23 23:10:25 IST 2017
                  SOURCE: /home/wdd/webapps/project-latest-version/app/views/admin/service.scala.html
                  HASH: 326b93eb1bb7a26e66db41293c6ecf63b609b38a
                  MATRIX: 810->1|998->94|1026->96|1086->129|1114->130|1160->149|1188->150|1216->151|1263->173|1275->178|1310->205|1349->207|1381->213|1596->423|1641->440|1879->651|1894->657|1942->684|2151->866|2166->872|2211->896|2375->1042|2420->1059
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|37->6|43->12|44->13|48->17|48->17|48->17|51->20|51->20|51->20|54->23|55->24
                  -- GENERATED --
              */
          