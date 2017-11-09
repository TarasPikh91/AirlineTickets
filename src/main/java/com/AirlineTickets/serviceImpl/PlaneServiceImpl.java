package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.PlaneDao;
import com.AirlineTickets.entity.Plane;
import com.AirlineTickets.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneServiceImpl implements PlaneService {

    @Autowired
    private PlaneDao planeDao;

    @Override
    public void save(Plane plane) {
        planeDao.save(plane);
    }

    @Override
    public void delete(int id) {
        planeDao.delete(id);
    }

    @Override
    public Plane findOne(int id) {
        return planeDao.findOne(id);
    }

    @Override
    public List<Plane> findAll() {
        return planeDao.findAll();
    }

    @Override
    public void update(Plane plane) {
        planeDao.save(plane);
    }
}
