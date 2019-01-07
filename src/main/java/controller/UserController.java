package controller;

import org.springframework.ui.Model;

public interface UserController {
    String addUser(Model model);
    String editUser(Model model);
    String saveUser(Model model);
}
