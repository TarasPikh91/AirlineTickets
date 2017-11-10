package com.AirlineTickets.controller;

import com.AirlineTickets.entity.Company;
import com.AirlineTickets.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/deleteCompany/{id}")
    public String deleteCompany(@PathVariable int id){
        companyService.delete(id);
        return "redirect:/company";
    }

    @GetMapping("/updateCompany/{id}")
    public String updateCompany(@PathVariable int id, Model model){
        Company company = companyService.findOne(id);
        model.addAttribute("companyToUpdate", company);
        return "updateCompany";
    }

    @PostMapping("/updateCompany/{id}")
    public String updateCompany(@PathVariable int id, Model model, @ModelAttribute Company company){
        model.addAttribute("companyToUpdate", companyService.findOne(id));
        companyService.update(company);
        return "redirect:/company";
    }

}
