package com.estudo.sales.controllers;

import com.estudo.sales.dto.SaleDTO;
import com.estudo.sales.services.SaleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/sales")
public class SaleController extends BaseController<SaleDTO, Long> {

    public SaleController(SaleService service) {
        super(service);
    }
}
