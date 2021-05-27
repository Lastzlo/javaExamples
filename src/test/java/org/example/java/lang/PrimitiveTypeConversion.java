package org.example.java.lang;




import org.junit.jupiter.api.Test;

public class PrimitiveTypeConversion {

    //byte -> short -> int -> long -> float -> double;
    @Test
    void automaticTypeConversio_whenBasicValueInteger() {
        int i = 100;

        // automatic type conversion
        long l = i;

        // automatic type conversion
        float f = l;
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);
    }

    //char -> int -> long -> float -> double;
    @Test
    void automaticTypeConversion_whenBasicValueChar() {
        char c = 'c';

        // automatic type conversion
        int i = c;

        // automatic type conversion
        long l = i;

        // automatic type conversion
        float f = l;
        System.out.println("Char value "+c);
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);
    }


    ////Сужающее или явное преобразование
    // char we should Explicit Conversion
    @Test
    void narrowingTypeConversion_whenChar() {
        byte b = 127;

        char c = (char) b;

        System.out.println("Byte value "+ b);
        System.out.println("Char value "+ c);
    }

    //Сужающее или явное преобразование
    //Narrowing or Explicit Conversion
    void explicitConversion() {
        double d = 100.04;

        //explicit type casting
        long l = (long)d;

        //explicit type casting
        int i = (int)l;
        System.out.println("Double value "+d);

        //fractional part lost
        System.out.println("Long value "+l);

        //fractional part lost
        System.out.println("Int value "+i);
    }

    void explicitConversion_toByte() {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("Conversion of int to byte.");

        //i%256
        b = (byte) i;
        System.out.println("i = " + i + " b = " + b);
        System.out.println("\nConversion of double to byte.");

        //d%256
        b = (byte) d;
        System.out.println("d = " + d + " b= " + b);
    }

    //While evaluating expressions, the result is automatically updated to larger data type
    // of the operand. But if we store that result in any smaller data type it generates
    // compile time error, due to which we need to type cast the result.
    @Test
    public void explicitTypeCasting() {
        byte var = 120;

        var = (byte) ((int) (var * 2)); //главное в конце преобразовать в byte потомучто переменная byte var
        System.out.println("var = " + var);

        var = 120;
        // по сути когда происходит var * 2 результат автоматически преобразуется в int
        // по этому для того чтобы сохранить в переменную типа byte,
        // нужно явно преобразовать (byte)
        var = (byte) (var * 2); //надо преобразовать потому что значение выходит за предел byte 127
        System.out.println("var = " + var);
    }

}
