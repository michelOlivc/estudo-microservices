package com.estudo.inventory.controllers;

import com.estudo.inventory.dto.PurchaseOrderDTO;
import com.estudo.inventory.services.PurchaseOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/purchase-orders")
public class PurchaseOrderController extends BaseController<PurchaseOrderDTO, Long> {

    public PurchaseOrderController(PurchaseOrderService service) {
        super(service);
    }
}