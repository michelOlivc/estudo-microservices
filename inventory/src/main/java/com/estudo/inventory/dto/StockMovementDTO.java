package com.estudo.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
public class StockMovementDTO extends BaseDTO<Long> {
    private ProductDTO product;
    private String type;
    private Integer quantity;
    private BigDecimal cost;
    private Instant occurredAt;
}
