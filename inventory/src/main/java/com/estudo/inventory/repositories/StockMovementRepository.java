package com.estudo.inventory.repositories;

import com.estudo.inventory.entities.StockMovement;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMovementRepository extends AbstractRepository<StockMovement, Long> {
}
