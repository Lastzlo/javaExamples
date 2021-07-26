package org.example.oop.abstractExamples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateObjectClass {
    @Test
    void whenOverrideMethodsOfObjectClass() {
        Object obj1 = new Object() {
            @Override
            public boolean equals(Object obj) {
                return this == obj;
            }
        };
        
        Object obj2 = obj1;

        boolean isEquals = obj1.equals(obj2);
        System.out.println("obj1.equals(obj2) = " + isEquals);

        Assertions.assertTrue(isEquals);

    }
}

