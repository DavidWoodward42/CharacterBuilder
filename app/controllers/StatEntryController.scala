package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

import scala.concurrent.Future

/**
  * Created by david on 03/02/18.
  */
@Singleton
class StatEntryController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  val statEntry: Action[AnyContent] = Action.async { implicit request =>
    Future.successful(Ok(views.html.stat_entry()))
  }
}
