package com.estudo.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private String type;
    private BigDecimal price;
    private boolean active;
}
