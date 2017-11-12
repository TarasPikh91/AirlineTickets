package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.TicketDao;
import com.AirlineTickets.dao.UserDao;
import com.AirlineTickets.entity.Ticket;
import com.AirlineTickets.entity.User;
import com.AirlineTickets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private TicketDao ticketDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(int id) {
        User user = userDao.userWithTickets(id);
        for(Ticket ticket : user.getTickets()){
            ticket.setUser(null);
            ticketDao.saveAndFlush(ticket);
        }
        userDao.delete(id);
        }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(int id) {
        return userDao.findOne(id);
    }
}
