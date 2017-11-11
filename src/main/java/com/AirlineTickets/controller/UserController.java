package com.AirlineTickets.controller;

import com.AirlineTickets.entity.User;
import com.AirlineTickets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String user(Model model){
        model.addAttribute("users", userService.findAll());
        model.addAttribute("user", new User());
        return "user";
    }

    @PostMapping("/user")
    public String saveUser(@ModelAttribute User user){
        userService.save(user);
        return "redirect:/user";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        userService.delete(id);
        return "redirect:/user";
    }

    @GetMapping("/updateUser/{id}")
    public String updateUserToJsp(@PathVariable int id, Model model){
        User user = userService.findOne(id);
        model.addAttribute("userToUpdate", user);
        return "updateUser";
    }

    @PostMapping("/updateUser/{id}")
    public String updateUserFromJsp(@PathVariable int id, Model model, @ModelAttribute User user){
        model.addAttribute("userToUpdate", userService.findOne(id));
        userService.update(user);
        return "redirect:/user";
    }

}
