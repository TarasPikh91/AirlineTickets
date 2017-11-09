package com.AirlineTickets.controller;

import com.AirlineTickets.entity.Ticket;
import com.AirlineTickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/ticket")
    public String ticket(Model model){
        model.addAttribute("tickets", ticketService.findAll());
        model.addAttribute("tocket", new Ticket());
        return "ticket";
    }

    @PostMapping("/ticket")
    public String save(Model model, @ModelAttribute Ticket ticket){
        ticketService.save(ticket);
        return "redirect:/ticket";
    }


}
