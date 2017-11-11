package com.AirlineTickets.service;

import com.AirlineTickets.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);

    void update(User user);

    void delete(int id);

    List<User> findAll();

    User findOne(int id);
<<<<<<< HEAD
=======

    User userWithUuid(String uuid);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
}
