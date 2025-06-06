package com.estudo.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class StockOrderStatusDTO extends BaseDTO<Long> {
    private String name;
    private String description;
}
