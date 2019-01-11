package controller.impl;

import controller.MainPageController;
import org.springframework.web.bind.annotation.GetMapping;

public class MainPageControllerImpl implements MainPageController {

    @GetMapping({"/", "home", "index"})
    @Override
    public String home() {
        return "home";
    }
}
