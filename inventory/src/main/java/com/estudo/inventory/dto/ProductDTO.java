package com.estudo.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
public class ProductDTO extends AuditableDTO<Long> {
    private String name;
    private String type;
    private String unitType;
    private BigDecimal price;
    private boolean active;
}
