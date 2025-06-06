package com.estudo.inventory.repositories;

import com.estudo.inventory.entities.Supplier;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends BaseRepository<Supplier, Long> {
}
