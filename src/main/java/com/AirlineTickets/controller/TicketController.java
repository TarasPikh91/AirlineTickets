package com.AirlineTickets.controller;

import com.AirlineTickets.entity.Ticket;
import com.AirlineTickets.service.CityService;
import com.AirlineTickets.service.PlaneService;
import com.AirlineTickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private PlaneService planeService;

    @Autowired
    private CityService cityService;

    @GetMapping("/ticket")
    public String ticket(Model model){
        model.addAttribute("tickets", ticketService.findAll());
        model.addAttribute("planes", planeService.findAll());
        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("ticket", new Ticket());
        return "ticket";
    }

    @PostMapping("/ticket")
    public String save(Model model, @ModelAttribute Ticket ticket, @RequestParam int planeId, @RequestParam int cityId){
        ticketService.save(ticket, planeId, cityId);
        return "redirect:/ticket";
    }

    @GetMapping("/deleteTicket/{id}")
    public String deleteTicket(@PathVariable int id){
        ticketService.delete(id);
        return "redirect:/ticket";
    }

    @GetMapping("/updateTicket/{id}")
    public String updateTicketToJsp(@PathVariable int id, Model model){
        Ticket ticket =ticketService.findOne(id);
        model.addAttribute("planes", planeService.findAll());
        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("ticketToUpdate", ticket);
        return "updateTicket";
    }

    @PostMapping("/updateTicket/{id}")
    public String updateTicketFromJsp(@PathVariable int id, Model model, @ModelAttribute Ticket ticket, @RequestParam int planeId, @RequestParam int cityId){
        model.addAttribute("currentTicket", ticketService.findOne(id));
        ticketService.update(ticket, planeId, cityId);
        return "redirect:/ticket";
    }

}
