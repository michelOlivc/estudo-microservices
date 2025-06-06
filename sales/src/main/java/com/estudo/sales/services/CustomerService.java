package com.estudo.sales.services;

import com.estudo.sales.dto.CustomerDTO;
import com.estudo.sales.entities.Customer;
import com.estudo.sales.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseService<Customer, CustomerDTO, Long> {

    public CustomerService(CustomerRepository repository) {
        super(repository);
    }
}
