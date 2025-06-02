package com.estudo.organization.repositories;

import com.estudo.organization.entities.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends AbstractRepository<Department, Long> {
}
