
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.users.Users],List[models.Product],List[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Users], products: List[models.Product], Transactions: List[models.Users_library],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.134*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Users", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<!-- HTML content for the index view -->






    <div class="row">
        <div class="col-sm-12">

                <!-- Wrapper -->
            <section id="wrapper">


                    <!-- Two -->
                <section id="two" class="wrapper alt spotlight style2" style="margin-top: 20px;">
                    <div class="inner">


                    </div>
                    <h1 class="SubTitles" style="margin-left: 15px">"""),_display_(/*25.70*/user/*25.74*/.getName()),format.raw/*25.84*/(""" """),format.raw/*25.85*/("""'s Profile</h1>
                    <div class="panel-body">
                        """),_display_(/*27.26*/if(flash.containsKey("success"))/*27.58*/ {_display_(Seq[Any](format.raw/*27.60*/("""
                            """),format.raw/*28.29*/("""<div class="alert alert-success">
                            """),_display_(/*29.30*/flash/*29.35*/.get("success")),format.raw/*29.50*/("""
                            """),format.raw/*30.29*/("""</div>
                        """)))}),format.raw/*31.26*/("""
                        """),format.raw/*32.25*/("""<table style="margin-top: 2px; padding-top: 0px">
                            <thead>
                                    <!-- The header row-->
                                <tr>
                                    <th style = "color: white">Email</th>
                                    <th style = "color: white">Name</th>
                                    <th style = "color: white">Address</th>
                                    <th style = "color: white">Number</th>
                                    <th style = "color: white">Password</th>
                                    <th style = "color: white">Points</th>
                                </tr>
                            </thead>
                            <tbody>
                                    <!-- Product row(s) -->
                                    <!-- Start of For loop - For each p in products add a row -->

                                <tr>
                                    <td>"""),_display_(/*49.42*/user/*49.46*/.getEmail),format.raw/*49.55*/("""</td>
                                    <td>"""),_display_(/*50.42*/user/*50.46*/.getName),format.raw/*50.54*/("""</td>
                                    <td>"""),_display_(/*51.42*/user/*51.46*/.getAddress),format.raw/*51.57*/("""</td>
                                    <td>"""),_display_(/*52.42*/user/*52.46*/.getNumber),format.raw/*52.56*/("""</td>
                                    <td>"""),_display_(/*53.42*/user/*53.46*/.getPassword),format.raw/*53.58*/("""</td>
                                    <td>"""),_display_(/*54.42*/user/*54.46*/.getPoints),format.raw/*54.56*/("""</td>

                                    <td>
                                        <a href=""""),_display_(/*57.51*/routes/*57.57*/.HomeController.updateProfile(user.getEmail)),format.raw/*57.101*/("""" class="btn-xs btn-danger">EDIT PROFILE
                                            <span class="glyphicon glyphicon-pencil"></span></a>
                                    </td>

                                </tr>

                            </tbody>
                        </table>
                        <table >
                            <thead>
                                <h1 style = "color: white;"> Items </h1>
                                    <!-- The header row-->

                                <tr>
                                    <th style = "color: white">ID</th>
                                    <th style = "color: white">Product ID</th>
                                    <th style = "color: white">User Email</th>
                                    <th style = "color: white">Date Of transaction </th>
                                    <th style = "color: white">Expire Date</th>
                                    <th style = "color: white">Return</th>
                                    <th style = "color: white;">Extend</th>

                                </tr>


                                """),_display_(/*82.34*/for(p <- Transactions) yield /*82.56*/{_display_(Seq[Any](format.raw/*82.57*/("""
                                    """),_display_(/*83.38*/if(p.getUser_email.equalsIgnoreCase(user.getEmail))/*83.89*/{_display_(Seq[Any](format.raw/*83.90*/("""
                                        """),format.raw/*84.41*/("""<tr>
                                            <td>"""),_display_(/*85.50*/p/*85.51*/.getId),format.raw/*85.57*/("""</td>
                                            <td>"""),_display_(/*86.50*/p/*86.51*/.getUser_product_id),format.raw/*86.70*/("""</td>
                                            <td>"""),_display_(/*87.50*/p/*87.51*/.getUser_email),format.raw/*87.65*/("""</td>
                                            <td>"""),_display_(/*88.50*/p/*88.51*/.getDate_transaction),format.raw/*88.71*/("""</td>
                                            <td>"""),_display_(/*89.50*/p/*89.51*/.getExpiring_date),format.raw/*89.68*/("""</td>
                                            <td>"""),_display_(/*90.50*/p/*90.51*/.getReturned),format.raw/*90.63*/("""
                                                """),_display_(/*91.50*/if(p.getReturned() == "false")/*91.80*/{_display_(Seq[Any](format.raw/*91.81*/("""
                                                    """),format.raw/*92.53*/("""<a href=""""),_display_(/*92.63*/routes/*92.69*/.HomeController.updateReturn(p.getId)),format.raw/*92.106*/("""" class="btn-xs btn-danger">
                                                        return <span class="glyphicon glyphicon-pencil"></span></a>
                                                """)))}),format.raw/*94.50*/("""


                                            """),format.raw/*97.45*/("""</td>
                                            <td>"""),_display_(/*98.50*/p/*98.51*/.getextendable),format.raw/*98.65*/("""
                                                """),_display_(/*99.50*/if(p.getextendable() == "true" )/*99.82*/{_display_(Seq[Any](format.raw/*99.83*/("""
                                                    """),_display_(/*100.54*/if(p.getReturned() != "true")/*100.83*/{_display_(Seq[Any](format.raw/*100.84*/("""
                                                        """),format.raw/*101.57*/("""<a href=""""),_display_(/*101.67*/routes/*101.73*/.HomeController.updateTransaction(p.getId)),format.raw/*101.115*/("""" class="btn-xs btn-danger">
                                                            Extend <span class="glyphicon glyphicon-pencil"></span></a>
                                                    """)))}),format.raw/*103.54*/("""

                                                """)))}),format.raw/*105.50*/("""
                                                


                                            """),format.raw/*109.45*/("""</td>
                                        </tr>
                                    """)))}),format.raw/*111.38*/("""
                                """)))}),format.raw/*112.34*/("""

                            """),format.raw/*114.29*/("""</thead>
                        </table>
                        <table >
                            <thead>
                                <h1 style = "color: white;"> Attached Files </h1>
                                    <!-- The header row-->

                                <tr>
                                    <th style = "color: white">Product ID</th>
                                    <th style = "color: white">Software</th>
                                    <th style = "color: white">User Email</th>
                                    <th style = "color: white">Date Of transaction </th>
                                    <th style = "color: white">Expire Date</th>
                                </tr>


                                """),_display_(/*130.34*/for(p <- Transactions) yield /*130.56*/{_display_(Seq[Any](format.raw/*130.57*/("""
                                    """),_display_(/*131.38*/if(p.getUser_email.equalsIgnoreCase(user.getEmail))/*131.89*/{_display_(Seq[Any](format.raw/*131.90*/("""
                                        """),format.raw/*132.41*/("""<tr>
                                            <td>"""),_display_(/*133.50*/p/*133.51*/.getUser_product_id),format.raw/*133.70*/("""</td>
                                            <td> """),_display_(/*134.51*/if(p.getUser_product_id() == 1)/*134.82*/{_display_(Seq[Any](format.raw/*134.83*/("""
                                                """),_display_(/*135.50*/if(p.getReturned() == "false")/*135.80*/{_display_(Seq[Any](format.raw/*135.81*/("""
                                                    """),format.raw/*136.53*/("""<a href=""""),_display_(/*136.63*/routes/*136.69*/.Assets.versioned("documents/2015.pdf")),format.raw/*136.108*/(""""> Networking 2016 Year 2 Semester 3 exam papers</a>
                                                    """)))}),format.raw/*137.54*/("""
                                                """)))}),format.raw/*138.50*/("""
                                                """),_display_(/*139.50*/if(p.getUser_product_id() == 2)/*139.81*/{_display_(Seq[Any](format.raw/*139.82*/("""
                                                """),_display_(/*140.50*/if(p.getReturned() == "false")/*140.80*/{_display_(Seq[Any](format.raw/*140.81*/("""
                                                      """),format.raw/*141.55*/("""<a href=""""),_display_(/*141.65*/routes/*141.71*/.Assets.versioned("documents/2014.pdf")),format.raw/*141.110*/(""""> Networking 2015 Year 2 Semester 3 exam papers</a>
                                                      """)))}),format.raw/*142.56*/("""
                                                """)))}),format.raw/*143.50*/("""
                                                 """),_display_(/*144.51*/if(p.getUser_product_id() == 3)/*144.82*/{_display_(Seq[Any](format.raw/*144.83*/("""
                                                 """),_display_(/*145.51*/if(p.getReturned() == "false")/*145.81*/{_display_(Seq[Any](format.raw/*145.82*/("""
                                                      """),format.raw/*146.55*/("""<a href=""""),_display_(/*146.65*/routes/*146.71*/.Assets.versioned("documents/2014.pdf")),format.raw/*146.110*/(""""> Networking 2014 Year 2 Semester 3 exam papers</a>
                                                      """)))}),format.raw/*147.56*/("""
                                                """)))}),format.raw/*148.50*/("""
                                                 """),_display_(/*149.51*/if(p.getUser_product_id() == 4)/*149.82*/{_display_(Seq[Any](format.raw/*149.83*/("""
                                                 """),_display_(/*150.51*/if(p.getReturned() == "false")/*150.81*/{_display_(Seq[Any](format.raw/*150.82*/("""
                                                      """),format.raw/*151.55*/("""<a href=""""),_display_(/*151.65*/routes/*151.71*/.Assets.versioned("documents/SD2016.pdf")),format.raw/*151.112*/(""""> Software 2016 Year 2 Semester 3 exam papers</a>
                                                      """)))}),format.raw/*152.56*/("""
                                                """)))}),format.raw/*153.50*/("""
                                                 """),_display_(/*154.51*/if(p.getUser_product_id() == 5)/*154.82*/{_display_(Seq[Any](format.raw/*154.83*/("""
                                                 """),_display_(/*155.51*/if(p.getReturned() == "false")/*155.81*/{_display_(Seq[Any](format.raw/*155.82*/("""
                                                      """),format.raw/*156.55*/("""<a href=""""),_display_(/*156.65*/routes/*156.71*/.Assets.versioned("documents/SD2015.pdf")),format.raw/*156.112*/(""""> Software 2015 Year 2 Semester 3 exam papers</a>
                                                      """)))}),format.raw/*157.56*/("""
                                                """)))}),format.raw/*158.50*/("""
                                                 """),_display_(/*159.51*/if(p.getUser_product_id() == 6)/*159.82*/{_display_(Seq[Any](format.raw/*159.83*/("""
                                                 """),_display_(/*160.51*/if(p.getReturned() == "false")/*160.81*/{_display_(Seq[Any](format.raw/*160.82*/("""
                                                      """),format.raw/*161.55*/("""<a href=""""),_display_(/*161.65*/routes/*161.71*/.Assets.versioned("documents/SD2014.pdf")),format.raw/*161.112*/(""""> Software 2014 Year 2 Semester 3 exam papers</a>
                                                      """)))}),format.raw/*162.56*/("""
                                                """)))}),format.raw/*163.50*/("""
                                                 """),_display_(/*164.51*/if(p.getUser_product_id() == 7)/*164.82*/{_display_(Seq[Any](format.raw/*164.83*/("""
                                                 """),_display_(/*165.51*/if(p.getReturned() == "false")/*165.81*/{_display_(Seq[Any](format.raw/*165.82*/("""
                                                      """),format.raw/*166.55*/("""<a href=""""),_display_(/*166.65*/routes/*166.71*/.Assets.versioned("documents/MD2016.pdf")),format.raw/*166.112*/(""""> Discrete Mathematics 2016 Year 2 Semester 3 exam papers</a>
                                                      """)))}),format.raw/*167.56*/("""
                                                """)))}),format.raw/*168.50*/("""
                                                 """),_display_(/*169.51*/if(p.getUser_product_id() == 8)/*169.82*/{_display_(Seq[Any](format.raw/*169.83*/("""
                                                 """),_display_(/*170.51*/if(p.getReturned() == "false")/*170.81*/{_display_(Seq[Any](format.raw/*170.82*/("""
                                                      """),format.raw/*171.55*/("""<a href=""""),_display_(/*171.65*/routes/*171.71*/.Assets.versioned("documents/MD2015.pdf")),format.raw/*171.112*/(""""> Discrete Mathematics 2015 Year 2 Semester 3 exam papers</a>
                                                      """)))}),format.raw/*172.56*/("""
                                                """)))}),format.raw/*173.50*/("""
                                                 """),_display_(/*174.51*/if(p.getUser_product_id() == 9)/*174.82*/{_display_(Seq[Any](format.raw/*174.83*/("""
                                                 """),_display_(/*175.51*/if(p.getReturned() == "false")/*175.81*/{_display_(Seq[Any](format.raw/*175.82*/("""
                                                      """),format.raw/*176.55*/("""<a href=""""),_display_(/*176.65*/routes/*176.71*/.Assets.versioned("documents/MD2014.pdf")),format.raw/*176.112*/(""""> Discrete Mathematics 2014 Year 2 Semester 3 exam papers</a>
                                                      """)))}),format.raw/*177.56*/("""
                                                """)))}),format.raw/*178.50*/("""
                                                 """),_display_(/*179.51*/if(p.getUser_product_id() == 10)/*179.83*/{_display_(Seq[Any](format.raw/*179.84*/("""
                                                 """),_display_(/*180.51*/if(p.getReturned() == "false")/*180.81*/{_display_(Seq[Any](format.raw/*180.82*/("""
                                                      """),format.raw/*181.55*/("""<a href=""""),_display_(/*181.65*/routes/*181.71*/.Assets.versioned("documents/WS.pdf")),format.raw/*181.108*/(""""> Wall Street Survivor</a>
                                                      """)))}),format.raw/*182.56*/("""
                                                """)))}),format.raw/*183.50*/("""</td>
                                            <td>"""),_display_(/*184.50*/p/*184.51*/.getUser_email),format.raw/*184.65*/("""</td>
                                            <td>"""),_display_(/*185.50*/p/*185.51*/.getDate_transaction),format.raw/*185.71*/("""</td>
                                            <td>"""),_display_(/*186.50*/p/*186.51*/.getExpiring_date),format.raw/*186.68*/("""</td>
                                        </tr>
                                    """)))}),format.raw/*188.38*/("""
                                """)))}),format.raw/*189.34*/("""

                            """),format.raw/*191.29*/("""</thead>
                        </table>
                    </div>
                </section>

            </section>
        </div>
    </div>









        <div class="col-sm-12" style="margin-top: 5%;">


                </div>

