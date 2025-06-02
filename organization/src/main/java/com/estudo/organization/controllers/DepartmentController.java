package com.estudo.organization.controllers;

import com.estudo.organization.entities.Department;
import com.estudo.organization.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DepartmentController extends AbstractController<Department, Long> {

    public DepartmentController(DepartmentService service) {
        super(service);
    }
}
