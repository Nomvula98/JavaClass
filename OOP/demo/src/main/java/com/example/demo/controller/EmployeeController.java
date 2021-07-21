package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.Principal;
import com.example.demo.model.Teacher;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    Teacher teacher1 = new Teacher("Lizzy", "George", "1234",
            "123456789", "Teaching");
    Principal principal = new Principal("Grace", "Smith", "4321",
            "987654321", "Management");

        @GetMapping("/employee1")
        public String printEmpDetails(){
            return teacher1.toString();
        }

    @GetMapping("/principal")
    public String printPrincipalDetails(){

        return principal.toString();
    }


}
