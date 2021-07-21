package com.example.demo.model;

import ch.qos.logback.classic.LoggerContext;

public class Teacher extends Employee {


    public Teacher(String name, String surname, String employeeNo, String id, String department) {
        super(name, surname, employeeNo, id, department);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", employeeNo='" + getEmployeeNo() + '\'' +
                ", id='" + getId() + '\'' +
                ", department='" + getDepartment() + '\'' +
                '}'+ "\n"+doWork(getDepartment())+"\n"+teach()+"\n"+train();
    }
    @Override
    public String doWork(String department) {
        return "I am an employee, I work at the " + department+ " department";
    }


}
