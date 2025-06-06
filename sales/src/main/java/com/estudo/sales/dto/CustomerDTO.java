package com.estudo.sales.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CustomerDTO extends AuditableDTO<Long> {
    private String name;
    private String registrationNumber;
    private String type;
}
