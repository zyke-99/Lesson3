package com.itacademy.java.oop.basics;

public class Family {

    private Person[] people;
    private Vehicle vehicle;
    private TravelDestination destination;

    public Family(Person[] people, Vehicle vehicle, TravelDestination destination) {
        this.people = people;
        this.vehicle = vehicle;
        this.destination = destination;
    }

    public void setDestination(TravelDestination destination) {
        this.destination = destination;
    }

    public Person[] getPeople() {
        return people;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public TravelDestination getDestination() {
        return destination;
    }
}
