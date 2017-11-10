package com.AirlineTickets.controller;

import com.AirlineTickets.entity.City;
import com.AirlineTickets.service.CityService;
import com.AirlineTickets.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CityController {


    @Autowired
    private CityService cityService;

    @Autowired
    private CountryService countryService;

    @GetMapping("/city")
    public String city(Model model){
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("city", new City());
        return "city";
    }

    @PostMapping("/city")
    public String saveCity(Model model, @ModelAttribute City city, @RequestParam int countryId){
        cityService.save(city, countryId);
        return "redirect:/city";
    }

    @GetMapping("/deleteCity/{id}")
    public String deleteCity(@PathVariable int id){
        cityService.delete(id);
        return "redirect:/city";
    }

    @GetMapping("/updateCity/{id}")
    public String updateCity(@PathVariable int id, Model model){
        City city = cityService.findOne(id);
        model.addAttribute("cityCountries",countryService.findAll());
        model.addAttribute("cityToUpdate", city);
        return "updateCity";
    }

    @PostMapping("/updateCity/{id}")
    public String updateCityFromJSP(@PathVariable int id, @RequestParam int countryId, Model model, @ModelAttribute City city){
        model.addAttribute("currentCity", cityService.findOne(id));
        cityService.update(city, countryId);
        return "redirect:/city";
    }
}
