package org.example.constructions;

import org.junit.jupiter.api.Test;

public class ArifmeticOperations {
    @Test
    void canNotIntUseAPercent_thenYES() {
        long ss = 20l;  // long can use
        long result = ss % 3;
        System.out.println("result = " + result);   // result = 2
        result = ss % 6;
        System.out.println("result = " + result);   // result = 2


    }
}
