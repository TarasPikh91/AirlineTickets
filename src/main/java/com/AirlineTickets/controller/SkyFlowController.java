package com.AirlineTickets.controller;

import com.AirlineTickets.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SkyFlowController {

    @Autowired
    private CityService cityService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("cities", cityService.findAll());
        return"skyflow";
    }


    @PostMapping("/")
    public String indexPost(){ return "skyflow";
    }

}
