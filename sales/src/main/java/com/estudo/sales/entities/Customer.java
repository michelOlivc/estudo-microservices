package com.estudo.sales.entities;

import com.estudo.sales.entities.enums.CustomerType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Customer extends AuditableEntity<Long> {
    private String name;
    private String registrationNumber;

    @Enumerated(EnumType.STRING)
    private CustomerType type;
}
