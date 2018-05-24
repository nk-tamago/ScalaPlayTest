package controllers

import javax.inject._
import play.api._
import play.api.mvc._
//import modules.Helpers._
//import org.mongodb.scala._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    
    val message="hello world"
    Ok(views.html.index(message))
  }
}
