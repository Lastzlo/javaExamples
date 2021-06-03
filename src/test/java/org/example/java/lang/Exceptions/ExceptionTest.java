package org.example.java.lang.Exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {
    @Test
    public void thenNullPointerException() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            String str = null;
            System.out.println(str.length());
        });
    }
}
