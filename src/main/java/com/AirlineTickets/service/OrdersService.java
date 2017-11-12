package com.AirlineTickets.service;

import com.AirlineTickets.entity.Orders;

import java.util.List;

public interface OrdersService {

    void save(Orders orders);

    void update(Orders orders);

    Orders findOne(int id);

    List<Orders> findAll();

    void delete(int id);

}
