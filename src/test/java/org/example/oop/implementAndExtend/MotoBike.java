package org.example.oop.implementAndExtend;

public class MotoBike extends Bike{

    private double maxSpeed;

    public MotoBike(String name, int numberOfWells, double maxSpeed) {
        super(name, numberOfWells);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String ride() {
        String msg = "MotoBike is running...";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String stop() {
        String msg = "MotoBike was stopped...";
        System.out.println(msg);
        return msg;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
