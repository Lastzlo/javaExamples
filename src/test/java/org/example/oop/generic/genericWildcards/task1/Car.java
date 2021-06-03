package org.example.oop.generic.genericWildcards.task1;

public class Car extends Vehicle {
    private String model;
    private int year;

    public Car(String name, String model, int year) {
        super(name);
        this.model = model;
        this.year = year;
    }

    public void run() {
        System.out.println("Car running...");
    }
}
