package com.AirlineTickets.service;

import com.AirlineTickets.entity.Plane;

import java.util.List;

public interface PlaneService {

    void save(Plane plane, int companyId);

    void delete(int id);

    Plane findOne(int id);

    List<Plane> findAll();

    void update(Plane plane, int companyId);
}
