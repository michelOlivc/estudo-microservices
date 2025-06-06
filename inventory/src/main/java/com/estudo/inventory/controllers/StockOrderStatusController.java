package com.estudo.inventory.controllers;

import com.estudo.inventory.dto.StockOrderStatusDTO;
import com.estudo.inventory.services.StockOrderStatusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/stock-order-status")
public class StockOrderStatusController extends BaseController<StockOrderStatusDTO, Long> {

    public StockOrderStatusController(StockOrderStatusService service) {
        super(service);
    }

    @Override
    public ResponseEntity<StockOrderStatusDTO> save(StockOrderStatusDTO entity) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}