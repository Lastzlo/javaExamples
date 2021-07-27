package org.example.constructions;

import org.junit.jupiter.api.Test;

public class SwitchExample {
    private static final int RED = 0;
    private static final int Green = 1;
    private static final int Yell = 2;

    @Test
    void whatResult() {
        int color = 2;
        switch (color) {
            case RED:
                System.out.println("Red");
                break;
            default:
                System.out.println("Yellloo");
            case Green:
                System.out.println("Green");
        }
    }
}
