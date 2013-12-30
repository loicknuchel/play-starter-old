package controllers

import play.api._
import play.api.mvc._
import securesocial.core.{ Identity, Authorization }

object SecuredApp extends Controller with securesocial.core.SecureSocial {

  def home = SecuredAction { implicit request =>
    Ok(views.html.pages.secured.home(request.user))
  }

}