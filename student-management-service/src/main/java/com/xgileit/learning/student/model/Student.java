package com.xgileit.learning.student.model;



import java.util.List;
import java.util.Map;


public class Student {
    private String name;
    private String surname;
    private String cellPhone;
    private Long studentId;


   // private Map<String, String> subject;
    //Address address;

    public class Address {
        private String street;
        private String city;
        private String state;
        private String postalCode;

    }

    public Student() {
    }

    public Student(String name, String surname, String cellPhone) {
        this.name = name;
        this.surname = surname;
        this.cellPhone = cellPhone;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }


}
