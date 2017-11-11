package com.AirlineTickets.entity;

import javax.persistence.*;
<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b


/**
 * Created by ooo on 10/29/2017.
 */

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    private Country country;

<<<<<<< HEAD
    @OneToOne
    private Ticket ticket;
=======
    @OneToMany(mappedBy = "city")
    private List<Ticket> tickets = new ArrayList<Ticket>();
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b


    public City() {

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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

<<<<<<< HEAD
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
=======
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
