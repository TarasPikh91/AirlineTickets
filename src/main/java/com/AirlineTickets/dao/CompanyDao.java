package com.AirlineTickets.dao;

import com.AirlineTickets.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

public interface CompanyDao extends JpaRepository<Company, Integer> {
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CompanyDao extends JpaRepository<Company, Integer> {

    @Query("select c from Company c left join fetch c.planes where c.id=:id")
    Company companyWithPlanes(@Param("id") int id);
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
}
