package com.example.bookpub.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class Reviewer {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    public Reviewer() {}

}
