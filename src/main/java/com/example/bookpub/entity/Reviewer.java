package com.example.bookpub.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Reviewer {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    public Reviewer() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}