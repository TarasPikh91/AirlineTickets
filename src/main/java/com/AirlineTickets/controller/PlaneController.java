package com.AirlineTickets.controller;

import com.AirlineTickets.entity.Plane;
import com.AirlineTickets.service.CompanyService;
import com.AirlineTickets.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlaneController {

    @Autowired
    private PlaneService planeService;

    @Autowired
    private CompanyService companyService;


    @GetMapping("/plane")
    public String plane(Model model){
        model.addAttribute("planes", planeService.findAll());
        model.addAttribute("companies", companyService.findAll());
        model.addAttribute("plane", new Plane());
        return "plane";
    }

    @PostMapping("/plane")
    public String savePlane(@ModelAttribute Plane plane, Model model, @RequestParam int companyId){
        planeService.save(plane, companyId);
        return "redirect:/plane";
    }

    @GetMapping("/deletePlane/{id}")
    public String deletePlane(@PathVariable int id){
        planeService.delete(id);
        return "redirect:/plane";
    }

    @GetMapping("/updatePlane/{id}")
    public String updatePlaneToJsp(Model model, @PathVariable int id){
        Plane plane
                = planeService.findOne(id);
        model.addAttribute("planeToUpdate", plane);
        model.addAttribute("companies", companyService.findAll());
        return "updatePlane";
    }

    @PostMapping("/updatePlane/{id}")
    public String updatePlaneFromJsp(@PathVariable int id, Model model, @ModelAttribute Plane plane, @RequestParam int companyId){
        model.addAttribute("currentPlane", planeService.findOne(id));
        planeService.update(plane, companyId);
        return "redirect:/plane";
    }

}
