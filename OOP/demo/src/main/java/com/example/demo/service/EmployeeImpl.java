package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeImpl implements IEmployeeService {


    @Override
    public String doWork(String department) {
        return "I am an employee, I work in the "+ department+ " department";
    }

    @Override
    public String supervise() {
    return "I am the Principal, I supervise the school";
    }

    @Override
    public String coordinate() {
        return "I am the Princial, I coordinate things in the school";
    }

    @Override
    public String teach() {
        return "I teach students";
    }

    @Override
    public String train() {
        return "I train students";
    }




}
