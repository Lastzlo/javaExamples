package org.example.constructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class LoopTest {
    private static final Logger log = Logger.getLogger(LoopTest.class.getName());

    @Test
    public void RunForLoopFiveTimes_whenIncrement() {
        for (int i = 0; i < 5; i++) {
            log.info("i = "+i);
        }
    }

    @Test
    public void RunForLoopFiveTimes_whenPostIncrement() {
        for (int i = 0; i < 5; ++i) {
            log.info("i = "+i);
        }
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
