package com.estudo.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
public class StockMovementDTO {
    private Long id;
    private ProductDTO product;
    private String type;
    private String unitType;
    private Integer quantity;
    private BigDecimal cost;
    private Instant occurredAt;
}
