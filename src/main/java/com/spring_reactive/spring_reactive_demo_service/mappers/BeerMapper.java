package com.spring_reactive.spring_reactive_demo_service.mappers;

import com.spring_reactive.spring_reactive_demo_service.domain.Beer;
import com.spring_reactive.spring_reactive_demo_service.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
