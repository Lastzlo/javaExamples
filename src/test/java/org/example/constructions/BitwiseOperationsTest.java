package org.example.constructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BitwiseOperationsTest {

    @Test
    void getBinaryValueOfByte() {
        int i = 2;
        Assertions.assertEquals("10", Integer.toBinaryString(i));

        i = -2;
        Assertions.assertEquals("11111111111111111111111111111110", Integer.toBinaryString(i));

        i = -8;
        // -2^32 + 2^31 + 2^30 + ... + 2^4 + 2^2 + 2^1 + 2^0 =
        // = -4_294_967_296 + 4_294_967_288
        Assertions.assertEquals("11111111111111111111111111111000", Integer.toBinaryString(i));

        Assertions.assertEquals(-8, (-4_294_967_296L + 4_294_967_288L));

    }



}
