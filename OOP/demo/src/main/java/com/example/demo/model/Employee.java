package com.example.demo.model;

import com.example.demo.service.EmployeeImpl;
import com.example.demo.service.IEmployeeService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import nonapi.io.github.classgraph.json.Id;

import javax.annotation.Generated;

@Getter
@Setter
@AllArgsConstructor

public class Employee extends EmployeeImpl {
    private String name;
    private String surname;
    private String employeeNo;
    private String id;
    private String department;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeNo='" + employeeNo + '\'' +
                ", id='" + id + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public String doWork(String department) {
        return super.doWork(department);
    }
}
