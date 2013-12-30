package controllers

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models._

object CRUDApp extends Controller {

  val userForm = Form(
    "username" -> nonEmptyText)

  def users = Action {
    Ok(views.html.pages.CRUD(User.all(), userForm))
  }

  def newUser = Action { implicit request =>
    userForm.bindFromRequest.fold(
      errors => BadRequest(views.html.pages.CRUD(User.all(), errors)),
      username => {
        User.create(username)
        Redirect(routes.CRUDApp.users)
      })
  }

  def deleteUser(username: String) = Action {
    User.delete(username)
    Redirect(routes.CRUDApp.users)
  }

}