package com.AirlineTickets.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ooo on 10/30/2017.
 */
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime date;


    @ManyToOne
    private User user;



    public Orders() {
    }

    public Orders(LocalDateTime date) {
        this.date = date;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", date=" + date +
                ", user=" + user +
                '}';
    }
}

