package com.AirlineTickets.controller;

import com.AirlineTickets.entity.Company;
import com.AirlineTickets.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/company")
    public String company(Model model){
        model.addAttribute("companies", companyService.findAll());
        model.addAttribute("company", new Company());
        return "company";
    }

    @PostMapping("/company")
    public String saveCompany(@ModelAttribute Company company, Model model){
        companyService.save(company);
        return "redirect:/company";
    }

}
