package com.AirlineTickets.serviceImpl;

<<<<<<< HEAD
import com.AirlineTickets.dao.PlaneDao;
import com.AirlineTickets.entity.Plane;
=======
import com.AirlineTickets.dao.CompanyDao;
import com.AirlineTickets.dao.PlaneDao;
import com.AirlineTickets.dao.TicketDao;
import com.AirlineTickets.entity.Company;
import com.AirlineTickets.entity.Plane;
import com.AirlineTickets.entity.Ticket;
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
import com.AirlineTickets.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneServiceImpl implements PlaneService {

    @Autowired
    private PlaneDao planeDao;

<<<<<<< HEAD
    @Override
    public void save(Plane plane) {
=======
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private TicketDao ticketDao;

    @Override
    public void save(Plane plane, int companyId) {

        Company company = companyDao.findOne(companyId);
        companyDao.saveAndFlush(company);
        plane.setCompany(company);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
        planeDao.save(plane);
    }

    @Override
    public void delete(int id) {
<<<<<<< HEAD
=======
        Plane plane = planeDao.planeWithTickets(id);
        for(Ticket ticket: plane.getTickets()){
            ticket.setPlane(null);
            ticketDao.saveAndFlush(ticket);
        }
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
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
<<<<<<< HEAD
    public void update(Plane plane) {
=======
    public void update(Plane plane, int companyId) {

        Company company = companyDao.findOne(companyId);
        plane.setCompany(company);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
        planeDao.save(plane);
    }
}
