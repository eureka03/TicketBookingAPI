package com.example.TicketBooking.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;

import java.time.Instant;
import java.util.UUID;


@Entity
@Table(name="events")
public class Event {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    @Column(name="eventId")
    private UUID id;

    @Column(name="eventName")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="venue")
    private String venue;

    @Min(value=1, message="Capacity must be at least 1")
    @Column(name="totalCapacity")
    private int totalCapacity;

    @Column(name="availableTickets")
    private int availableTickets;

    @Column(name="startsAt")
    private Instant startsAt;


    @Column(name="offlineTicketSold")
    private int offlineTicketsSold;

    @Column(name="createdAt")
    private Instant createdAt;

    public Event(){

    }

    public Event(String name , int totalCapacity , Instant startsAt ,String venue, String description ){
        this.name = name;
        this.description = description;
        this.venue = venue;
        this.totalCapacity = totalCapacity;
        this.startsAt = startsAt;
    }

    public void setEventName(String eventName){
        this.name = eventName;
    }
    public String getEventName(){
        return name;
    }

    public UUID getId(){
        return id;
    }

    public void setTotalCapacity(int eventCapacity){
        this.totalCapacity = eventCapacity;
    }
    public int getTotalCapacity(){
        return totalCapacity;
    }

    public void setStartsAt(Instant startsAt){
        this.startsAt = startsAt;
    }
    public Instant getStartAt(){
        return startsAt;
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

    public void setOfflineTicketSold(int offlineTicketsSold){
        if(offlineTicketsSold < 0 || offlineTicketsSold >totalCapacity){
            throw new IllegalArgumentException("Offline tickets must be between 0 and total capacity");
        }

        this.offlineTicketsSold = offlineTicketsSold;
    }
    public int getOfflineTicketSold(){

        return offlineTicketsSold;
    }

    public Instant getCreatedAt(){
        return createdAt;
    }

    @PrePersist
    protected void onCreate(){
        this.availableTickets = this.totalCapacity - offlineTicketsSold;
        this.createdAt = Instant.now();

    }
}
