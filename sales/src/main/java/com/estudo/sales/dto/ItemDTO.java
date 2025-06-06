package com.estudo.sales.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class ItemDTO extends BaseDTO<Long> {
    private Long productId;
    private Integer quantity;
    private BigDecimal unitPrice;
}
