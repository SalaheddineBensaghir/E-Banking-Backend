package com.sid.ebankingbackend.repositories;

import com.sid.ebankingbackend.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
