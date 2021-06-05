package org.example.java.lang.Exceptions;

import org.junit.jupiter.api.Test;

public class CatchError {

    /**What will be the result of following code*/

    @Test
    public void ErrorTest() {

        try {
            throw new StackOverflowError();
        } catch (StackOverflowError sOe) {
            System.out.println("will be printed");
        }

        try {
            throw new StackOverflowError();
        } catch (StackOverflowError sOe) {
            for (int i = 0; i < 2; ++i) {
                System.out.print(i + " ");
            }
        }
    }


}
