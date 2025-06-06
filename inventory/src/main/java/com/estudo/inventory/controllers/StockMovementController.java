package com.estudo.inventory.controllers;

import com.estudo.inventory.dto.StockMovementDTO;
import com.estudo.inventory.services.StockMovementService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/stock-movements")
public class StockMovementController extends BaseController<StockMovementDTO, Long> {

    public StockMovementController(StockMovementService service) {
        super(service);
    }
}