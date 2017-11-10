package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.CityDao;
import com.AirlineTickets.dao.PlaneDao;
import com.AirlineTickets.dao.TicketDao;
import com.AirlineTickets.entity.City;
import com.AirlineTickets.entity.Plane;
import com.AirlineTickets.entity.Ticket;
import com.AirlineTickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketDao ticketDao;

    @Autowired
    private PlaneDao planeDao;

    @Autowired
    private CityDao cityDao;

    @Override
    public void save(Ticket ticket, int planeId, int cityId) {

        Plane plane = planeDao.findOne(planeId);
        planeDao.saveAndFlush(plane);
        ticket.setPlane(plane);

        City city = cityDao.findOne(cityId);
        cityDao.saveAndFlush(city);
        ticket.setCity(city);


        ticketDao.save(ticket);
    }

    @Override
    public void update(Ticket ticket, int planeId, int cityId) {

        Plane plane = planeDao.findOne(planeId);
        ticket.setPlane(plane);

        City city = cityDao.findOne(cityId);
        ticket.setCity(city);

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
