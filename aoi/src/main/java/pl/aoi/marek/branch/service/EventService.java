package pl.aoi.marek.branch.service;


import pl.aoi.marek.branch.model.Event;

import java.util.List;

public interface EventService {

    List<Event> getAllEvents();
    boolean createEvent(Event newEvent);





}
