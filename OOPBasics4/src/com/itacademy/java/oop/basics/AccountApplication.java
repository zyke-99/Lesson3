package com.itacademy.java.oop.basics;

public class AccountApplication {
    public static void main(String[] args) {

        Account firstAcc = new Account("100", "Belekas", 100);
        Account secondAcc = new Account("101", "Nezinau", 50);
        firstAcc.credit(20);
        firstAcc.credit(10);
        System.out.println("First acc balance: " + firstAcc.getBalance());
        secondAcc.credit(10);
        System.out.println("Second acc balance: " + secondAcc.getBalance());
        firstAcc.debit(500);
        secondAcc.transferTo(firstAcc, 70);
        firstAcc.debit(30);
        System.out.println(firstAcc.toString());
        firstAcc.transferTo(secondAcc, 10);
        System.out.println("First acc balance: " + firstAcc.getBalance());
        System.out.println("Second acc balance: " + secondAcc.getBalance());
        System.out.println(firstAcc.toString());
        System.out.println(secondAcc.toString());


    }
}
