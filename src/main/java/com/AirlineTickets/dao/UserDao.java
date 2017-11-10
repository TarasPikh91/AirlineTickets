package com.AirlineTickets.dao;

import com.AirlineTickets.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Integer> {

    @Query("select u from User u left join fetch u.tickets where u.id=:id")
    User userWithTickets(@Param("id")int id);
}
