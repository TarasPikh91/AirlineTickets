package com.AirlineTickets.controller;

import com.AirlineTickets.entity.City;
import com.AirlineTickets.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CityController {


    @Autowired
    private CityService cityService;

    @GetMapping("/city")
    public String city(Model model){
        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("city", new City());
        return "city";
    }

    @PostMapping("/city")
    public String saveCity(Model model, @ModelAttribute City city){
        cityService.save(city);
        return "redirect:/city";
    }
}
