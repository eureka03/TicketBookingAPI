package com.example.TicketBooking.dto;

import java.time.LocalDateTime;

public class EventRequest {

    private String eventName;
    private int eventCapacity;
    private LocalDateTime date;

    public EventRequest(){

    }

   public void setEventName(String eventName){
        this.eventName = eventName;
   }
   public String getEventName(){
        return eventName;
   }

   public void setEventCapacity(int eventCapacity){
        this.eventCapacity = eventCapacity;
   }
   public int getEventCapacity(){
        return eventCapacity;
   }

   public void setDate(LocalDateTime date){
        this.date = date;
   }
   public LocalDateTime getDate(){
        return date;
   }
}
