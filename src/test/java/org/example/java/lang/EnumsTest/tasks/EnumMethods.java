package org.example.java.lang.EnumsTest.tasks;

import org.junit.jupiter.api.Test;

public class EnumMethods {
    @Test
    void enumMethods() {

        String name = Month.April.name();
        int ordinal = Month.April.ordinal();
        System.out.println("name = " + name);   //April
        System.out.println("ordinal = " + ordinal); //0

        System.out.println(Month.April);
    }
}

enum Month {
    April,
    Spring;

    Month() {
        System.out.println("color");
    }
}