package org.example.constructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class LoopTest {
    private static final Logger log = Logger.getLogger(LoopTest.class.getName());

    @Test
    public void RunForLoopFiveTimes_whenIncrement() {
        int temp;
        for (temp = 1; temp <5; temp++) {
            System.out.println("temp = " + temp);
        }
        Assertions.assertEquals(5, temp, "temp should be 5");

        //temp = 1
        //temp = 2
        //temp = 3
        //temp = 4
    }

    @Test
    public void RunForLoopFiveTimes_whenPostIncrement() {
        int temp;
        for (temp = 1; temp <5; ++temp) {
            System.out.println("temp = " + temp);
        }
        Assertions.assertEquals(5, temp, "temp should be 5");

        //temp = 1
        //temp = 2
        //temp = 3
        //temp = 4
    }

    @Test
    public void ForLoopWithoutParametersInBody() {

        int i = 0;

        for (;;) {
            log.info("i = "+i);
            if(i == 5) break;
            ++i;
        }

        Assertions.assertEquals(5, i, "i should be 5");
    }
}
