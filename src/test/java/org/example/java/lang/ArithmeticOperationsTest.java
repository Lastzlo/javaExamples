package org.example.java.lang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticOperationsTest {

    //Непреднамеренное деление целых чисел

    //Java использует один и тот же оператор деления, а именно /,
    // для выполнения как целочисленного, так и деления с плавающей запятой.

    // Когда два операнда являются целыми числами, оператор / выполняет целочисленное
    // деление. Результатом операции является целое число. Дробная часть усечена.
    // Чтобы заставить два целых числа выполнить деление с плавающей запятой,
    // сделайте одно из целых чисел числом с плавающей запятой.

    // Например, код в (a) показывает, что среднее значение равно 1,
    // а код в (b) показывает, что среднее значение равно 1,5.
    @Test
    public void divideTest_a() {
        int number1 = 1;
        int number2 = 2;
        double average = (number1 + number2) / 2;   //1.0
        System.out.println("average = " + average);
        Assertions.assertEquals(1, average);
    }

    @Test
    public void divideTest_b() {
        int number1 = 1;
        int number2 = 2;
        double average = (number1 + number2) / 2.0; //1.5
        System.out.println("average = " + average);
        Assertions.assertEquals(1.5, average);
    }

    @Test
    public void divideTest_c() {
        double number1 = 1.0;
        double number2 = 2.0;
        double average = (number1 + number2) / 2; //1.5
        System.out.println("average = " + average);
        Assertions.assertEquals(1.5, average);
    }

    @Test
    public void divideTest_whenIntDivideThree() {
        int result = 4 / 3;     //result: 1
        System.out.println("result = " + result);
        Assertions.assertEquals(1, result);

        result = (int) (4 / 3.0);   //result: 1, but need cast to int
        System.out.println("result = " + result);
        Assertions.assertEquals(1, result);

    }

    @Test
    public void RoundingErrorsTest() {
        //Отображает 0,5000000000000001, а не 0,5
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);

        //Отображает 0.09999999999999998, а не 0,1
        System.out.println(1.0 - 0.9);

        //Целые числа хранятся точно. Поэтому вычисления с целыми числами дают точный целочисленный результат

    }

    @Test
    public void RoundingErrorsTest2() {
        int number1 = 1;
        double number2 = 0.1;

        double result = number1 - number2;  //0.9
        System.out.println(result);
        Assertions.assertEquals(0.9, result);

        int result2 = (int) (number1 - number2);    // 0
        System.out.println(result2);
        Assertions.assertEquals(0, result2);


    }



}
