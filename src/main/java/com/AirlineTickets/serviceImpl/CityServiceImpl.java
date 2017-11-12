package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.CityDao;
import com.AirlineTickets.dao.CountryDao;
import com.AirlineTickets.dao.TicketDao;
import com.AirlineTickets.entity.City;
import com.AirlineTickets.entity.Country;
import com.AirlineTickets.entity.Ticket;
import com.AirlineTickets.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Autowired
    private CountryDao countryDao;

    @Autowired
    private TicketDao ticketDao;

    @Override
    public void save(City city, int countryId) {

        Country country = countryDao.findOne(countryId);
        countryDao.saveAndFlush(country);
        city.setCountry(country);
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
        City city = cityDao.cityWithTicket(id);
        for (Ticket ticket: city.getTickets()){
            ticket.setCity(null);
            ticketDao.saveAndFlush(ticket);
        }

        cityDao.delete(id);
    }

    @Override
    public void update(City city, int countryId) {
        Country country = countryDao.findOne(countryId);
        city.setCountry(country);
        cityDao.save(city);
    }
}
