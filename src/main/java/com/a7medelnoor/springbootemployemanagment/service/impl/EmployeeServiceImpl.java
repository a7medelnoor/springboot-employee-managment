package com.a7medelnoor.springbootemployemanagment.service.impl;

import com.a7medelnoor.springbootemployemanagment.exception.ResourceNotFoundException;
import com.a7medelnoor.springbootemployemanagment.model.Employee;
import com.a7medelnoor.springbootemployemanagment.repository.EmployeeRepository;
import com.a7medelnoor.springbootemployemanagment.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            return  employee.get();
        }else {
            throw new ResourceNotFoundException("Employee","Id",id);
        }
    }

    @Override
    public Employee updateEmployee(Employee employee, Long id) {
        // check if the employee is existing in the database or not
        Employee exisitingEmployee = employeeRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("Employee","Id",id)
        );
        // update the existing employee
        exisitingEmployee.setFirstName(employee.getFirstName());
        exisitingEmployee.setLastName(employee.getLastName());
        exisitingEmployee.setEmail(employee.getEmail());

        // save the existing employee to the database
        employeeRepository.save(exisitingEmployee);
        return  exisitingEmployee;
    }
}
