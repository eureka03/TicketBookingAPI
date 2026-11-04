package com.example.TicketBooking.service;

import com.example.TicketBooking.dto.EventRequest;
import com.example.TicketBooking.dto.EventResponse;
import com.example.TicketBooking.entity.Event;
import com.example.TicketBooking.repository.EventRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }


    public EventResponse createEvent(EventRequest eventRequest){
        Event newEvent = new Event();
        newEvent.setDescription(eventRequest.getDescription());
        newEvent.setName(eventRequest.getEventName());
        newEvent.setVenue(eventRequest.getVenue());
        newEvent.setTotalCapacity(eventRequest.getTotalCapacity());
        newEvent.setOfflineTicketSold(eventRequest.getOfflineTicketsSold());
        newEvent.setStartsAt(eventRequest.getStartAt());
        Event savedEvent = eventRepository.save(newEvent);


        return mapToResponse(savedEvent);


    }

    public List<EventResponse> getAllEvents(){
            List<Event>  events = eventRepository.findAll();
            List<EventResponse> allEvents = new ArrayList<>();

            for(Event e:events){
                EventResponse eventResponse = mapToResponse(e);
                allEvents.add(eventResponse);

            }

            return allEvents;

    }

    private EventResponse mapToResponse(Event e){
        EventResponse eventResponse = new EventResponse();
        eventResponse.setEventName(e.getName());
        eventResponse.setAvailableTickets(e.getAvailableTickets());
        eventResponse.setEventId(e.getId());
        eventResponse.setVenue(e.getVenue());

        return eventResponse;
    }
}
