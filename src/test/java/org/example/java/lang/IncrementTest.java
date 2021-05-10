package org.example.java.lang;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class IncrementTest {

    //byte from -128 to 127                     2^8
    //short from -32768 to 32767                2^16
    //int from -2147483648 to 2147483647        2^32
    //long                                      2^64

    //char from '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)

    private static final Logger log = Logger.getLogger(IncrementTest.class.getName());

    @Test
    public void shortIncrementTest_whenIncrementMAXPositiveValue() {
        short value = 32765;

        for (int i = 0; i < 10; i++) {
            value++;
            log.info("value = " + value);
        }

    }

    @Test
    public void shortIncrementTest_whenIncrementNegativeValue() {
        short value = -3;

        for (int i = 0; i < 10; i++) {
            value++;
            log.info("value = " + value);
        }

    }

    @Test
    public void shortIncrementTest_whenDecrementMAXNegativeValue() {
        short value = -32766;

        for (int i = 0; i < 10; i++) {
            value--;
            log.info("value = " + value);
        }

    }

    @Test
    public void integerIncrementTest_whenIncrementMAXPositiveValue() {
        int value = 2147483645;

        for (int i = 0; i < 10; i++) {
            value++;
            log.info("value = " + value);
        }

    }

    @Test
    public void byteIncrementTest_whenIncrementMAXPositiveValue() {
        byte value = 125;

        for (int i = 0; i < 10; i++) {
            value++;
            log.info("value = " + value);
        }
    }


}
