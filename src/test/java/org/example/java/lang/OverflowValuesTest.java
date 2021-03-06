package org.example.java.lang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class OverflowValuesTest {

    //byte from -128 to 127                     2^8
    //short from -32768 to 32767                2^16
    //int from -2147483648 to 2147483647        2^32
    //long                                      2^64

    //char from '\u0000' (from 0) to '\uffff' (to 65_535)

    private static final Logger log = Logger.getLogger(OverflowValuesTest.class.getName());

    @Test
    public void overflowShortValue_withCastToShort_thenResultShortMIN_VALUE() {
        int a = Short.MAX_VALUE;  //32767
        int b = 1;  //1

        //int
        int result = (short)(a + b);

        System.out.println("result = " + result);
        Assertions.assertEquals(-32768, result);
    }

    @Test
    public void overflowShortValue_withCastToShort_thenResultShortMIN_VALUE_2() {
        short a = Short.MAX_VALUE;  //32767
        short b = 1;  //1

        //short result = (a + b);   //ошибка ведь значение выходит за предел short 32767
        //short
        short result = (short)(a + b);

        System.out.println("result = " + result);
        Assertions.assertEquals(-32768, result);
    }

    @Test
    public void numericOverflowTest() {
        int value = Integer.MAX_VALUE + 1;  //ошибки не будет, // фактическим значением будет -2147483648

        System.out.println("value = " + value);
        Assertions.assertEquals(-2147483648, value);

        value = Integer.MIN_VALUE - 1;  //ошибки не будет, // фактическим значением будет 2147483647

        System.out.println("value = " + value);
        Assertions.assertEquals(2147483647, value);

        //byte byte1 = Byte.MAX_VALUE + 1;      //нужно преобразовывать
        //char char1 = Character.MAX_VALUE + 1; //нужно преобразовывать

        long long1 = Long.MAX_VALUE + 1;
        float float1 = Float.MAX_VALUE + 1;

    }

    @Test
    public void overflowShortValue_withCastToShort_thenResultShortMAX_VALUE() {
        int a = Short.MIN_VALUE;  //-32768
        int b = -1;  //-1

        int result = (short)(a + b);

        System.out.println("result = " + result);
        Assertions.assertEquals(32767, result);
    }

    @Test
    public void overflowShortValue_withoutCasting() {
        int a = Short.MAX_VALUE;  //32767
        int b = 1;  //1

        int result = (a + b);

        System.out.println("result = " + result);
        Assertions.assertEquals(32768, result);
    }

    @Test
    public void overflowShortValue_withoutCasting_2() {
        short a = Short.MAX_VALUE;  //32767
        short b = 1;  //1

        System.out.println("result = " + (a + b));
        Assertions.assertEquals(32768, (a + b));//оба short преобразуються в int

        //оба short преобразуються в int, а потом в short
        Assertions.assertEquals(-32768, (short)(a + b));
    }

    @Test
    public void overflowShortValue_whenIncrement() {
        short a = Short.MAX_VALUE;  //32767
        a++;    //a = (short) (a + 1)

        System.out.println("a = " + a);
        Assertions.assertEquals(-32768, a);

        a++;    //a = (short) (a + 1) = (short) (-32768 + 1) = -32767

        System.out.println("a = " + a);
        Assertions.assertEquals(-32767, a);

    }

    @Test
    public void overflowShortValue_whenDecrement() {
        short a = Short.MIN_VALUE;  //-32768
        a--;    //a = (short) (a - 1)

        System.out.println("a = " + a);
        Assertions.assertEquals(32767, a);

        a--;    //a = (short) (a - 1) = (short) (32767 - 1) = 32766

        System.out.println("a = " + a);
        Assertions.assertEquals(32766, a);

    }

    @Test
    public void overflowShortValue_whenGiven200k() {

        short result = (short) 200_000;

        Assertions.assertEquals(3392, result, "it's 3392");

        result = (short) 229_375;   //65_536*3+32_767
        Assertions.assertEquals(32767, result, "it's 32767");


    }

    //Convert Int to Unsigned Byte and Back
    @Test
    public void convertIntToUnsignedByteAndBack() {
        // максимальное значение byte 256
        int i = 234;

        // Convert int to binary
        byte b = (byte) i;
        System.out.println(b); // -22

        // Convert binary to int
        int i2 = b & 0xFF;
        System.out.println(i2); // 234

    }

}
