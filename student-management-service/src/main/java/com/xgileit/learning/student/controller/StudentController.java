package com.xgileit.learning.student.controller;

import com.xgileit.learning.student.model.Student;
import com.xgileit.learning.student.service.StudentRepository;
import com.xgileit.learning.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/student")

public class StudentController {


    StudentRepository studentRepository;
    //Adding a student Object to the ArrayList
    @PostMapping("/add")
    public List<Student> addStudent(@RequestBody Student student) {
        List<Student> studentList = studentRepository.addStudent(student);
        return studentList;

    }

    @GetMapping("/all")
   public List<Student> getAllStudents(){
        List<Student> studentList = studentRepository.getAllStudents();
        return studentList;
    }

    @PutMapping("/update")
    public List<Student> updateStudent(@RequestBody Student student){
        List<Student> studentList = studentRepository.updateStudent(student);
        return studentList;
    }

    @DeleteMapping("/delete/{id}")
    public void studentDelete(@PathVariable("id") Long id){
        studentRepository.deleteStudent(id);
    }

@GetMapping("/find/{id}")
    public List<Student> findEmployeeById(@PathVariable("id") Long id) {
        return studentRepository.findEmployeeById(id);
    }
}








