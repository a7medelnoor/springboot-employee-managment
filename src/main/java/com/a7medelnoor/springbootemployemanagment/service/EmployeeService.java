package com.a7medelnoor.springbootemployemanagment.service;

import com.a7medelnoor.springbootemployemanagment.model.Employee;

import java.util.List;

public interface EmployeeService {
Employee saveEmployee(Employee employee);
List<Employee> getAllEmployees();

Employee getEmployeeById(Long id);

Employee updateEmployee(Employee employee, Long id);

void deleteEmployee(Long employeeId);
}
