package org.example.constructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncrementTest {
    @Test
    public void whenCheckIncrementValueTwoTimes() {
        int i = 34;
        int j = i++;
        System.out.println("j = " + j); //34    //остается старое значение
        System.out.println("i = " + i); //35

        System.out.println("j = " + j); //34    //остается старое значение
        System.out.println("i = " + i); //35

        //но если мы снова присвоим
        j = i;
        System.out.println("j = " + j); //35
        System.out.println("i = " + i); //35

        assertEquals(35, j);
    }

    @Test
    public void whenCheckPostIncrementValueTwoTimes() {
        int i = 34;
        int j = ++i;
        System.out.println("j = " + j); //35    //новое ведь ++i сразу возвращает результат
        assertEquals(35, j);
        System.out.println("i = " + i); //35
        assertEquals(35, i);

        System.out.println("j = " + j); //35
        System.out.println("i = " + i); //35

    }
}
