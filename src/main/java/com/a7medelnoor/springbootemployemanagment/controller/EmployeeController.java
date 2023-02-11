package com.a7medelnoor.springbootemployemanagment.controller;

import com.a7medelnoor.springbootemployemanagment.model.Employee;
import com.a7medelnoor.springbootemployemanagment.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    // inject the dependency employee service
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    // build create employee Rest API
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    // build get all employees REST API
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // build get employee by id REST API
    // http://localhost:8080/api/employees/id
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long employeeId) {
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
    }

    // build update employee REST API
    // http://localhost:8080/api/employees/id
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long employeeId, @RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, employeeId), HttpStatus.OK);
    }

    // build delete employee by id REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long id) {
        // delete employee from database
        employeeService.deleteEmployee(id);
        return new ResponseEntity<String>("Employee Deleted successfully!", HttpStatus.OK);
    }

}
