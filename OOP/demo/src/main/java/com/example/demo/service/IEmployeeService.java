package com.example.demo.service;

import com.example.demo.model.Employee;

//All the behaviors of all employees are defined
//This class is abstract
public interface IEmployeeService {
     String doWork(String department);
     String supervise();
     String coordinate();
     String teach();
     String train();


}
