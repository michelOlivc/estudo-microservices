package com.estudo.organization.controllers;

import com.estudo.organization.dto.DepartmentDTO;
import com.estudo.organization.entities.Department;
import com.estudo.organization.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/departments")
public class DepartmentController extends AbstractController<DepartmentDTO, Long> {

    public DepartmentController(DepartmentService service) {
        super(service);
    }
}
