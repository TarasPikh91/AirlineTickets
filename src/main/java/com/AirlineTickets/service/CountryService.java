package com.AirlineTickets.service;

import com.AirlineTickets.entity.Country;

import java.util.List;

public interface CountryService {

    void save(Country country);

    List<Country> findAll();

    void update(Country country);

    Country findOne(int id);

    void delete(int id);

}
