package org.example.constructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NullCheck {
    @Test
    void whenTwoVariablesAreNull() {
        Object o1 = null;
        Object o2 = null;

        //так как o2 null мы не можем вызвать o2.equals(Object o)
        //java.lang.NullPointerException: Cannot invoke "java.lang.Object.equals(java.lang.Object)" because "o2" is null
        //System.out.println("o2.equals(o1) = " + o2.equals(o1));
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> {
            o2.equals(o1);
        });

        //String expectedMessage = "Cannot invoke \"java.lang.Object.equals(java.lang.Object)\" because \"o2\" is null";
        //String actualMessage = exception.getMessage();

        //Assertions.assertTrue(actualMessage.contains(expectedMessage));

        System.out.println("o2 == o1 = " + (o2 == o1));
        
    }

    @Test
    void whenTwoVariablesAreNull2() {
        Object o1 = null;
        Object o2 = null;

        System.out.println("o2 == o1 : " + (o2 == o1));
        Assertions.assertEquals("o2 == o1 : true", "o2 == o1 : " + (o2 == o1));

        //false because '+' operation more priority then ==
        System.out.println("o2 == o1 : " + o2 == o1);
        Assertions.assertEquals(false, "o2 == o1 : " + o2 == o1);
    }

}
