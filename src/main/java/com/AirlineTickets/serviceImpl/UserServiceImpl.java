package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.TicketDao;
import com.AirlineTickets.dao.UserDao;
import com.AirlineTickets.entity.Role;
import com.AirlineTickets.entity.Ticket;
import com.AirlineTickets.entity.User;
import com.AirlineTickets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private TicketDao ticketDao;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public void save(User user) {
        user.setRole(Role.ROLE_USER);
        user.setPassword(encoder.encode(user.getPassword()));
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

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userDao.findByEmail(s);
    }

    @Override
    public User userWithUuid(String uuid) {
        return userDao.userWithUuid(uuid);
    }
}
