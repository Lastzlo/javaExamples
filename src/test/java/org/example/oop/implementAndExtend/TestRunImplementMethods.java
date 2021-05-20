package org.example.oop.implementAndExtend;

import org.junit.jupiter.api.Test;

public class TestRunImplementMethods {

    @Test
    public void runMethodsThatHasBasicInterface() {
        Transport bike1 = new Bike("My child bike", 3);
//        bike1.getNumberOfWells();  //Cannot resolve method 'getNumberOfWells' in 'Transport'

        Bike bike2 = new Bike("My child bike", 3);

        bike2.getNumberOfWells();

        Bike motoBike = new MotoBike("My first moto", 2, 300);

//        motoBike.getMaxSpeed(); //Cannot resolve method 'getMaxSpeed' in 'Bike'
        motoBike.ride();

        MotoBike motoBike2 = new MotoBike("My second moto", 2, 300);

        motoBike2.getMaxSpeed();
        motoBike2.ride();
    }

}
