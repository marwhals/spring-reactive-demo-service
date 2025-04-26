package com.spring_reactive.spring_reactive_demo_service.controllers;

import com.spring_reactive.spring_reactive_demo_service.model.BeerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class BeerController {

    public static final String BEER_URL = "/api/v1/beer";

    @GetMapping(BEER_URL)
    Flux<BeerDTO> listBeers() {
        return Flux.just(BeerDTO.builder().id(1).build(),
                BeerDTO.builder().id(2).build());
    }

}
