package com.itacademy.java.oop.basics;

public class ShapeApplication {

    public static void main(String[] args) {

        Square squareOne = new Square(10, 5);
        Square squareTwo = new Square(10, 0);
        Square squareThree = new Square(-1, 0);
        Square[] squares = {squareOne, squareTwo, squareThree};
        for (Square s : squares) {
            if (s.validateSquare()) {
                s.printCorrectSquare();
            } else {
                s.printIncorrectSquare();
            }
        }

    }
}
