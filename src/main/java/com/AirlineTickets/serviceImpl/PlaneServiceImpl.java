package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.CompanyDao;
import com.AirlineTickets.dao.PlaneDao;
import com.AirlineTickets.dao.TicketDao;
import com.AirlineTickets.entity.Company;
import com.AirlineTickets.entity.Plane;
import com.AirlineTickets.entity.Ticket;
import com.AirlineTickets.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneServiceImpl implements PlaneService {

    @Autowired
    private PlaneDao planeDao;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private TicketDao ticketDao;

    @Override
    public void save(Plane plane, int companyId) {

        Company company = companyDao.findOne(companyId);
        companyDao.saveAndFlush(company);
        plane.setCompany(company);
        planeDao.save(plane);
    }

    @Override
    public void delete(int id) {
        Plane plane = planeDao.planeWithTickets(id);
        for(Ticket ticket: plane.getTickets()){
            ticket.setPlane(null);
            ticketDao.saveAndFlush(ticket);
        }
        planeDao.delete(id);
    }

    @Override
    public Plane findOne(int id) {
        return planeDao.findOne(id);
    }

    @Override
    public List<Plane> findAll() {
        return planeDao.findAll();
    }

    @Override
    public void update(Plane plane, int companyId) {

        Company company = companyDao.findOne(companyId);
        plane.setCompany(company);
        planeDao.save(plane);
    }
}
