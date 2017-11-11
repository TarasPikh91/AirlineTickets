package com.AirlineTickets.dao;

import com.AirlineTickets.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersDao extends JpaRepository<Orders, Integer> {
}
