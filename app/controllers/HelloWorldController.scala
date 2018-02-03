package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

import scala.concurrent.Future

/**
  * Created by david on 03/02/18.
  */
@Singleton
class HelloWorldController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  val helloWorld: Action[AnyContent] = Action.async { implicit request =>
    Future.successful(Ok(views.html.hello_world()))
  }
}
