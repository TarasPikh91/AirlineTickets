package com.AirlineTickets.dao;

import com.AirlineTickets.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CityDao extends JpaRepository<City, Integer> {

    @Query("select c from City c left join fetch c.tickets where c.id=:id")
    City cityWithTicket(@Param("id") int id);
}
