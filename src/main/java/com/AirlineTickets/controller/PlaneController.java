package com.AirlineTickets.controller;

import com.AirlineTickets.entity.Plane;
import com.AirlineTickets.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PlaneController {

    @Autowired
    private PlaneService planeService;

    @GetMapping("/plane")
    public String plane(Model model){
        model.addAttribute("planes", planeService.findAll());
        model.addAttribute("plane", new Plane());
        return "plane";
    }

    @PostMapping("/plane")
    public String savePlane(@ModelAttribute Plane plane, Model model){
        planeService.save(plane);
        return "redirect:/plane";
    }
}
