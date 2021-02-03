package com.itacademy.java.oop.basics;

public class Loan {

    private long id;
    private double amount;
    private LoanType loanType;
    private String terminationDate;

    public Loan(long id, double amount, LoanType loanType, String terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public Loan() {
    }

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", loanType=" + loanType +
                ", terminationDate='" + terminationDate + '\'' +
                '}';
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public String getTerminationDate() {
        return terminationDate;
    }
}
