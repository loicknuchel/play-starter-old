package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.pages.index("Play 2 Starter"))
  }

  def page2 = Action {
    Ok(views.html.pages.page2("Play 2 Starter"))
  }

  def login = Action {
    Ok(views.html.pages.login("Play 2 Starter"))
  }

  def signup = Action {
    Ok(views.html.pages.signup("Play 2 Starter"))
  }

  def welcome = Action {
    Ok(views.html.pages.welcome("Your new application is ready."))
  }

}