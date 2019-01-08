package pl.aoi.marek.branch.dao;

import pl.aoi.marek.branch.model.Event;

import java.util.Iterator;

public interface EventDao {

    Iterator<Event> showAllEvents();
    boolean createEvent(Event event);
}
