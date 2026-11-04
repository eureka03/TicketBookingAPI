package com.example.TicketBooking.dto;

import java.time.Instant;
import java.time.LocalDateTime;

public class EventRequest {

    private String name;
    private String description;
    private int totalCapacity;
    private Instant startAt;
    private int offlineTicketsSold;
    private String venue;


    public EventRequest(){

    }

   public void setEventName(String eventName){
        this.name = eventName;
   }
   public String getEventName(){
        return name;
   }

   public void setDescription(String description){
        this.description = description;
   }
   public String getDescription(){
        return description;
   }

   public void setTotalCapacity(int eventCapacity){
        this.totalCapacity = eventCapacity;
   }
   public int getTotalCapacity(){
        return totalCapacity;
   }

   public void setStartAt(Instant startAt){
        this.startAt = startAt;
   }
   public Instant getStartAt(){
        return startAt;
   }

   public void setOfflineTicketsSold(int offlineTicketsSold){
        this.offlineTicketsSold = offlineTicketsSold;
   }
   public int getOfflineTicketsSold(){
        return offlineTicketsSold;
   }

   public void setVenue(String venue){
        this.venue = venue;
   }
   public String getVenue(){
        return venue;
   }
}
