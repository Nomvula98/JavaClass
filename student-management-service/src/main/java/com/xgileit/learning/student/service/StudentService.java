package com.xgileit.learning.student.service;

import com.xgileit.learning.student.model.Student;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * This is the Student service class responsible for the services relating to the
 * student management methods of the controller
 */
public class StudentService implements StudentRepository {

    /**
     * This method adds a student to the student list
     *
     * @param student containing details of a student
     * @return a list of all students
     */
    public List<Student> addStudent(Student student) {

        try {
            StudentRepository.studentList.add(student);

        } catch (RuntimeException e) {
            System.out.println("Runtime exception, please try again");
        }
        finally {
            return studentList;
        }
    }

    /**
     * This method gets all the students from the student list
     *
     * @return a list of all existing students
     */
        public List<Student> getAllStudents () {
            return studentList;
        }

    /**
     * This method updates a student in the student list
     *
     * @param student containing updated details of a student
     * @return a list of all existing students
     */
        public List<Student> updateStudent (Student student){
            StudentRepository.studentList.add(student);
            return studentList;
        }
    /**
     * This method removes a student from the student list
     *
     * @param id represents the student id
     *
     */
        public void deleteStudent (Long id){
            StudentRepository.studentList.remove(id);
        }


    }

