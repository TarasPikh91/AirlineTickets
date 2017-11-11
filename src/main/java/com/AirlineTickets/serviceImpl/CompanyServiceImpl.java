package com.AirlineTickets.serviceImpl;

import com.AirlineTickets.dao.CompanyDao;
<<<<<<< HEAD
import com.AirlineTickets.entity.Company;
=======
import com.AirlineTickets.dao.PlaneDao;
import com.AirlineTickets.entity.Company;
import com.AirlineTickets.entity.Plane;
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
import com.AirlineTickets.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

<<<<<<< HEAD
=======
    @Autowired
    private PlaneDao planeDao;

>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b

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
<<<<<<< HEAD
        companyDao.delete(id);
=======

        Company company = companyDao.companyWithPlanes(id);
        for(Plane plane : company.getPlanes()){
            plane.setCompany(null);
            planeDao.saveAndFlush(plane);
        }
         companyDao.delete(id);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
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
