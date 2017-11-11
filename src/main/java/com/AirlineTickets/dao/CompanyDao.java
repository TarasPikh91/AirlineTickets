package com.AirlineTickets.dao;

import com.AirlineTickets.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CompanyDao extends JpaRepository<Company, Integer> {

    @Query("select c from Company c left join fetch c.planes where c.id=:id")
    Company companyWithPlanes(@Param("id") int id);
}
