package com.AirlineTickets.dao;

import com.AirlineTickets.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneDao extends JpaRepository<Plane, Integer> {
}
