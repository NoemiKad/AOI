package pl.aoi.marek.branch.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.aoi.marek.branch.dao.EventDao;
import pl.aoi.marek.branch.model.Event;
import pl.aoi.marek.branch.service.EventService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private static final Logger logger = LoggerFactory.getLogger(EventServiceImpl.class);
    private EventDao eventDao;

    @Autowired
    public EventServiceImpl(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public List<Event> getAllEvents() {
        logger.debug("getAllEvents");
        List<Event> result = new ArrayList<>();
        Iterator<Event> eventIterator = eventDao.showAllEvents();
        while (eventIterator.hasNext()){
            result.add(eventIterator.next());
        }
        return result;
    }

    @Override
    public boolean createEvent(Event newEvent) {
        logger.debug("createEvent");
        return eventDao.createEvent(newEvent);
    }
}
