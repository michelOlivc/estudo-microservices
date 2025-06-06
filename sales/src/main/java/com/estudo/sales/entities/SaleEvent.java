package com.estudo.sales.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class SaleEvent extends BaseEntity<Long> {
    private Instant occurredAt;
    private String description;
    private Long recordId;
    private String path;
    private String username;
}
