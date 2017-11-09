package com.AirlineTickets.dao;

import com.AirlineTickets.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDao extends JpaRepository<Company, Integer> {
}
