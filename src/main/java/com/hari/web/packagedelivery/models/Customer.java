package com.hari.web.packagedelivery.models;


import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.hari.web.packagedelivery.enums.CustomerType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String othernames;
    private String ssNumber;
    private String email;
    private String mobileNumber;
    private MeansOfIdentification meansOfIdentification;
    private String photo;
    @OneToMany
    private List<HistoricalPerformance> historicalPerformance;
    @OneToMany
    private List<CustomerAddress> address;
    private TermsOfservice termsOfservice;
    private Date registrationDate;
    private CustomerType customerType;

    public Customer(){
        id = UUID.randomUUID().toString().substring(25);
    }

    
}
