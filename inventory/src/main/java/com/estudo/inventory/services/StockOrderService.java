package com.estudo.inventory.services;

import com.estudo.inventory.dto.StockOrderDTO;
import com.estudo.inventory.entities.StockOrder;
import com.estudo.inventory.repositories.StockOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class StockOrderService extends BaseService<StockOrder, StockOrderDTO, Long> {

    public StockOrderService(StockOrderRepository repository) {
        super(repository);
    }
}
