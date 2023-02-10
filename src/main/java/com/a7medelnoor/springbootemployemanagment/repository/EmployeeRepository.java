package com.a7medelnoor.springbootemployemanagment.repository;

import com.a7medelnoor.springbootemployemanagment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
