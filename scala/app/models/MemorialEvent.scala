package models

import java.util.{Date}

case class MemorialEvent( date: java.util.Date, name: String, description: String)


object MemorialEvent {  
    
  var format = new java.text.SimpleDateFormat("dd-MM-yyyy")
  var memorialEvents = Set(    
        MemorialEvent(format.parse("2001-09-11"), "September 11", "World Trade Center"),
        MemorialEvent(format.parse("2012-07-20"), "Aurora Theatre Shooting",      "Description"),    
        MemorialEvent(format.parse("1999-04-12"), "Columbine High School",      "Description"),
        MemorialEvent(format.parse("2011-07-22"), "Norway Terror Attacks",      "The 2011 Norway attacks were two sequential lone wolf terrorist attacks against the government, the civilian population and a Workers' Youth League (AUF)-run summer camp in Norway on 22 July 2011, claiming a total of 77 lives."),    
        MemorialEvent(format.parse("2012-12-14"), "Sandy Hook Elementary",      " Adam Lanza fatally shot twenty children and six adult staff members in a mass murder at Sandy Hook Elementary School in the village of Sandy Hook in Newtown, Connecticut.[5][6] Before driving to the school, Lanza shot and killed his mother Nancy at their Newtown home.")  )
        
        
  def findAll = memorialEvents.toList.sortBy(_.date) 
}
