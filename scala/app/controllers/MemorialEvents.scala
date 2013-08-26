package controllers

import play.api.mvc.{Action, Controller} 
import models.MemorialEvent

object MemorialEvents extends Controller {
  def list = Action { implicit request => val memorialEvents = MemorialEvent.findAll  
    Ok(views.html.MemorialEvents.list(memorialEvents))   
    } 
}
