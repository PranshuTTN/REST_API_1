package com.Rest_Api_1.mar_29_Rest_Api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/welcome")
    public String greetings(){
        return "Welcome to spring boot";
    }
}
