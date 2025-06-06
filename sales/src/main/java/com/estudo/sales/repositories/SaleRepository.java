package com.estudo.sales.repositories;

import com.estudo.sales.entities.Sale;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends BaseRepository<Sale, Long> {
}
