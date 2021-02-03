package com.itacademy.java.oop.basics;

public enum Contract {
    FULL_TIME("Full-time"), PART_TIME("Part-time");
    private String displayValue;
    public static Contract fromCode(String code)
    {
        for(Contract c : values())
        {
            if(c.getDisplayValue().equals(code))
            {
                return c;
            }
        }
        throw new IllegalArgumentException("No such contract");

    }

    public String getDisplayValue()
    {
        return displayValue;
    }

    Contract(String displayValue)
    {
        this.displayValue = displayValue;
    }
}
