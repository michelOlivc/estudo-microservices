package com.estudo.inventory.services;

import com.estudo.inventory.dto.StockMovementDTO;
import com.estudo.inventory.entities.StockMovement;
import com.estudo.inventory.repositories.StockMovementRepository;
import org.springframework.stereotype.Service;

@Service
public class StockMovementService extends BaseService<StockMovement, StockMovementDTO, Long> {

    public StockMovementService(StockMovementRepository repository) {
        super(repository);
    }
}
