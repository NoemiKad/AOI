package service.impl;

import dao.daoInter.EventDao;
import model.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.EventService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class EventServiceImpl implements EventService {


    private static final Logger logger = LoggerFactory.getLogger(EventServiceImpl.class);
    private EventDao eventDao;

    @Autowired
    public EventServiceImpl(@Qualifier("h2") EventDao eventDao){ this.eventDao = eventDao;}

    @Override
    public List<Event> getAllEvents() {
        logger.debug("getAllEvents()");

        List<Event> result = new ArrayList<>();
        Iterator<Event> eventIterator = eventDao.showAllEvents();

        while(eventIterator.hasNext()){
            result.add(eventIterator.next());
        }
        return result;
    }

    @Override
    public boolean saveEvent(Event newEvent) {
        logger.debug("saveEvent()");

        return eventDao.saveEvent(newEvent);
    }

    @Override
    public boolean deleteEvent() {
        logger.debug("deleteEvent()");
        return eventDao.delateEvent();

    }
}
