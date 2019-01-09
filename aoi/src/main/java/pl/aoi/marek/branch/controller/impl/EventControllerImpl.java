package pl.aoi.marek.branch.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.aoi.marek.branch.controller.EventController;
import pl.aoi.marek.branch.model.Event;
import pl.aoi.marek.branch.service.EventService;

import java.util.List;

@Controller
public class EventControllerImpl implements EventController {


    private static final Logger logger = LoggerFactory.getLogger(EventControllerImpl.class);
    private static final String ACTION = "action";
    private static final String EVENT = "eventToEdit";



    private EventService eventService;


    @Autowired
    public EventControllerImpl(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/allevents")
    @Override
    public String showAllEvents(Model model) {
        List<Event> eventsToShow = eventService.getAllEvents();

        model.addAttribute("events", eventsToShow);

        return "events";
    }


    @GetMapping("/add-event")
    @Override
    public String addEvent(Model model) {
        logger.debug("addEvent()");

        model.addAttribute(EVENT, new Event());
        model.addAttribute(ACTION, "Add new");


        return "add-event";
    }

    @GetMapping("/event/save")
    @Override
    public String saveEvent(@ModelAttribute Event event) {
        logger.debug("saveEvent(), event: {}", event);

        eventService.createEvent(event);

        return "redirect:/allevents";
    }

    /*
    @Override
    public String home(){return null;}*/

    @Override
    public String ChooseAnEvent() {


        return null;
    }
}
