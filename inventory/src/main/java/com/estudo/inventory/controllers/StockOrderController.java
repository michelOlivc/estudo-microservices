package com.estudo.inventory.controllers;

import com.estudo.inventory.dto.StockOrderDTO;
import com.estudo.inventory.services.StockOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/stock-orders")
public class StockOrderController extends BaseController<StockOrderDTO, Long> {

    public StockOrderController(StockOrderService service) {
        super(service);
    }
}
