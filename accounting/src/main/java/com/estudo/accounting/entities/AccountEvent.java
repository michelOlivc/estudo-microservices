package com.estudo.accounting.entities;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class AccountEvent extends BaseEntity<Long> {
    private String description;
    private Instant occurredAt;
    private String previousState;
    private String currentState;
    private String username;
}
