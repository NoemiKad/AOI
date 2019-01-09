package pl.aoi.marek.branch.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import pl.aoi.marek.branch.dao.EventDao;
import pl.aoi.marek.branch.model.Event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class EventDaoImpl implements EventDao {


    private static final Logger logger = LoggerFactory.getLogger(EventDaoImpl.class);
    static List<Event> events = new ArrayList<>();



    @Override
    public Iterator<Event> showAllEvents() {
        logger.debug("showAllEvents");
        return events.iterator();
    }

    @Override
    public boolean createEvent(Event event) {
        logger.debug("createEvent");

        if (null == event.getId()) {
            events.add(event);
        } else {
            events.set((int) (event.getId() - 1), event);
        }
        return true;

    }





    }

