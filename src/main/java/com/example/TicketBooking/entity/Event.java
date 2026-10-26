package com.example.TicketBooking.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="event")
public class Event {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long eventId;
    private String eventName;
    private int eventCapacity;
    private LocalDateTime eventDate;

    public Event(){

    }

    public Event(String eventName , Long eventId , int eventCapacity , LocalDateTime eventDate){
        this.eventName = eventName;
        this.eventId = eventId;
        this.eventCapacity = eventCapacity;
        this.eventDate = eventDate;
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

    public void setEventDate(LocalDateTime eventDate){
        this.eventDate = eventDate;
    }
}
