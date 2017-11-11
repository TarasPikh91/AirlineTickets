package com.AirlineTickets.service;

import com.AirlineTickets.entity.Company;

import java.util.List;

public interface CompanyService {

    void save(Company company);

    Company findOne(int id);

    void delete(int id);

    List<Company> findAll();

    void update(Company company);
<<<<<<< HEAD
=======

>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
}
