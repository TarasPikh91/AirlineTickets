package com.AirlineTickets.controller;

import com.AirlineTickets.entity.Country;
import com.AirlineTickets.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public String country(Model model){
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("country", new Country());
        return "country";
    }

    @PostMapping("/country")
    public String saveCounry(@ModelAttribute Country country, Model model){
        countryService.save(country);
        return "redirect:/country";
    }

<<<<<<< HEAD
=======
    @GetMapping("/deleteCountry/{id}")
    public String deleteCountry(@PathVariable int id){
        countryService.delete(id);
        return "redirect:/country";
    }

    @GetMapping("/updateCountry/{id}")
    public String updateCountry(@PathVariable int id, Model model){
        Country country = countryService.findOne(id);
        model.addAttribute("currentCountry", country);
        return "updateCountry";
    }

    @PostMapping("/updateCountry/{id}")
    public String updateCountryFromJPS(@PathVariable int id, Model model, @ModelAttribute Country country){
        model.addAttribute("currentCountry", countryService.findOne(id));
        countryService.update(country);
        return "redirect:/country";
    }

>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
}
