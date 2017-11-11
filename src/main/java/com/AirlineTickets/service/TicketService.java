package com.AirlineTickets.service;

import com.AirlineTickets.entity.Ticket;

import java.util.List;

public interface TicketService {

    void save(Ticket ticket, int planeId, int cityId);

    void update(Ticket ticket, int planeId, int cityId);

    void delete(int id);

    List<Ticket> findAll();

    Ticket findOne(int id);
}
