package com.itacademy.java.oop.basics;

import java.sql.SQLOutput;

public class PointApplication {
    public static void main(String[] args) {

        MyPoint firstPoint = new MyPoint(1, 1);
        MyPoint secondPoint = new MyPoint(5, 3);
        System.out.println("First method results between two points: " + firstPoint.distance(secondPoint));
        System.out.println("Second method results between two points: " + firstPoint.distance(secondPoint.getX(), secondPoint.getY()));
        System.out.println("Third method results 1st point nad 0,0 : " + firstPoint.distance());
        System.out.println("First point coords: ");
        for (int coo : firstPoint.getXY()) {
            System.out.println(coo);
        }
        System.out.println("Second point coords " + secondPoint.getXY()[0] + " " + secondPoint.getXY()[1]);
    }
}
