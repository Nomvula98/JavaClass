package com.xgileit.learning.student.controller;

import com.xgileit.learning.student.model.Student;
import com.xgileit.learning.student.service.StudentRepository;
import com.xgileit.learning.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a controller for Creating, Reading, Updating and Deleting a student
 */
@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentController {

    StudentRepository studentRepository;

    /**
     * End-point for adding a student to the list
     *
     * @param student which represents a Student
     * @return a list of students
     */
    @PostMapping("/add")
    public List<Student> addStudent(@RequestBody Student student) {
        List<Student> studentList = studentRepository.addStudent(student);
        return studentList;
    }

    /**
     * End-point for retrieving all students from the list
     *
     * @return a list of students
     */
    @GetMapping("/all")
   public List<Student> getAllStudents(){
        List<Student> studentList = studentRepository.getAllStudents();
        return studentList;
    }

    /**
     * End-point for updating a students in the list
     *
     * @param student which represents a Student
     * @return a list of students
     */
    @PutMapping("/update")
    public List<Student> updateStudent(@RequestBody Student student){
        List<Student> studentList = studentRepository.updateStudent(student);
        return studentList;
    }

    /**
     * End-point for deleting a students from the list
     *
     * @pathVariable id which represents a Student id
     */
    @DeleteMapping("/delete/{id}")
    public void studentDelete(@PathVariable("id") Long id){
        studentRepository.deleteStudent(id);
    }


}








