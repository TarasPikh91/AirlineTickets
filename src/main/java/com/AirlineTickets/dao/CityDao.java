package com.AirlineTickets.dao;

import com.AirlineTickets.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Integer> {

}
