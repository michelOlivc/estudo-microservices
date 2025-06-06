package com.estudo.inventory.repositories;

import com.estudo.inventory.entities.StockOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface StockOrderRepository extends BaseRepository<StockOrder, Long> {
}
