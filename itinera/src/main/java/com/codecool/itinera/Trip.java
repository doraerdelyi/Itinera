package com.codecool.itinera;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Trip {
    @Id
    private Long id;
    private String publicId;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Activity> activities;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
