package org.example.java.lang;

import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void printRundomIntValueFrom0to9() {
        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 10);
            System.out.println("number = " + number);
        }
    }
}
