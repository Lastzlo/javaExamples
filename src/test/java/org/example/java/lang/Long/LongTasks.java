package org.example.java.lang.Long;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongTasks {

    /**
     * Task 1
     *
     * If
     * @param number contains exactly 10 digits
     * @return true
     */
    public static boolean task1(long number) {
        if (number < 0) {
            return (String.valueOf(number).length() == 11);
        } else {
            return (String.valueOf(number).length() == 10);
        }
    }

    @Test
    public void test1_whenCorrectNumber_thenTrue() {
        Assertions.assertTrue(task1(1_000_000_000));
        Assertions.assertTrue(task1(-1_000_000_000));
    }

    @Test
    public void test1_whenIllegalNumber_thenFalse() {
        Assertions.assertFalse(task1(1_000));
        Assertions.assertFalse(task1(-1_000_000));
    }


}
