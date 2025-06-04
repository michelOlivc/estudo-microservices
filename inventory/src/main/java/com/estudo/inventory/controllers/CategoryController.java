package com.estudo.inventory.controllers;

import com.estudo.inventory.dto.CategoryDTO;
import com.estudo.inventory.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/categories")
public class CategoryController extends AbstractController<CategoryDTO, Long> {

    public CategoryController(CategoryService service) {
        super(service);
    }
}
