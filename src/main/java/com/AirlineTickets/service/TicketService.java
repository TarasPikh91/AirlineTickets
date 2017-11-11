package com.AirlineTickets.service;

import com.AirlineTickets.entity.Ticket;

import java.util.List;

public interface TicketService {

<<<<<<< HEAD
    void save(Ticket ticket);

    void update(Ticket ticket);
=======
    void save(Ticket ticket, int planeId, int cityId);

    void update(Ticket ticket, int planeId, int cityId);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b

    void delete(int id);

    List<Ticket> findAll();

    Ticket findOne(int id);
}
