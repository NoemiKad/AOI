package controller;

import model.User;
import org.springframework.ui.Model;

public interface UserController {
    String addUser(Model model);
    String editUser(Model model);
    String saveUser(User user);
}
