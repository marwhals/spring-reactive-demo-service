package com.spring_reactive.spring_reactive_demo_service.controllers;

import com.spring_reactive.spring_reactive_demo_service.model.BeerDTO;
import com.spring_reactive.spring_reactive_demo_service.services.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class BeerController {

    public static final String BEER_URL = "/api/v1/beer";

    private final BeerService beerService;

    @GetMapping(BEER_URL)
    Flux<BeerDTO> listBeers() {
        return beerService.listBeers();
    }

}
