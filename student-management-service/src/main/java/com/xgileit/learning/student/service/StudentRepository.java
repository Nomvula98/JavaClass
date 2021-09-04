package com.xgileit.learning.student.service;

import com.xgileit.learning.student.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface StudentRepository {
    ArrayList<Student> arrayList = new ArrayList<Student>();
     ArrayList<Student> addStudent(Student student);
     ArrayList<Student> getAllStudents();
    ArrayList<Student> updateStudent(Student student);
    void deleteStudent(Long id);

    ArrayList<Student> findEmployeeById(Long id);
}
