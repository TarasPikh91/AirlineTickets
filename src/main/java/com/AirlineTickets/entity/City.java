package com.AirlineTickets.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by ooo on 10/29/2017.
 */

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

<<<<<<< HEAD
    @ManyToOne
    private Country country;

    @OneToMany(mappedBy = "city")
    private List<Ticket> tickets = new ArrayList<Ticket>();


    public City() {
=======
    City() {
>>>>>>> origin/prince

    }



    public City(String name) {

        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

=======
>>>>>>> origin/prince
    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
