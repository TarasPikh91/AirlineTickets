package com.AirlineTickets.service;

import com.AirlineTickets.entity.City;

import java.util.List;

public interface CityService {

<<<<<<< HEAD
    void save(City city);
=======
    void save(City city, int countryId);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b

    List<City> findAll();

    City findOne(int id);

    void delete(int id);

<<<<<<< HEAD
    void update(City city);
=======
    void update(City city, int countryId);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
}
