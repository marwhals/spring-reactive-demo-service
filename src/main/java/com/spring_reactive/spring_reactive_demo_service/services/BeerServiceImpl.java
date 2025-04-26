package com.spring_reactive.spring_reactive_demo_service.services;

import com.spring_reactive.spring_reactive_demo_service.mappers.BeerMapper;
import com.spring_reactive.spring_reactive_demo_service.model.BeerDTO;
import com.spring_reactive.spring_reactive_demo_service.repository.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public Flux<BeerDTO> listBeers() {
        return beerRepository.findAll().map(beerMapper::beerToBeerDto);
    }

}
