package com.piyapatproject.springboot.controller;

import com.piyapatproject.springboot.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    // handle method to handle home page request
    @GetMapping("/index")
    public String home() {
        return "index";
    }

    // handle method to handle user registration form request
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        // create model object to store form data
        UserDto user = new UserDto();
        // add this user to a model by using this
        model.addAttribute("user", user);
        return "register";
    }
}
