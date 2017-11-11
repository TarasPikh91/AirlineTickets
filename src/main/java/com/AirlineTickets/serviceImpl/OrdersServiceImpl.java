package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.OrdersDao;
import com.AirlineTickets.entity.Orders;
import com.AirlineTickets.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    @Override
    public void save(Orders orders) {
        ordersDao.save(orders);
    }

    @Override
    public void update(Orders orders) {
        ordersDao.save(orders);
    }

    @Override
    public Orders findOne(int id) {
        return ordersDao.findOne(id);
    }

    @Override
    public List<Orders> findAll() {
        return ordersDao.findAll();
    }

    @Override
    public void delete(int id) {
        ordersDao.delete(id);
    }
}
