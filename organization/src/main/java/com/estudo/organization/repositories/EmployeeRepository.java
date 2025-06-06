package com.estudo.organization.repositories;

import com.estudo.organization.entities.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends BaseRepository<Employee, Long> {
}
