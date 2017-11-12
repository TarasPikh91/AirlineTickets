package com.AirlineTickets.service;

import com.AirlineTickets.entity.City;

import java.util.List;

public interface CityService {

    void save(City city, int countryId);

    List<City> findAll();

    City findOne(int id);

    void delete(int id);

    void update(City city, int countryId);
}
