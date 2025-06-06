package com.estudo.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
public abstract class AuditableDTO<ID> extends BaseDTO<ID> {
    private Instant lastModifiedAt;
}
