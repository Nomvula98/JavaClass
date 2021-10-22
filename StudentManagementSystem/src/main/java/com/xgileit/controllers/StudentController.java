package com.xgileit.controllers;

import com.xgileit.entities.Student;
import com.xgileit.services.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {
StudentService studentService = new StudentService();
List<Student> studentList = new ArrayList<>();
    /**
     * End-point for Submitting student details to be stored in database
     * @param student represents the student details
     * @return a string confirming successful submission or not
    **/
    @PostMapping("/submit")
    public String submitDetails(@RequestBody Student student){
        return studentService.submitStudentDetails(student);
    }

    /**
     * End-point for Retrieving all students details that are stored in database
     * @return a List of students
     **/
    @GetMapping("/retrieveAll")
    public List<Student> retrieveAllStudentsDetails(){
        studentList = studentService.retrieveAllStudents();
        return studentList;
    }

    /**
     * End-point for Updating student details of the corresponding id passed in URL
     * @param studentId identifies the student details to be updated
     * @param student represents the updated student's details to save
     * @return a String confirming successful update
     **/
    @PutMapping("/update/{id}")
    public String updateDetails(@PathVariable Long studentId, @RequestBody Student student){

        return studentService.updateStudentDetails(studentId, student);
    }

    /**
     * End-point for Deleting student details of the corresponding id passed in URL
     * @param studentId identifies the student details to be deleted
     * @return a String confirming successful delete
     **/
    @DeleteMapping("/delete/{id}")
    public String deleteDetails(@PathVariable Long studentId){
        return studentService.deleteStudent(studentId);
    }
}
