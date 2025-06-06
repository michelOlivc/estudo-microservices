package com.estudo.inventory.repositories;

import com.estudo.inventory.entities.PurchaseOrderItem;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderItemRepository extends BaseRepository<PurchaseOrderItem, Long> {
}
