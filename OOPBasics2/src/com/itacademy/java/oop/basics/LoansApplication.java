package com.itacademy.java.oop.basics;

public class LoansApplication {

    public static void main(String[] args) {

        Customer customer = new Customer("Betkas", "Belekas", 7, "8677777777", null);
        Loan firstLoan = new Loan(1001, 1000, LoanType.fromCode("Consumer"), "2022-02-02");
        Loan secondLoan = new Loan(1002, 40000, LoanType.fromCode("Leasing"), "2031-05-06");
        Loan[] loans = {firstLoan, secondLoan};
        customer.setLoans(loans);
        customer.printCustomerInfo();

    }
}
