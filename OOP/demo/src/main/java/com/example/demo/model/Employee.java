package com.example.demo.model;


import com.example.demo.service.IEmployeeService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import nonapi.io.github.classgraph.json.Id;

import javax.annotation.Generated;

@Getter
@Setter
@AllArgsConstructor

//Employee implements EmployeeImpl

//Encapsulation - wrapping data into a single unit and protecting the data by restricting direct access from other classes
//The properties of the class are private and external classes can only access the through getters and setters
public class Employee implements IEmployeeService {
    private String name;
    private String surname;
    private String employeeNo;
    private String id;
    private String department;


    
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeNo='" + employeeNo + '\'' +
                ", id='" + id + '\'' +
                ", department='" + department + '\'' +
                '}';
    }


    public String doWork(String department) {
        return "I am an employee, I work in the "+ department+ " department";
    }


    public String supervise() {
        return "I am the Principal, I supervise the school";
    }


    public String coordinate() {
        return "I am the Princial, I coordinate things in the school";
    }


    public String teach() {
        return "I teach students";
    }


    public String train() {
        return "I train students";
    }

}
