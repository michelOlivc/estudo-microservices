package com.estudo.inventory.controllers;

import com.estudo.inventory.dto.SupplierDTO;
import com.estudo.inventory.services.SupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/suppliers")
public class SupplierController extends BaseController<SupplierDTO, Long> {

    public SupplierController(SupplierService service) {
        super(service);
    }
}