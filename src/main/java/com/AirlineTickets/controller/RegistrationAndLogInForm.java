package com.AirlineTickets.controller;

import com.AirlineTickets.entity.User;
import com.AirlineTickets.service.MailSendlerService;
import com.AirlineTickets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
public class RegistrationAndLogInForm {

    @Autowired
    private UserService userService;

    @Autowired
    private MailSendlerService mailSendlerService;

    @GetMapping("/registrationAndLogIn")
    public String user(Model model){
        model.addAttribute("users", userService.findAll());
        model.addAttribute("user", new User());
        return "registrationAndLogIn";
    }

    @PostMapping("/registrationAndLogIn")
    public String saveUser(@ModelAttribute User user, Model model){

        String uuid = UUID.randomUUID().toString();
        user.setUuid(uuid);
        userService.save(user);

        String theme = "Hello";
        String mailBody = "http://localhost:8080/confirm/"+uuid;
        mailSendlerService.sendMail(theme,mailBody,user.getEmail());

        return "redirect:/registrationAndLogIn";
    }

    @GetMapping("/confirm/{uuid}")
    public String uuid(@PathVariable String uuid){
        User user = userService.userWithUuid(uuid);
        user.setEnable(true);
        userService.update(user);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String logInBefore(Model model){
        model.addAttribute("users", userService.findAll());
        model.addAttribute("user", new User());
        return "registrationAndLogIn";
    }

    @PostMapping("/login")
    public String logInAfter(){
        return "registrationAndLogIn";
    }


    @PostMapping("/failureLogin")
    public String failureLogin(Model model, @RequestParam String email, @RequestParam String password){

       new User(email, password);

            model.addAttribute("user", new User());

        return "redirect:/registrationAndLogIn";
    }

}
