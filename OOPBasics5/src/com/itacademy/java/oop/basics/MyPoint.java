package com.itacademy.java.oop.basics;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y) {

        double ac = Math.abs(this.y - y);
        double cb = Math.abs(this.x - x);
        return Math.hypot(ac, cb);

    }

    public double distance(MyPoint another) {
        double ac = Math.abs(this.y - another.getX());
        double cb = Math.abs(this.x - another.getY());
        return Math.hypot(ac, cb);
    }

    public double distance() {
        double ac = Math.abs(this.y - 0);
        double cb = Math.abs(this.x - 0);
        return Math.hypot(ac, cb);

    }

}
