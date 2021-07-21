package com.example.demo.model;

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
        return "I am an employee, I work at the "+ department + " department";
    }

}
