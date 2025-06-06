package com.estudo.accounting.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
public class AccountEventDTO {
    private String description;
    private Instant occurredAt;
    private String previousState;
    private String currentState;
    private String username;
}
