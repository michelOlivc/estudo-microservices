package com.estudo.inventory.repositories;

import com.estudo.inventory.entities.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends AbstractRepository<Order, Long> {
}
