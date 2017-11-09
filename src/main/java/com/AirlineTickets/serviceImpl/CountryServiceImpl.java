package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.CountryDao;
import com.AirlineTickets.entity.Country;
import com.AirlineTickets.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDao countryDao;
    @Override
    public void save(Country country) {
        countryDao.save(country);
    }

    @Override
    public List<Country> findAll() {
        return countryDao.findAll();
    }

    @Override
    public void update(Country country) {
        countryDao.save(country);
    }

    @Override
    public Country findOne(int id) {
        return countryDao.findOne(id);
    }

    @Override
    public void delete(int id) {
        countryDao.delete(id);
    }
}
