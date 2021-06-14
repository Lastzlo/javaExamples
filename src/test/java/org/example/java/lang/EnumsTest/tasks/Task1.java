package org.example.java.lang.EnumsTest.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1 {

    @Test
    public void TestOverrideMethodInEnum() {
        Assertions.assertEquals("Its MONDAY", SomeDays.MONDAY.method());
        Assertions.assertEquals("SomeDays : method", SomeDays.FRIDAY.method());
    }

}

enum SomeDays {
    MONDAY {
        @Override
        public String method() {
            return "Its MONDAY";
        }
    },
    FRIDAY,
    WEDNESDAY;

    public String method() {
        return "SomeDays : method";
    }
}
