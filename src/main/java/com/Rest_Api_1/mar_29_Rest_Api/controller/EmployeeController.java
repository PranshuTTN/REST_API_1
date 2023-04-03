package com.Rest_Api_1.mar_29_Rest_Api.controller;

import com.Rest_Api_1.mar_29_Rest_Api.service.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    @GetMapping("/welcome")
    public String greetings(){
        return "Welcome to spring boot";
    }
}
