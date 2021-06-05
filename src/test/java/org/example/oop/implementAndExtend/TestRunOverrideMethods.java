package org.example.oop.implementAndExtend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRunOverrideMethods {
    @Test
    public void ride() {
        Transport transportBike = new Bike("My child bike", 3);
        Transport transportMotoBike = new MotoBike("My first moto", 2, 300);

        Assertions.assertEquals("Bike is running...", transportBike.ride());
        Assertions.assertEquals("MotoBike is running...", transportMotoBike.ride());


        //cast не повлиял
        Assertions.assertEquals("Bike is running...", ((Bike)transportBike).ride());
        //cast не повлиял
        Assertions.assertEquals("MotoBike is running...", ((Bike)transportMotoBike).ride());



    }
}
