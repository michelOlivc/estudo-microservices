package com.estudo.sales.repositories;

import com.estudo.sales.entities.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends BaseRepository<Customer, Long> {
}
