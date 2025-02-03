package com.example.employees.service;

import com.example.employees.dao.EmployeeDAO;
import com.example.employees.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    public Iterable<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeDAO.findById(id).orElse(null);
    }

    public void saveEmployee(Employee employee) {
        employeeDAO.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeDAO.deleteById(id);
    }
}
