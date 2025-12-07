package web.controller;

import org.springframework.security.core.Authentication;
import web.model.User;
//import web.security.UserDetailsImpl;
import web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String getUser(Authentication authentication, Model model) {

        User userDetails = (User) authentication.getPrincipal();
        Long currentUserId = userDetails.getId();

        model.addAttribute("user",userService.findById(currentUserId));
        return "user/user";
    }

}