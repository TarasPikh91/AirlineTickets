package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.CityDao;
<<<<<<< HEAD
import com.AirlineTickets.entity.City;
=======
import com.AirlineTickets.dao.CountryDao;
import com.AirlineTickets.dao.TicketDao;
import com.AirlineTickets.entity.City;
import com.AirlineTickets.entity.Country;
import com.AirlineTickets.entity.Ticket;
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
import com.AirlineTickets.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

<<<<<<< HEAD
    @Override
    public void save(City city) {
=======
    @Autowired
    private CountryDao countryDao;

    @Autowired
    private TicketDao ticketDao;

    @Override
    public void save(City city, int countryId) {

        Country country = countryDao.findOne(countryId);
        countryDao.saveAndFlush(country);
        city.setCountry(country);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
        cityDao.save(city);
    }

    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }

    @Override
    public City findOne(int id) {
        return cityDao.findOne(id);
    }

    @Override
    public void delete(int id) {
<<<<<<< HEAD
=======
        City city = cityDao.cityWithTicket(id);
        for (Ticket ticket: city.getTickets()){
            ticket.setCity(null);
            ticketDao.saveAndFlush(ticket);
        }

>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
        cityDao.delete(id);
    }

    @Override
<<<<<<< HEAD
    public void update(City city) {
=======
    public void update(City city, int countryId) {
        Country country = countryDao.findOne(countryId);
        city.setCountry(country);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
        cityDao.save(city);
    }
}
