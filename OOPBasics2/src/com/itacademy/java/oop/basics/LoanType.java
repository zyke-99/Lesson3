package com.itacademy.java.oop.basics;

public enum LoanType {

    LEASING("Leasing"), CONSUMER("Consumer");

    private String displayValue;

    public String getDisplayValue() {
        return displayValue;
    }

    public static LoanType fromCode(String code) {
        for (LoanType l : values()) {
            if (l.getDisplayValue().equals(code)) {
                return l;
            }
        }
        throw new IllegalArgumentException("No such loan type");
    }

    LoanType(String displayValue) {
        this.displayValue = displayValue;
    }
}
