package com.estudo.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class StockOrderDTO extends BaseDTO<Long> {
    private ProductDTO product;
    private StockOrderStatusDTO status;
    private Long saleId;
    private Integer quantity;
}
