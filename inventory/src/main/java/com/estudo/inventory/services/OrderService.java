package com.estudo.inventory.services;

import com.estudo.inventory.dto.OrderDTO;
import com.estudo.inventory.entities.Order;
import com.estudo.inventory.repositories.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends AbstractService<Order, OrderDTO, Long> {

    public OrderService(OrderRepository repository) {
        super(repository);
    }
}
