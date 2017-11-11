package com.AirlineTickets.serviceImpl;

<<<<<<< HEAD
import com.AirlineTickets.dao.UserDao;
import com.AirlineTickets.entity.User;
import com.AirlineTickets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
=======
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
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
import org.springframework.stereotype.Service;

import java.util.List;

<<<<<<< HEAD
@Service
public class UserServiceImpl implements UserService {
=======
@Service("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService {
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b

    @Autowired
    private UserDao userDao;

<<<<<<< HEAD

    @Override
    public void save(User user) {
=======
    @Autowired
    private TicketDao ticketDao;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public void save(User user) {
        user.setRole(Role.ROLE_USER);
        user.setPassword(encoder.encode(user.getPassword()));
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(int id) {
<<<<<<< HEAD
=======
        User user = userDao.userWithTickets(id);
        for(Ticket ticket : user.getTickets()){
            ticket.setUser(null);
            ticketDao.saveAndFlush(ticket);
        }
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
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
<<<<<<< HEAD
=======

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userDao.findByEmail(s);
    }

    @Override
    public User userWithUuid(String uuid) {
        return userDao.userWithUuid(uuid);
    }
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
}
