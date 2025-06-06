package com.estudo.inventory.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Supplier extends AuditableEntity<Long> {
    private String name;
    private String registrationNumber;
}
