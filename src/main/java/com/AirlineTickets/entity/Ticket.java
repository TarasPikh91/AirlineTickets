package com.AirlineTickets.entity;

import javax.persistence.*;

/**
 * Created by ooo on 10/29/2017.
 */
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numberSeat;   // Number of seat
    private int price;
    private String currency;

<<<<<<< HEAD
    @OneToOne(mappedBy = "ticket")
=======
    @ManyToOne
>>>>>>> 3e3845585f680f611c0680dfe22e19481498ed4b
    private City city;

    @OneToOne(mappedBy = "ticket")
    private Country country;

    @ManyToOne
    private User user;
    @ManyToOne
    private Plane plane;

    public Ticket(){

    }

    public Ticket( int numberSeat, int price, String currency) {

        this.numberSeat = numberSeat;
        this.price = price;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", numberSeat=" + numberSeat +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                '}';
    }
}
