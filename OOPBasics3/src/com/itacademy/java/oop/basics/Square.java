package com.itacademy.java.oop.basics;

public class Square {

    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Square() {
    }

    public boolean validateSquare() {
        if (this.width > 0 && this.length > 0) {
            return true;
        }
        return false;
    }

    public double calculatePerimeter() {
        return 2 * this.width + 2 * this.length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public void printCorrectSquare() {
        System.out.println("Correct square: " + this.toString() + " Area: " + this.calculateArea() + " Perimeter " + this.calculatePerimeter());

    }

    public void printIncorrectSquare() {
        System.out.println("Incorrect square: " + this.toString());

    }
}
