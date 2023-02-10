package com.a7medelnoor.springbootemployemanagment.controller;

import com.a7medelnoor.springbootemployemanagment.model.Employee;
import com.a7medelnoor.springbootemployemanagment.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    // inject the dependency employee service
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }
    // build create employee Rest API
    @PostMapping("")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
 return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }
}
