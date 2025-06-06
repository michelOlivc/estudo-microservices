package com.estudo.organization.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Department extends AuditableEntity<Long> {
    private String name;
    private String description;
}
