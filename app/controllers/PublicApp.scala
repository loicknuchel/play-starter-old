package controllers

import play.api._
import play.api.mvc._

object PublicApp extends Controller {

  def index = Action {
    Ok(views.html.pages.index())
  }

  def page2 = Action {
    Ok(views.html.pages.page2())
  }

  def welcome = Action {
    Ok(views.html.pages.welcome("Your new application is ready."))
  }

}