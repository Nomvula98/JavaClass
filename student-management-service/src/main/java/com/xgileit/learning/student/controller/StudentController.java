package com.xgileit.learning.student.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentController {
    @GetMapping
    public String studentSelect(){
        return "Get Method";
    }

    @PostMapping
    public String studentAdd(){
        return "Post Method";
    }
    @PutMapping
    public String studentUpdate(String k){
        return "Put Method";
    }
    @DeleteMapping
    public String studentDelete(){
        return "Delete Method";
    }

}
