package pl.aoi.marek.branch.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.aoi.marek.branch.model.Event;
import pl.aoi.marek.branch.rest.EventRestController;
import pl.aoi.marek.branch.service.EventService;

import java.util.List;

@RestController
public class EventRestControllerImpl implements EventRestController {


    private EventService eventService;

    @Autowired
    public EventRestControllerImpl(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/read-events-as-json")
    @Override
    public List<Event> showAllEvents() {
        return eventService.getAllEvents();
    }
}
