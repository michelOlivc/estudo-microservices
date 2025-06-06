package com.estudo.inventory.entities;

import com.estudo.inventory.entities.enums.ProductType;
import com.estudo.inventory.entities.enums.UnitType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product extends AuditableEntity<Long> {
    @Column(unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    private ProductType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Enumerated(EnumType.STRING)
    private UnitType unitType;

    private BigDecimal price;
    private boolean active;
}
