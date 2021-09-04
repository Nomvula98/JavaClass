package com.xgileit.learning.student.service;

import com.xgileit.learning.student.model.Student;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class StudentService implements StudentRepository {

    public ArrayList<Student> addStudent(Student student) {

        try {
            StudentRepository.arrayList.add(student);

        } catch (RuntimeException e) {
            System.out.println("Runtime exception, please try again");
        }

        finally {
            return arrayList;
        }
    }

        public ArrayList<Student> getAllStudents () {
            return arrayList;
        }

        public ArrayList<Student> updateStudent (Student student){
            StudentRepository.arrayList.add(student);
            return arrayList;
        }
        public void deleteStudent (Long id){
            StudentRepository.arrayList.remove(id);

        }

        public ArrayList<Student> findEmployeeById (Long id){

            return arrayList;
        }


    }

