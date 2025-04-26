package com.spring_reactive.spring_reactive_demo_service.mappers;

import com.spring_reactive.spring_reactive_demo_service.domain.Customer;
import com.spring_reactive.spring_reactive_demo_service.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
