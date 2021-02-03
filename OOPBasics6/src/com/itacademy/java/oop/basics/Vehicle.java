package com.itacademy.java.oop.basics;

public class Vehicle {
    private String name;
    private String brand;
    private double fuel;
    private double consumption;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getFuel() {
        return fuel;
    }

    public double getConsumption() {
        return consumption;
    }

    public Vehicle(String name, String brand, double fuel, double consumption) {
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
        this.consumption = consumption;
    }
}
