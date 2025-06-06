package com.estudo.sales.controllers;

import com.estudo.sales.dto.CustomerDTO;
import com.estudo.sales.services.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/customers")
public class CustomerController extends BaseController<CustomerDTO, Long> {

    public CustomerController(CustomerService service) {
        super(service);
    }
}
