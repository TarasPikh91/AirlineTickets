package com.AirlineTickets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SkyFlowController {

    @GetMapping("/")
    public String index() { return"skyflow";
    }


    @PostMapping("/")
    public String indexPost(){ return "skyflow";
    }

}
