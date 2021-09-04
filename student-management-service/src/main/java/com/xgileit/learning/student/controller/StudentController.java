package com.xgileit.learning.student.controller;

import com.xgileit.learning.student.model.Student;
import com.xgileit.learning.student.service.StudentRepository;
import com.xgileit.learning.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/api/v1/student")

public class StudentController {

    StudentService studentService = new StudentService();

    StudentRepository studentRepository;
    //Adding a student Object to the ArrayList
    @PostMapping("/add")
    public ArrayList<Student> addStudent(@RequestBody Student student) {
        ArrayList studentList = studentService.addStudent(student);
        return studentList;

    }

    @GetMapping("/all")
   public ArrayList<Student> getAllStudents(){
        ArrayList studentList = studentService.getAllStudents();
        return studentList;
    }

    @PutMapping("/update")
    public ArrayList<Student> updateStudent(@RequestBody Student student){
        ArrayList studentList = studentService.updateStudent(student);
        return studentList;
    }

    @DeleteMapping("/delete/{id}")
    public void studentDelete(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }

@GetMapping("/find/{id}")
    public ArrayList<Student> findEmployeeById(@PathVariable("id") Long id) {
        return studentRepository.findEmployeeById(id);
    }
}








