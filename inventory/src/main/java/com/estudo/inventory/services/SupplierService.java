package com.estudo.inventory.services;

import com.estudo.inventory.dto.SupplierDTO;
import com.estudo.inventory.entities.Supplier;
import com.estudo.inventory.repositories.SupplierRepository;
import org.springframework.stereotype.Service;

@Service
public class SupplierService extends BaseService<Supplier, SupplierDTO, Long> {

    public SupplierService(SupplierRepository repository) {
        super(repository);
    }
}
