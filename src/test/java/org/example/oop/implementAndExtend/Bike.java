package org.example.oop.implementAndExtend;

public class Bike implements Transport {

    private int numberOfWells;
    private String name;

    public Bike(String name, int numberOfWells) {
        this.name = name;
        this.numberOfWells = numberOfWells;
    }

    public int getNumberOfWells() {
        return numberOfWells;
    }

    @Override
    public void ride() {
        System.out.println("Bike is running...");
    }

    @Override
    public void stop() {
        System.out.println("Bike was stopped...");
    }

    @Override
    public boolean hasSeat() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