""")))}),format.raw/*213.2*/("""
"""))
      }
    }
  }

  def render(users:List[models.users.Users],products:List[models.Product],Transactions:List[models.Users_library],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(users,products,Transactions,user)

  def f:((List[models.users.Users],List[models.Product],List[models.Users_library],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (users,products,Transactions,user) => apply(users,products,Transactions,user)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 16:48:33 IST 2017
                  SOURCE: /home/wdd/webapps/project-lastest-version/app/views/profile.scala.html
                  HASH: 74acea373c9abaae655d7a5ee59e5e315613c398
                  MATRIX: 834->1|1062->133|1090->135|1150->168|1178->169|1224->188|1252->189|1280->190|1327->212|1354->231|1393->233|1424->238|1892->679|1905->683|1936->693|1965->694|2078->780|2119->812|2159->814|2216->843|2306->906|2320->911|2356->926|2413->955|2476->987|2529->1012|3536->1992|3549->1996|3579->2005|3653->2052|3666->2056|3695->2064|3769->2111|3782->2115|3814->2126|3888->2173|3901->2177|3932->2187|4006->2234|4019->2238|4052->2250|4126->2297|4139->2301|4170->2311|4295->2409|4310->2415|4376->2459|5555->3611|5593->3633|5632->3634|5697->3672|5757->3723|5796->3724|5865->3765|5946->3819|5956->3820|5983->3826|6065->3881|6075->3882|6115->3901|6197->3956|6207->3957|6242->3971|6324->4026|6334->4027|6375->4047|6457->4102|6467->4103|6505->4120|6587->4175|6597->4176|6630->4188|6707->4238|6746->4268|6785->4269|6866->4322|6903->4332|6918->4338|6977->4375|7202->4569|7277->4616|7359->4671|7369->4672|7404->4686|7481->4736|7522->4768|7561->4769|7643->4823|7682->4852|7722->4853|7808->4910|7846->4920|7862->4926|7927->4968|8161->5170|8244->5221|8369->5317|8490->5406|8556->5440|8615->5470|9410->6237|9449->6259|9489->6260|9555->6298|9616->6349|9656->6350|9726->6391|9808->6445|9819->6446|9860->6465|9944->6521|9985->6552|10025->6553|10103->6603|10143->6633|10183->6634|10265->6687|10303->6697|10319->6703|10381->6742|10519->6848|10601->6898|10679->6948|10720->6979|10760->6980|10838->7030|10878->7060|10918->7061|11002->7116|11040->7126|11056->7132|11118->7171|11258->7279|11340->7329|11419->7380|11460->7411|11500->7412|11579->7463|11619->7493|11659->7494|11743->7549|11781->7559|11797->7565|11859->7604|11999->7712|12081->7762|12160->7813|12201->7844|12241->7845|12320->7896|12360->7926|12400->7927|12484->7982|12522->7992|12538->7998|12602->8039|12740->8145|12822->8195|12901->8246|12942->8277|12982->8278|13061->8329|13101->8359|13141->8360|13225->8415|13263->8425|13279->8431|13343->8472|13481->8578|13563->8628|13642->8679|13683->8710|13723->8711|13802->8762|13842->8792|13882->8793|13966->8848|14004->8858|14020->8864|14084->8905|14222->9011|14304->9061|14383->9112|14424->9143|14464->9144|14543->9195|14583->9225|14623->9226|14707->9281|14745->9291|14761->9297|14825->9338|14975->9456|15057->9506|15136->9557|15177->9588|15217->9589|15296->9640|15336->9670|15376->9671|15460->9726|15498->9736|15514->9742|15578->9783|15728->9901|15810->9951|15889->10002|15930->10033|15970->10034|16049->10085|16089->10115|16129->10116|16213->10171|16251->10181|16267->10187|16331->10228|16481->10346|16563->10396|16642->10447|16684->10479|16724->10480|16803->10531|16843->10561|16883->10562|16967->10617|17005->10627|17021->10633|17081->10670|17196->10753|17278->10803|17361->10858|17372->10859|17408->10873|17491->10928|17502->10929|17544->10949|17627->11004|17638->11005|17677->11022|17798->11111|17864->11145|17923->11175|18192->11413
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|56->25|56->25|56->25|56->25|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|62->31|63->32|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|88->57|88->57|88->57|113->82|113->82|113->82|114->83|114->83|114->83|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92|123->92|125->94|128->97|129->98|129->98|129->98|130->99|130->99|130->99|131->100|131->100|131->100|132->101|132->101|132->101|132->101|134->103|136->105|140->109|142->111|143->112|145->114|161->130|161->130|161->130|162->131|162->131|162->131|163->132|164->133|164->133|164->133|165->134|165->134|165->134|166->135|166->135|166->135|167->136|167->136|167->136|167->136|168->137|169->138|170->139|170->139|170->139|171->140|171->140|171->140|172->141|172->141|172->141|172->141|173->142|174->143|175->144|175->144|175->144|176->145|176->145|176->145|177->146|177->146|177->146|177->146|178->147|179->148|180->149|180->149|180->149|181->150|181->150|181->150|182->151|182->151|182->151|182->151|183->152|184->153|185->154|185->154|185->154|186->155|186->155|186->155|187->156|187->156|187->156|187->156|188->157|189->158|190->159|190->159|190->159|191->160|191->160|191->160|192->161|192->161|192->161|192->161|193->162|194->163|195->164|195->164|195->164|196->165|196->165|196->165|197->166|197->166|197->166|197->166|198->167|199->168|200->169|200->169|200->169|201->170|201->170|201->170|202->171|202->171|202->171|202->171|203->172|204->173|205->174|205->174|205->174|206->175|206->175|206->175|207->176|207->176|207->176|207->176|208->177|209->178|210->179|210->179|210->179|211->180|211->180|211->180|212->181|212->181|212->181|212->181|213->182|214->183|215->184|215->184|215->184|216->185|216->185|216->185|217->186|217->186|217->186|219->188|220->189|222->191|244->213
                  -- GENERATED --
              */
          