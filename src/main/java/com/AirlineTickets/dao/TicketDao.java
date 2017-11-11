package com.AirlineTickets.dao;

import com.AirlineTickets.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketDao extends JpaRepository<Ticket, Integer> {
}
