package org.example.java.lang.Exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUsageTryFinally {

    @Test
    public void whenWithoutCatch(){
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            methodWithoutCatch();
        });
        Assertions.assertEquals("Throw message", exception.getMessage());
    }

    /**We need to declare Exception throw if we dont catch it*/
    public void methodWithoutCatch() throws Exception {

        try {
            methodThatThrowException();
            System.out.println("Some text");  //will not be printed
        } finally {
            System.out.println("Hello");    //will be printed
        }
        System.out.println("Academy");  //will not be printed

    }

    public void methodThatThrowException() throws Exception {
        throw new Exception("Throw message");
    }


    /**Usually we use finally wen we need to auto close*/


}
