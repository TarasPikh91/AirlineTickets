package com.AirlineTickets.serviceImpl;

<<<<<<< HEAD
import com.AirlineTickets.dao.CountryDao;
=======
import com.AirlineTickets.dao.CityDao;
import com.AirlineTickets.dao.CountryDao;
import com.AirlineTickets.entity.City;
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
import com.AirlineTickets.entity.Country;
import com.AirlineTickets.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDao countryDao;
<<<<<<< HEAD
=======

    @Autowired
    private CityDao cityDao;


>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
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
<<<<<<< HEAD
        countryDao.delete(id);
    }
=======
        Country country = countryDao.countryWithCity(id);
        for(City city :country.getCities()){
            city.setCountry(null);
            cityDao.saveAndFlush(city);
        }

        countryDao.delete(id);
    }

>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
}
