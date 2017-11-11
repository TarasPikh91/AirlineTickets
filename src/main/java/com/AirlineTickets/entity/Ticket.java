package com.AirlineTickets.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ooo on 10/29/2017.
 */
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numberTicket; //Number on Ticket(numeration)
    private int numberSeat;   // Number of seat
    private int price;
    private String currency;


    public Ticket(){

    }

    public Ticket(int numberTicket, int numberSeat, int price, String currency) {
        this.numberTicket = numberTicket;
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

    public int getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
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

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", numberTicket=" + numberTicket +
                ", numberSeat=" + numberSeat +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                '}';
    }
}
