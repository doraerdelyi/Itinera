package com.codecool.itinera;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Traveller {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<Trip> trips;

    public Traveller() {}
    public Traveller(String firstName, String lastName, String email) {}


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
