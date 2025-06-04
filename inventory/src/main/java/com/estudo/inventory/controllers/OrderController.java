package com.estudo.inventory.controllers;

import com.estudo.inventory.dto.OrderDTO;
import com.estudo.inventory.services.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/orders")
public class OrderController extends AbstractController<OrderDTO, Long> {

    public OrderController(OrderService service) {
        super(service);
    }
}
