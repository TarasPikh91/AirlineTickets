package com.AirlineTickets.service;

import com.AirlineTickets.entity.Plane;

import java.util.List;

public interface PlaneService {

<<<<<<< HEAD
    void save(Plane plane);
=======
    void save(Plane plane, int companyId);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b

    void delete(int id);

    Plane findOne(int id);

    List<Plane> findAll();

<<<<<<< HEAD
    void update(Plane plane);
=======
    void update(Plane plane, int companyId);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
}
