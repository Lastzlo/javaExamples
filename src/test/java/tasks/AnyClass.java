package tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnyClass {

    public java.lang.String getText() {
        return "text";
    }

    @Test
    public void testOverrideMethodGetText_likeAAnonymousClass() {
        AnyClass anyClass = new AnyClass() {
            @Override
            public java.lang.String getText() {
                return "another text";
            }
        };

        Assertions.assertEquals("another text", anyClass.getText());

    }
}


