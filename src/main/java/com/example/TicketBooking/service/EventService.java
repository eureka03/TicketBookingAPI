package com.example.TicketBooking.service;

import com.example.TicketBooking.dto.EventRequest;
import com.example.TicketBooking.dto.EventResponse;
import com.example.TicketBooking.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }


    public EventResponse createEvent(EventRequest eventRequest){


    }

    public List<EventResponse> getAllEvents(){

    }
}
