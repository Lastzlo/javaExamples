package org.example.java.lang.String;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class String_format {
    @Test
    public void formatConversation() {
        String type = "Rare";
        String color = "Red";
        String name = "MyPlant";

        Assertions.assertEquals("{type: Rare, color: Red, name: MyPlant}",
                String.format("{type: %s, color: %s, name: %s}", type, color, name));
    }
}
