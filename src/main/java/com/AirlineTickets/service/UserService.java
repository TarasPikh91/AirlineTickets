package com.AirlineTickets.service;

import com.AirlineTickets.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);

    void update(User user);

    void delete(int id);

    List<User> findAll();

    User findOne(int id);

    User userWithUuid(String uuid);
}
