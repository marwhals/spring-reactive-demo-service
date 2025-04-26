package com.spring_reactive.spring_reactive_demo_service.services;

import com.spring_reactive.spring_reactive_demo_service.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface BeerService {

    Flux<BeerDTO> listBeers();
}
