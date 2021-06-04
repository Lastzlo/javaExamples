package org.example.java.lang.Exceptions.Tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTask2 {

    /**What does the output of the following contain?*/
    @Test
    public void test() {
        RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class, () -> {
            System.out.println("1");                    //1
            try {
                System.out.println("2");                //2
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("3");                //3
                throw new RuntimeException("first");
            } catch (RuntimeException e) {
                System.out.println("4");                //сюда оно не пошло, оно пошло в finally
                throw new RuntimeException("second");
            } finally {
                System.out.println("5");                //4
                throw new RuntimeException("third");    //5     //java.lang.RuntimeException: third
            }
        });

        Assertions.assertEquals("third", runtimeException.getMessage());




    }
}
