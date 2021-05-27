package org.example.java.lang;

import org.junit.jupiter.api.Test;

public class LongInitialize {


    //Здесь число 2147483650 является допустимым для типа long, но выходит за предельные значения для типа int. И так как все целочисленные значения по умолчанию расцениваются как значения типа int, то компилятор укажет нам на ошибку. Чтобы решить проблему, надо добавить к числу суффикс l или L, который указывает, что число представляет тип long:
    @Test
    public void initializeLong() {
        int i = 2147483647;

        //long l = 2147483650;
        long l = 2147483650L;   //выход, добавить L

        long sum = i + l;

        System.out.println("sum = " + sum);
    }


}
