package com.itacademy.java.oop.basics;

public class TravelApplication {
    public static void main(String[] args) {

        Person firstJohn = new Person("John", "Doe", Gender.fromCode("Male"), 20);
        Person firstDavid = new Person("David", "Doe", Gender.fromCode("Male"), 20);
        Person secondKeith = new Person("Keith", "Noe", Gender.fromCode("Male"), 20);
        Person secondKen = new Person("Ken", "Noe", Gender.fromCode("Male"), 20);

        Vehicle firstVehicle = new Vehicle("Something", "Cool", 50, 10);
        Vehicle secondVehicle = new Vehicle("Something", "Uncool", 50, 25);

        TravelDestination destination = new TravelDestination("Whatever", "Vilnius", 300);
        TravelDestination destinationNew = new TravelDestination("Whatever", "Kaunas", 20);

        Family first = new Family(new Person[]{firstDavid, firstJohn}, firstVehicle, destination);
        Family second = new Family(new Person[]{secondKeith, secondKen}, secondVehicle, destination);

        TravelManager.printFamilyMembers(first);
        TravelManager.printFamilyMembers(second);

        TravelManager.travel(first);
        TravelManager.travel(second);

        TravelManager.changeDestination(first, destinationNew);

    }
}
