package org.example.constructions;

import org.junit.jupiter.api.Test;

public class LogicalOperatorsTest {
    static final boolean aTrue = true;
    static final boolean aTrue_2 = true;
    static final boolean aFalse = false;
    static final boolean aFalse_2 = false;

    @Test
    public void logicalAND() {
        System.out.println("(aTrue & aFalse) = " + (aTrue & aFalse));   //проеверяет левое и правое
        System.out.println("(aTrue && aFalse) = " + (aTrue && aFalse)); //проеверяет только левое

        System.out.println("(aTrue & aTrue_2) = " + (aTrue & aTrue_2));
        System.out.println("(aTrue && aTrue_2) = " + (aTrue && aTrue_2));

        //Вывод: стоит использовать && ведь true будет только если оба true
    }

    @Test
    public void logicalOR() {
        System.out.println("(aTrue | aFalse) = " + (aTrue | aFalse));
        System.out.println("(aTrue || aFalse) = " + (aTrue || aFalse));

        System.out.println("(aFalse_2 | aFalse) = " + (aFalse_2 | aFalse));
        System.out.println("(aFalse_2 || aFalse) = " + (aFalse_2 || aFalse));

        //Вывод: стоит использовать | ведь true будет только если хотя бы один true
    }
}
