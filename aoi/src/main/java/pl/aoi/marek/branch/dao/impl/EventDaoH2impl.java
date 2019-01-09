package pl.aoi.marek.branch.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import pl.aoi.marek.branch.dao.EventDao;
import pl.aoi.marek.branch.dao.EventRepository;
import pl.aoi.marek.branch.model.Event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@Repository
@Qualifier("h2")
public class EventDaoH2impl implements EventDao {



    private static final Logger logger = LoggerFactory.getLogger(EventDaoImpl.class);
    private EventRepository eventRepository;

    @Autowired
    public EventDaoH2impl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Iterator<Event> showAllEvents() {
        logger.debug("showAllEvents");

        return eventRepository.findAll().iterator();
    }

    @Override
    public boolean createEvent(Event event) {
        logger.debug("createEvent(), id: {}", event);

        eventRepository.save(event);
        return  true;
    }
}
