package com.estudo.sales.services;

import com.estudo.sales.dto.SaleDTO;
import com.estudo.sales.entities.Sale;
import com.estudo.sales.repositories.SaleRepository;
import org.springframework.stereotype.Service;

@Service
public class SaleService extends BaseService<Sale, SaleDTO, Long> {

    public SaleService(SaleRepository repository) {
        super(repository);
    }
}
