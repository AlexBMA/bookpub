package com.example.bookpub.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.Assert;

@Getter
@Setter
public class Isbn {


    private String endPrefix;
    private String registrationGroup;
    private String registrant;
    private String publication;
    private String checkDigit;


    public Isbn(String endPrefix, String registrationGroup, String registrant, String publication, String checkDigit) {
        this.endPrefix = endPrefix;
        this.registrationGroup = registrationGroup;
        this.registrant = registrant;
        this.publication = publication;
        this.checkDigit = checkDigit;
    }


    public static Isbn parseFrom(String isbn) {

        Assert.notNull(isbn);
        String[] parts = isbn.split("-");
        Assert.state(parts.length == 5);
        Assert.noNullElements(parts);
        return new Isbn(parts[0], parts[1], parts[2], parts[3], parts[4]);

    }


    @Override
    public String toString() {
        return endPrefix + "-" + registrationGroup + "-" + registrant + "-" + publication + "-" + checkDigit;
    }
}
