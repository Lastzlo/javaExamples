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
    public String ride() {
        String msg = "Bike is running...";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String stop() {
        String msg = "Bike was stopped...";
        System.out.println(msg);
        return msg;
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
