package com.itacademy.java.oop.basics;


import java.util.Arrays;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private String personalNumber;
    Loan[] loans;

    public Customer() {

    }


    public Customer(String name, String surname, int age, String personalNumber, Loan[] loans) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loans = loans;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public Loan[] getLoans() {
        return loans;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNumber='" + personalNumber + '\'' +
                ", loans=" + Arrays.toString(loans) + '\'' +
                ", sum of loans=" + calculateSumLoans() +
                '}';
    }

    public void printCustomerInfo() {
        System.out.println(this.toString());
    }

    private double calculateSumLoans() {
        double sum = 0;
        if (this.loans != null) {
            for (Loan l : this.loans) {
                sum += l.getAmount();
            }
        }
        return sum;
    }

}
