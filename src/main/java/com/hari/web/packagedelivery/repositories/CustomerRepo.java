package com.hari.web.packagedelivery.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.web.packagedelivery.models.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String>{
    
}
