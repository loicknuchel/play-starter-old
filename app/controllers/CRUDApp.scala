package controllers

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models._
import org.bson.types.ObjectId

object CRUDApp extends Controller {
  case class UserFormData(username: String, firstName: String, lastName: String, mail: String, password: String) {
    def toUser: User = User(new ObjectId, username, Some(firstName), Some(lastName), Some(mail), Some(password))
  }
  val userForm = Form(
    mapping(
      "username" -> text,
      "firstName" -> text,
      "lastName" -> text,
      "mail" -> email,
      "password" -> nonEmptyText(minLength = 6))(UserFormData.apply)(UserFormData.unapply))

  def users = Action {
    Ok(views.html.pages.CRUD(User.all(), userForm))
  }

  def newUser = Action { implicit request =>
    userForm.bindFromRequest.fold(
      errors => BadRequest(views.html.pages.CRUD(User.all(), errors)),
      user => {
        User.create(user.toUser)
        Redirect(routes.CRUDApp.users)
      })
  }

  def deleteUser(username: String) = Action {
    User.delete(username)
    Redirect(routes.CRUDApp.users)
  }

}