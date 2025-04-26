package com.spring_reactive.spring_reactive_demo_service.repository;

import com.spring_reactive.spring_reactive_demo_service.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BeerRepository extends ReactiveCrudRepository<Beer, Integer> {


}
