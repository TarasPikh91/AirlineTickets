package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.TicketDao;
import com.AirlineTickets.entity.Ticket;
import com.AirlineTickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketDao ticketDao;

    @Override
    public void save(Ticket ticket) {
        ticketDao.save(ticket);
    }

    @Override
    public void update(Ticket ticket) {
        ticketDao.save(ticket);
    }

    @Override
    public void delete(int id) {
        ticketDao.delete(id);
    }

    @Override
    public List<Ticket> findAll() {
        return ticketDao.findAll();
    }

    @Override
    public Ticket findOne(int id) {
        return ticketDao.findOne(id);
    }
}
