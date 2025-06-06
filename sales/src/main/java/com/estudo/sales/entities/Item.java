package com.estudo.sales.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Item extends BaseEntity<Long> {
    private Long productId;
    private Integer quantity;
    private BigDecimal unitPrice;
}
