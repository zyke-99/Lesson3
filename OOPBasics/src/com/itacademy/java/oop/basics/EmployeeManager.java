package com.itacademy.java.oop.basics;

public class EmployeeManager {

    public static void main(String[] args) {

        Employee employee = new Employee("Name", "LastName", Contract.fromCode("Full-time"), "Manager", "2018-09-02");
        employee.printEmployeeInfo();

    }
}
