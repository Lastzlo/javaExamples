package org.example.java.lang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SomeTests {

    @Test
    public void finalValue() {
        final int LIMIT = 5;
        System.out.println("LIMIT = " + LIMIT);
        // LIMIT=57; // Compilation Error, так как LIMIT - константа

    }

    @Test
    public void checkDefaultValuesOfPrimitives() {
        //Data Type	    Default Value (for fields)
        //byte	        0
        //short	        0
        //int	        0
        //long	        0L
        //float	        0.0f
        //double	    0.0d
        //char	        '\u0000'
        //boolean	    false
        //String (or any object)  	null


        DefaultValuesContainer container = new DefaultValuesContainer();

        System.out.println(container);

        assertEquals(0, container.defaultInt);
        assertFalse(container.defaultBoolean);
        assertEquals(0L, container.defaultLong);
        assertEquals(0.0f, container.defaultFloat);
        assertEquals(0.0d, container.defaultDouble);
        assertEquals(	'\u0000', container.defaultChar);
        assertNull(container.defaultString);
    }

    @Test
    public void checkIntegerLiterals() {
        int numberWith_ = 2_6;
        assertEquals(26, numberWith_, "The number 26, numberWith_ = 2_6");
        // The number 26, in decimal
        int decVal = 26;
        assertEquals(26, decVal, "The number 26, in decimal");
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        assertEquals(26, hexVal, "The number 26, in hexadecimal");
        // The number 26, in binary
        int binVal = 0b11010;
        assertEquals(26, binVal, "The number 26, in binary");

    }



    @Test
    public void VarVariableDeclaration() {

        //Слово var ставится вместо типа данных,
        // а сам тип переменной выводится из того значения,
        // которое ей присваивается. Например,
        // переменной x присваивается число 10, значит,
        // переменная будет представлять тип int.
        var integer = 10;

        //var value; // Compilation Error, var обязательно должен быть инициализирован чтобы был установлен тип переменной

        var container = new DefaultValuesContainer();

        assertInstanceOf(DefaultValuesContainer.class, container, "container is an instance of the class DefaultValuesContainer.class");
    }

    /**
     * Все целочисленные литералы, например, числа 10, 4, -5,
     * воспринимаются как значения типа int, однако мы можем присваивать
     * целочисленные литералы другим целочисленным типам: byte, long, short.
     * В этом случае Java автоматически осуществляет соответствующие преобразования
     *     byte a = 1;
     *     short b = 2;
     *     long c = 2121;
     * Однако если мы захотим присвоить переменной типа long очень большое число,
     * которое выходит за пределы допустимых значений для типа int, то мы столкнемся
     * с ошибкой во время компиляции:
     *     long num = 2147483649;
     * Здесь число 2147483649 является допустимым для типа long, но выходит за
     * предельные значения для типа int. И так как все целочисленные значения по
     * умолчанию расцениваются как значения типа int, то компилятор укажет нам на ошибку.
     * Чтобы решить проблему, надо добавить к числу суффикс l или L, который указывает,
     * что число представляет тип long:
     *     long num = 2147483649L;
     */
    @Test
    public void LongVariableDeclaration() {

        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);

        long longValue = maxValue + 1;
        System.out.println("longValue = " + longValue);
        assertEquals(-2147483648, longValue, "значение отрицательное потому что число выходит за пределы допустимых значений для типа int");

        longValue = maxValue + 1L;
        System.out.println("longValue = " + longValue);
        assertEquals(2147483648L, longValue, "суффикс l или L, указывает, что число представляет тип long");

        longValue =  (maxValue + (long)1);  //преобразовали int 1 в long
        System.out.println("longValue = " + longValue);
        assertEquals(2147483648L, longValue);


    }

}

class DefaultValuesContainer {
    public int defaultInt;
    public boolean defaultBoolean;
    public long defaultLong;
    public float defaultFloat;
    public double defaultDouble;
    public char defaultChar;
    public String defaultString;

    @Override
    public String toString() {
        return "DefaultValuesContainer{" +
                "defaultInt=" + defaultInt +
                ", defaultBoolean=" + defaultBoolean +
                ", defaultLong=" + defaultLong +
                ", defaultFloat=" + defaultFloat +
                ", defaultDouble=" + defaultDouble +
                ", defaultChar=" + defaultChar +
                ", defaultString='" + defaultString + '\'' +
                '}';
    }


}
