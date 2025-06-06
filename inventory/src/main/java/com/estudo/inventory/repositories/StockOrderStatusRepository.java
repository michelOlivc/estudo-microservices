package com.estudo.inventory.repositories;

import com.estudo.inventory.entities.StockOrderStatus;
import org.springframework.stereotype.Repository;

@Repository
public interface StockOrderStatusRepository extends BaseRepository<StockOrderStatus, Long> {
}
