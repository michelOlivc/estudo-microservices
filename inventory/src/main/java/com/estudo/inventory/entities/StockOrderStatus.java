package com.estudo.inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class StockOrderStatus extends BaseEntity<Long> {
    private String name;
    private String description;
    private Long previousStatusId;
    private Long nextStatusId;
}
