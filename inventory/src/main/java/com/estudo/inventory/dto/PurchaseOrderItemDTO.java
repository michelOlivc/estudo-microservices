package com.estudo.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class PurchaseOrderItemDTO extends BaseDTO<Long> {
    private ProductDTO product;
    private Integer quantity;
    private BigDecimal unitCost;
}
