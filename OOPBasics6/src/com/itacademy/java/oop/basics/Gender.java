package com.itacademy.java.oop.basics;

public enum Gender {
    MALE("Male"), FEMALE("Female"), IMAGINATION_WORLD("Imagination world");
    private String displayValue;

    public String getDisplayValue() {
        return displayValue;
    }


    public static Gender fromCode(String code) {
        for(Gender g : values()) {
            if(g.getDisplayValue().equals(code)) {
                return g;
            }
        }
        throw new IllegalArgumentException("No such gender kekW");
    }

    Gender(String displayValue) {
        this.displayValue = displayValue;
    }
}
