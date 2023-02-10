package com.a7medelnoor.springbootemployemanagment.service.impl;

import com.a7medelnoor.springbootemployemanagment.model.Employee;
import com.a7medelnoor.springbootemployemanagment.repository.EmployeeRepository;
import com.a7medelnoor.springbootemployemanagment.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    // constructor based dependency injection

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        // save employee into the database
        return employeeRepository.save(employee);
    }
}
