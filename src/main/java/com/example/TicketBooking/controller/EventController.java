package com.example.TicketBooking.controller;

import com.example.TicketBooking.dto.EventRequest;
import com.example.TicketBooking.dto.EventResponse;
import com.example.TicketBooking.service.EventService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @PostMapping
    public ResponseEntity<EventResponse> createEvent(@RequestBody EventRequest eventRequest){
        EventResponse response = eventService.createEvent(eventRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<EventResponse>> getEvents(){
        List<EventResponse> response = eventService.getAllEvents();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
