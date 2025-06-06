package com.estudo.inventory.dto;

import com.estudo.inventory.entities.enums.PurchaseOrderStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class PurchaseOrderDTO extends AuditableDTO<Long> {
    private SupplierDTO supplier;
    private List<PurchaseOrderItemDTO> items;
    private PurchaseOrderStatus status;
}
