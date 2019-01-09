package pl.aoi.marek.branch.controller;


import org.springframework.ui.Model;
import pl.aoi.marek.branch.model.Event;

public interface EventController {

    String showAllEvents(Model model);
    String addEvent (Model model);
    String saveEvent ( Event event);
  //  String home();





    String ChooseAnEvent();




}
