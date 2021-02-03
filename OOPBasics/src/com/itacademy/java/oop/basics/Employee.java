package com.itacademy.java.oop.basics;

import java.util.Date;

public class Employee {

    private String name;
    private String surname;
    private Contract contractType;
    private String position;
    private String contractStartDate;

    public Employee() {}

    public Employee(String name, String surname, Contract contractType,
                    String position, String contractStartDate)
    {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.position = position;
        this.contractStartDate = contractStartDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Contract getContractType() {
        return contractType;
    }

    public String getPosition() {
        return position;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractType=" + contractType +
                ", position='" + position + '\'' +
                ", contractStartDate='" + contractStartDate + '\'' +
                '}';
    }

    public void printEmployeeInfo()
    {
        System.out.println(this.toString());
    }
}
