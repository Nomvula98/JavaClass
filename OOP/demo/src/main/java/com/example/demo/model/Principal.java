package com.example.demo.model;

//Inheritance - inheriting properties and behaviors of the parent class
//e.g The teacher and principal are subclasses of Employee class

//Abstraction -Protecting internal details/implementation and only showing functionality
//Only methods that are necessary for this class are invoked.

//Polymorphism - Action that can be performed in many ways
//doWork method is an action or behavior that every employee-department does differently
public class Principal extends Employee{
    public Principal(String name, String surname, String employeeNo, String id, String department) {
        super(name, surname, employeeNo, id, department);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", employeeNo='" + getEmployeeNo() + '\'' +
                ", id='" + getName() + '\'' +
                ", department='" + getDepartment() + '\'' +
                '}' +"\n"+ doWork(getDepartment())+"\n"+ coordinate()+"\n"+ supervise();
    }

    @Override
    public String doWork(String department) {
        return "I am an employee, I work at the "+ department + " department. \nEmployee is my Parent Class";
    }

}
