package com.estudo.organization.services;

import com.estudo.organization.dto.EmployeeDTO;
import com.estudo.organization.entities.Employee;
import com.estudo.organization.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends AbstractService<Employee, EmployeeDTO, Long> {

    public EmployeeService(EmployeeRepository repository) {
        super(repository);
    }
}
