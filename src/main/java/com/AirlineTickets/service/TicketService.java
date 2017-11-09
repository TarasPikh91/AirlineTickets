package com.AirlineTickets.service;

import com.AirlineTickets.entity.Ticket;

import java.util.List;

public interface TicketService {

    void save(Ticket ticket);

    void update(Ticket ticket);

    void delete(int id);

    List<Ticket> findAll();

    Ticket findOne(int id);
}
