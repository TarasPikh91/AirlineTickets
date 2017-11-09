package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.CompanyDao;
import com.AirlineTickets.entity.Company;
import com.AirlineTickets.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;


    @Override
    public void save(Company company) {
        companyDao.save(company);
    }

    @Override
    public Company findOne(int id) {
        return companyDao.findOne(id);
    }

    @Override
    public void delete(int id) {
        companyDao.delete(id);
    }

    @Override
    public List<Company> findAll() {
        return companyDao.findAll();
    }

    @Override
    public void update(Company company) {
        companyDao.save(company);
    }
}
