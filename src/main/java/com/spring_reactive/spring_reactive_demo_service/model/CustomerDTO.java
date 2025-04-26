package com.spring_reactive.spring_reactive_demo_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTO {

    private Integer id;

    @NotBlank(message = "Customer name is required")
    private String customerName;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

}
