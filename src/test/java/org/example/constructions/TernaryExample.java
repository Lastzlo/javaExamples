package org.example.constructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TernaryExample {

    @Test
    void someOperators() {
        int result = true ? false ? true ? 1 : 2 : 3 : 4;
        System.out.println (result);

        int result2 = true ? (false ? (true ? 1 : 2) : 3) : 4;
        System.out.println (result2);
    }

    @Test
    void task() {
        ForTernar example = new ForTernar();
        int number = example.getNumber(5, 5);
        Assertions.assertEquals(20, number);
    }


    public final class ForTernar {
        final int number = 10;

        final int getNumber(int n1, int n2) {
            int number = 20;
            return n1 > n2 ? n1 : n1 > n2 ? n2 : number;
        }

    }

}
