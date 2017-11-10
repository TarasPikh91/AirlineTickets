package com.AirlineTickets.dao;

import com.AirlineTickets.entity.City;
import com.AirlineTickets.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryDao extends JpaRepository<Country, Integer> {

    @Query("select c from Country c left join fetch c.cities where c.id=:id")
    Country countryWithCity(@Param("id") int id);
}
