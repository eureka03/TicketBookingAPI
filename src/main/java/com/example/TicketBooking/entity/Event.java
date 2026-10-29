package com.example.TicketBooking.entity;


import jakarta.persistence.*;

import java.time.Instant;


@Entity
@Table(name="event")
public class Event {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long eventId;
    private String eventName;
    private String description;
    private String venue;
    private int eventCapacity;
    private int availableTickets;
    private Instant startsAt;

    public Event(){

    }

    public Event(String eventName , Long eventId ,int availableTickets, int eventCapacity , Instant startsAt ,String venue, String description){
        this.eventName = eventName;
        this.availableTickets = availableTickets;
        this.description = description;
        this.venue = venue;
        this.eventId = eventId;
        this.eventCapacity = eventCapacity;
        this.startsAt = startsAt;
    }

    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    public String getEventName(){
        return eventName;
    }

    public void setEventId(Long eventId){
        this.eventId = eventId;
    }
    public Long getEventId(){
        return eventId;
    }

    public void setEventCapacity(int eventCapacity){
        this.eventCapacity = eventCapacity;
    }
    public int getEventCapacity(){
        return eventCapacity;
    }

    public void setStartsAt(Instant startsAt){
        this.startsAt = startsAt;
    }
    public Instant getStartAt(){
        return startsAt;
    }

    public void setAvailableTickets(int availableTickets){
        this.availableTickets = availableTickets;
    }
    public int getAvailableTickets(){
        return availableTickets;
    }

    public void setVenue(String venue){
        this.venue = venue;
    }
    public String getVenue(){
        return venue;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

}
