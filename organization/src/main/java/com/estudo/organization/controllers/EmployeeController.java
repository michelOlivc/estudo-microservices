package com.estudo.organization.controllers;

import com.estudo.organization.dto.EmployeeDTO;
import com.estudo.organization.entities.Employee;
import com.estudo.organization.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/employees")
public class EmployeeController extends AbstractController<EmployeeDTO, Long> {

    public EmployeeController(EmployeeService service) {
        super(service);
    }
}
