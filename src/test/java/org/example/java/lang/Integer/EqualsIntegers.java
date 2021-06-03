package org.example.java.lang.Integer;

import org.junit.jupiter.api.Test;

public class EqualsIntegers {


    //значення від -128 до 127 кешовані для швидшої роботи
    @Test
    public void when5TypesOfInitialize_whenValueLowThen127() {
        String hundred = "100";

        Integer i1 = Integer.parseInt(hundred, 10); //return int

        //Integer.valueOf(parseInt(hundred, 10))
        Integer i2 = Integer.valueOf(hundred);  //return Integer

        //parseInt(hundred, 10);
        Integer i3 = new Integer(hundred);  //return Integer

        //new Integer(100)
        //При звичайному Integer i4 = 100;
        //Значення 100 просто запаковується (autoboxing) в клас Integer.
        //В цьому класі значення від -128 до 127 кешовані для швидшої роботи
        // і їм відповідає одне й те саме місце в пам'яті
        Integer i4 = 100;
        Integer i5 = 100;

        //valueOf використовує parseInt під капотом, тому там значення однакові
        //Integer.parseInt просто повертає число тому в місці виклику воно просто заміниться на 100 і буде збережене на тому ж самому місці в пам'яті.
        System.out.println("(i1 == i2) = " + (i1 == i2));   // true

        //В i3 примусово створюється новий об'єкт конструктором, який має свою адресу тому при порівнянні там буде інше значення
        System.out.println("(i1 == i3) = " + (i1 == i3));   // false

        System.out.println("(i4 == i5) = " + (i4 == i5));   // true

        System.out.println("(i1 == i4) = " + (i1 == i4));   // true
        System.out.println("(i2 == i3) = " + (i2 == i3));   // false
    }

    // Значення більше 127 і менші -128 не кешовані
    @Test
    public void when5TypesOfInitialize_whenValueMoreThen127() {
        String hundred = "1000";

        Integer i1 = Integer.parseInt(hundred, 10); //return int

        Integer i2 = Integer.valueOf(hundred);  //return Integer

        Integer i3 = new Integer(hundred);  //return Integer

        Integer i4 = 1000;
        Integer i5 = 1000;

        System.out.println("(i1 == i2) = " + (i1 == i2));   // false
        System.out.println("(i1 == i3) = " + (i1 == i3));   // false
        System.out.println("(i4 == i5) = " + (i4 == i5));   // false

        System.out.println("(i1 == i4) = " + (i1 == i4));   // false
        System.out.println("(i2 == i3) = " + (i2 == i3));   // false
    }
}
