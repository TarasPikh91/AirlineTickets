package com.AirlineTickets.dao;

<<<<<<< HEAD
import com.AirlineTickets.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryDao extends JpaRepository<Country, Integer> {
=======
import com.AirlineTickets.entity.City;
import com.AirlineTickets.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryDao extends JpaRepository<Country, Integer> {

    @Query("select c from Country c left join fetch c.cities where c.id=:id")
    Country countryWithCity(@Param("id") int id);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
}
