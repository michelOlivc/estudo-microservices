package com.estudo.inventory.services;

import com.estudo.inventory.dto.StockOrderStatusDTO;
import com.estudo.inventory.entities.StockOrderStatus;
import com.estudo.inventory.repositories.StockOrderStatusRepository;
import org.springframework.stereotype.Service;

@Service
public class StockOrderStatusService extends BaseService<StockOrderStatus, StockOrderStatusDTO, Long> {

    public StockOrderStatusService(StockOrderStatusRepository repository) {
        super(repository);
    }
}
