package com.example.TicketBooking.dto;

import java.time.Instant;
import java.util.UUID;

public class EventResponse {

    private String eventName;
    private UUID eventId;
    private String description;
    private Instant startAt;
    private int availableTickets;
    private String venue;

    public EventResponse(){

    }

    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    public String getEventName(){
        return eventName;
    }

    public void setEventId(UUID eventId){
        this.eventId = eventId;
    }
    public UUID getEventId(){
        return eventId;
    }

    public void setDate(Instant startAt){
        this.startAt = startAt;
    }
    public Instant getStartAt(){
        return startAt;
    }

    public void setAvailableTickets(int availableTickets){
        this.availableTickets = availableTickets;
    }

    public int getAvailableTickets(){
        return availableTickets;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    public void setVenue(String venue){
        this.venue  = venue;
    }
    public String getVenue(){
        return venue;
    }


}
