package com.spring_reactive.spring_reactive_demo_service.repository;

import com.spring_reactive.spring_reactive_demo_service.domain.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> { }
