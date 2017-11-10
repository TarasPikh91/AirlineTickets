package com.AirlineTickets.dao;

import com.AirlineTickets.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlaneDao extends JpaRepository<Plane, Integer> {

    @Query("select p from Plane p left join fetch p.tickets where p.id=:id")
    Plane planeWithTickets(@Param("id")int id);


}


