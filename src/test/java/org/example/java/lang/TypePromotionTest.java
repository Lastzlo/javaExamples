package org.example.java.lang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypePromotionTest {


    /**
     * Widening primitive conversion (§5.1.2) is applied to convert either or both operands as specified by the following rules:
     *
     * If either operand is of type double, the other is converted to double.
     *
     * Otherwise, if either operand is of type float, the other is converted to float.
     *
     * Otherwise, if either operand is of type long, the other is converted to long.
     *
     * Otherwise, both operands are converted to type int.
     * */
    @Test
    public void test_1() {
        int i    = 0;
        float f  = 1.0f;
        double d = 2.0;
        // First int*float is promoted to float*float, then
        // float==double is promoted to double==double:
        if (i * f == d) System.out.println("oops");

        // A char&byte is promoted to int&int:
        byte b = 0x1f;
        System.out.println("b = " + b);
        char c = 'G';
        System.out.println("Character.getNumericValue(c) = " + Character.getNumericValue(c));
        int control = c & b;
        System.out.println(Integer.toHexString(control));
        Assertions.assertEquals(7, control);

        // Here     int:float is promoted to float:float:
        f = (b==0) ? i : 4.0f;
        System.out.println(1.0/f);
        Assertions.assertEquals(0.25, 1.0/f);
    }




}
