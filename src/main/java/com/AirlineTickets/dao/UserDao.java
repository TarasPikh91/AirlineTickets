package com.AirlineTickets.dao;

import com.AirlineTickets.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
