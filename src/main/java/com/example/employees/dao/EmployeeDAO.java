package com.example.employees.dao;

import com.example.employees.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDAO extends CrudRepository<Employee, Long> {
}
