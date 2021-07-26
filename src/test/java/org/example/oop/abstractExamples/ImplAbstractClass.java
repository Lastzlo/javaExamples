package org.example.oop.abstractExamples;

import org.junit.jupiter.api.Test;

public class ImplAbstractClass {
    @Test
    void createTransportWhenUseAnonymousClass() {
//        Transport car = new Transport() {   //not found empty constructor
        Transport car = new Transport("BMW", 777) {
            @Override
            void run() {
                System.out.println("running..");
            }

            @Override
            public String toString() {
                return "car {" +
                        "name='" + name + '\'' +
                        ", id=" + id +
                        '}';
            }
        };

        System.out.println("car.name = " + car.name);
        System.out.println("car = " + car);
    }

}

abstract class Transport {
    protected String name;
    protected int id;

    long getSpeed(){
        return 0;
    };

    abstract void run();

    public Transport(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
