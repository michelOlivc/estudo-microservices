package com.estudo.inventory.controllers;

import com.estudo.inventory.dto.ProductDTO;
import com.estudo.inventory.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/products")
public class ProductController extends BaseController<ProductDTO, Long> {

    public ProductController(ProductService service) {
        super(service);
    }
}