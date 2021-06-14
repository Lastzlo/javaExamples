package org.example.java.lang.CasesWithArray;

import org.junit.jupiter.api.Test;

public class SwithCaseTest {
}
class Example {
    private static final int RED = 0;
    private static final int GREEN = 1;
    private static final int YELLOW = 2;

    @Test
    public void printColor_color2() {
        int color = 2;

        switch (color) {
            case RED:
                System.out.println("RED");
                break;
            default:
                System.out.println("YELLOW");
                //break;
            case GREEN:
                System.out.println("GREEN");
        }
    }

    @Test
    public void printColor_color4_notInColors() {
        int color = 4;

        switch (color) {
            case RED:
                System.out.println("RED");
                break;
            default:
                System.out.println("YELLOW");   //will be printed
                break;
            case GREEN:
                System.out.println("GREEN");
        }
    }
}
