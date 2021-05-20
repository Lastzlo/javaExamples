package org.example.oop.implementAndExtend;

public class MotoBike extends Bike{

    private double maxSpeed;

    public MotoBike(String name, int numberOfWells, double maxSpeed) {
        super(name, numberOfWells);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
