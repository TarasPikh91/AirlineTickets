package com.AirlineTickets.service;

import com.AirlineTickets.entity.Country;
<<<<<<< HEAD
=======
import org.springframework.data.repository.query.Param;
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b

import java.util.List;

public interface CountryService {

    void save(Country country);

    List<Country> findAll();

    void update(Country country);

    Country findOne(int id);

    void delete(int id);

}
