package com.estudo.organization.services;

import com.estudo.organization.entities.Department;
import com.estudo.organization.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService extends AbstractService<Department, Long> {

    public DepartmentService(DepartmentRepository repository) {
        super(repository);
    }
}
