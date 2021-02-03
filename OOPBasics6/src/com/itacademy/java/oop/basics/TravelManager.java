package com.itacademy.java.oop.basics;

public class TravelManager {

    private TravelManager() {
    }

    public static Family changeDestination(Family family, TravelDestination destination) {
        family.setDestination(destination);
        return family;
    }

    public static void travel(Family family) {

        if(isEnoughFuel(family.getDestination(), family.getVehicle())) {

            System.out.println("The family will make it!");

        }
        else
        {
            System.out.println("The family won't make it. They'll need " + calculateFuelNeeded(family.getDestination(), family.getVehicle()) + "L more fuel.");
        }

    }

    public static void printFamilyMembers(Family family) {

        for (Person p : family.getPeople()) {
            System.out.println(p.toString());
        }

    }

    private static boolean isEnoughFuel(TravelDestination destination, Vehicle vehicle) {

        if(destination.getDistance() > vehicle.getFuel() / vehicle.getConsumption() * 100) {
            return false;
        }
        return true;

    }

    private static double calculateFuelNeeded(TravelDestination destination, Vehicle vehicle) {

        double distanceLeft = destination.getDistance() - vehicle.getFuel() / vehicle.getConsumption() * 100;
        return distanceLeft * vehicle.getConsumption()/100;

    }

}
