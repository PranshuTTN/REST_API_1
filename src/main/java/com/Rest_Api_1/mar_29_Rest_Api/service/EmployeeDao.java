package com.Rest_Api_1.mar_29_Rest_Api.service;

import com.Rest_Api_1.mar_29_Rest_Api.entities.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class EmployeeDao {
    private static List<Employee> empList = new ArrayList<>();
    static {
        empList.add(new Employee(1,"Pranshu",21));
        empList.add(new Employee(2,"Jai",26));
        empList.add(new Employee(3,"Madhav",32));
    }
    public List<Employee> getAllEmployees(){
        return empList;
    }
    public Employee getEmployeeById(int id){
        Employee employee = null;
        for (Employee e:empList){
            if (e.getEmpId()==id){
                employee=e;
            }
        }
        return employee;
    }
    public Employee addEmployee(Employee employee){
        empList.add(employee);
        return employee;
    }
    public void deleteById(int id){
        Predicate<? super Employee> predicate = employee -> employee.getEmpId()==id;
        empList.removeIf(predicate);
    }
}
