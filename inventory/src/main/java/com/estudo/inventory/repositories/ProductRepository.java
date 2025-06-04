package com.estudo.inventory.repositories;

import com.estudo.inventory.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends AbstractRepository<Product, Long> {
}
