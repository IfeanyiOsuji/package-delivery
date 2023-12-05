package com.hari.web.packagedelivery.models;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class HistoricalPerformance {

    private String id;
    private int rating;
    private int noOfSuccessfulDeliveries;
    private String reviews;
    @ManyToOne
    private Customer customer;

}
