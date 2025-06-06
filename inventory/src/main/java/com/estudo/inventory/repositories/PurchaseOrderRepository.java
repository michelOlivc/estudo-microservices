package com.estudo.inventory.repositories;

import com.estudo.inventory.entities.PurchaseOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderRepository extends BaseRepository<PurchaseOrder, Long> {
}
