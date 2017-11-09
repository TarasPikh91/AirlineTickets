package com.AirlineTickets.controller;

import com.AirlineTickets.entity.User;
import com.AirlineTickets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String user(Model model){
        model.addAttribute("users", userService.findAll());
        return "user";
    }

}
