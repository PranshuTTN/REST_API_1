package com.Rest_Api_1.mar_29_Rest_Api.controller;

import com.Rest_Api_1.mar_29_Rest_Api.entities.Employee;
import com.Rest_Api_1.mar_29_Rest_Api.exception.EmployeeNotFoundException;
import com.Rest_Api_1.mar_29_Rest_Api.service.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    @GetMapping("/welcome")
    public String greetings(){
        return "Welcome to spring boot";
    }
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        Employee employee = employeeDao.getEmployeeById(id);
        if (employee==null){
            throw new EmployeeNotFoundException("ID: "+id );
        }
        return employee;
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employeeDao.addEmployee(employee);
        return employee;
    }
}
