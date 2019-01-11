package controller.impl;

import controller.UserController;
import model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import service.UserService;

@Controller
public class UserControllerImpl implements UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserControllerImpl.class);
    private static final String ACTION = "action";
    private static final String USER= "editedUser";

    private UserService userService;

    @Autowired
    public UserControllerImpl(UserService userService){this.userService = userService;}

    @GetMapping("/add-user")
    @Override
    public String addUser(Model model) {
        logger.debug("addUser()");

        model.addAttribute(USER, new User());
        model.addAttribute(ACTION, "Add new");
        return "add-or-edit-user";
    }

    @Override
    public String editUser(Model model) {
        return null;
    }

    @PostMapping("/user/save")
    @Override
    public String saveUser(@ModelAttribute User user) {
        logger.debug("saveUser(), user{}", user);

        userService.saveUser(user);

        return "redirect/home";
    }
}
