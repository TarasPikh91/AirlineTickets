package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.CompanyDao;
import com.AirlineTickets.dao.PlaneDao;
import com.AirlineTickets.entity.Company;
import com.AirlineTickets.entity.Plane;
import com.AirlineTickets.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private PlaneDao planeDao;


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

        Company company = companyDao.companyWithPlanes(id);
        for(Plane plane : company.getPlanes()){
            plane.setCompany(null);
            planeDao.saveAndFlush(plane);
        }
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
