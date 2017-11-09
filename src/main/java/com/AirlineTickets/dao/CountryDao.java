package com.AirlineTickets.dao;

import com.AirlineTickets.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryDao extends JpaRepository<Country, Integer> {
}
