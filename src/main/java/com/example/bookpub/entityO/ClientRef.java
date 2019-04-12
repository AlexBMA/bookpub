package com.example.bookpub.entityO;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "client_ref")
public class ClientRef {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "company_domain")
    private String companyDomain;

    @Column(name = "creation_date")
    private Date date;

    @Column(name = "active")
    private int isActive;

    @Column(name = "domain")
    private String domain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyDomain() {
        return companyDomain;
    }

    public void setCompanyDomain(String companyDomain) {
        this.companyDomain = companyDomain;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
