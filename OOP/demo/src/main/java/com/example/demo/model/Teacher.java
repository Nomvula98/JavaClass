package com.example.demo.model;

import ch.qos.logback.classic.LoggerContext;

public class Teacher extends Employee {


    public Teacher(String name, String surname, String employeeNo, String id, String department) {
        super(name, surname, employeeNo, id, department);
    }
    //Abstraction -Protecting internal details/implementation and only showing functionality
    //Only methods that are necessary for this class are invoked.

    //Polymorphism - Action that can be performed in many ways
    //doWork method is an action or behavior that every employee-department does differently
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
        return "I am an employee, I work at the " + department+ " department, \nEmployee is my Parent Class";
    }


}
