package service;

import model.Event;

import java.util.List;

public interface EventService {


    List<Event> getAllEvents();
    boolean saveEvent(Event newEvent);
    boolean deleteEvent();
}
