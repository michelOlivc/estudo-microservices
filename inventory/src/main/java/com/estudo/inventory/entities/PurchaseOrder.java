package com.estudo.inventory.entities;

import com.estudo.inventory.entities.enums.PurchaseOrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class PurchaseOrder extends AuditableEntity<Long> {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchase_order_id")
    private List<PurchaseOrderItem> items;

    @Enumerated(EnumType.STRING)
    private PurchaseOrderStatus status;
}
