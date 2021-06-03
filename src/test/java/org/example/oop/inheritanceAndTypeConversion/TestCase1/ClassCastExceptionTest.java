package org.example.oop.inheritanceAndTypeConversion.TestCase1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClassCastExceptionTest {
    @Test
    public void whenUpCast_thenException() {
        Parent parent = new Parent();

        Exception exception = assertThrows(ClassCastException.class, () -> {
            ((Child) parent).run();
        });

        String expectedMessage = "org.example.oop.inheritanceAndTypeConversion.TestCase1.Parent incompatible with org.example.oop.inheritanceAndTypeConversion.TestCase1.Child";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


}

class Parent {
    public void run() {
        System.out.println("Parent running");
    }
}

class Child extends Parent {
}