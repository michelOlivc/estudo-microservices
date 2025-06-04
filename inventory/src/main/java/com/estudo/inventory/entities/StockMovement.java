package com.estudo.inventory.entities;

import com.estudo.inventory.entities.enums.StockMovementType;
import com.estudo.inventory.entities.enums.UnitType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class StockMovement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Enumerated(EnumType.STRING)
    private StockMovementType type;

    @Enumerated(EnumType.STRING)
    private UnitType unitType;

    private Integer quantity;
    private BigDecimal cost;
    private Instant occurredAt;
}
