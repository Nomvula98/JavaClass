package com.xgileit.learning.student.service;

import com.xgileit.learning.student.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository {
    List<Student> studentList = new ArrayList<>();
    List<Student> addStudent(Student student);
    List<Student> getAllStudents();
    List<Student> updateStudent(Student student);
    void deleteStudent(Long id);
}
