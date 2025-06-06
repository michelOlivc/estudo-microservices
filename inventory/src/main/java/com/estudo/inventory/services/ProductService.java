package com.estudo.inventory.services;

import com.estudo.inventory.dto.ProductDTO;
import com.estudo.inventory.entities.Product;
import com.estudo.inventory.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseService<Product, ProductDTO, Long> {

    public ProductService(ProductRepository repository) {
        super(repository);
    }
}
