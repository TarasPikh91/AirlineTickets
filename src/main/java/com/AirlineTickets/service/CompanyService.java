package com.AirlineTickets.service;

import com.AirlineTickets.entity.Company;

import java.util.List;

public interface CompanyService {

    void save(Company company);

    Company findOne(int id);

    void delete(int id);

    List<Company> findAll();

    void update(Company company);

}
