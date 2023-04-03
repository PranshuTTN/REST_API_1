package com.Rest_Api_1.mar_29_Rest_Api.entities;

public class Employee {
    private int empId,empAge;
    private String empName;

    public Employee(int empId,String empName,int empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }

    public int getEmpId() {
        return empId;
    }

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpName() {
        return empName;
    }
}
