package controller.impl;

import controller.UserController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserControllerImpl implements UserController {
    @GetMapping("add-user.html")
    @Override
    public String addUser(Model model) {
        return null;
    }

    @Override
    public String editUser(Model model) {
        return null;
    }

    @Override
    public String saveUser(Model model) {
        return null;
    }
}
