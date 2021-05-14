package org.example.java.lang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoubleVariableTest {
    
    @Test
    public void getInfinity() {
        double number1 = 0.1;
        double result = number1 / 0;
        System.out.println("result = " + result);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, result);

        number1 = -0.1;
        result = number1 / 0;
        System.out.println("result = " + result);
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, result);
    }
    
}
