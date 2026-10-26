package com.example.TicketBooking.controller;

import com.example.TicketBooking.dto.EventRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @PostMapping
    public ResponseEntity<?> createEvent(@RequestBody EventRequest eventRequest){

    }

    @GetMapping
    public ResponseBody<?> getEvents(){

    }
}
