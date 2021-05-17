package org.example.java.lang;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
        assertEquals(1, average);
    }

    @Test
    public void divideTest_b() {
        int number1 = 1;
        int number2 = 2;
        double average = (number1 + number2) / 2.0; //1.5
        System.out.println("average = " + average);
        assertEquals(1.5, average);
    }

    @Test
    public void divideTest_c() {
        double number1 = 1.0;
        double number2 = 2.0;
        double average = (number1 + number2) / 2; //1.5
        System.out.println("average = " + average);
        assertEquals(1.5, average);
    }

    @Test
    public void divideTest_whenIntDivideThree() {
        int result = 4 / 3;     //result: 1
        System.out.println("result = " + result);
        assertEquals(1, result);

        result = (int) (4 / 3.0);   //result: 1, but need cast to int
        System.out.println("result = " + result);
        assertEquals(1, result);

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
        assertEquals(0.9, result);

        int result2 = (int) (number1 - number2);    // 0
        System.out.println(result2);
        assertEquals(0, result2);


    }

    //Приоритет арифметических операций
    //Операции в порядке уменьшения приоритета:
    //
    //++ (инкремент), -- (декремент)
    //
    //* (умножение), / (деление), % (остаток от деления)
    //
    //+ (сложение), - (вычитание)
    @Test
    public void arithmeticPriorityTest() {

        //Вначале будет выполняться операция инкремента ++b, которая имеет больший приоритет - она увеличит значение переменной b и возвратит его в качестве результата. Затем выполняется умножение 5 * ++b, и только в последнюю очередь выполняется сложение a + 5 * ++b

        int a = 8;
        int b = 7;
        int c = a + 5 * ++b;
        System.out.println(c);  // 48
        assertEquals(48, c, "its should be 48");



    }

    @Test
    public void arithmeticPriorityTest2() {
        int a = 6;
        int b = 3;

        //  (a / b++) + (b * --a)
        //  (6 / 3) + (4 * 5)  = 22

        int c = a / b++ + b * --a;
        assertEquals(22, c, "its should be 22");
    }

    @Test
    public void arithmeticPriorityTest3() {
        int a = 6;
        int b = 3;

        //  (a / b++) + (b * a--)
        //  (6 / 3) + (4 * 6)  = 26
        int c = a / b++ + b * a--;
        assertEquals(26, c, "its should be 26");
    }

    @Test
    public void arithmeticPriorityTest4() {
        int num1 = 4;
        int num2 = 5;
        int num3 = 15;
        int num4 = 10;
        int num5 = 5;
        int result = 12;

        result += num1 * num2 + num3 % num4 / num5;
        assertEquals(33, result, "its should be 33");

        assertEquals((15%10), 5, "its should be 5");    //остаток от деления
        assertEquals((1/5), 0, "its should be 0");
    }




    //Ассоциативность операций
    @Test
    public void associativityOperations() {
        //Все арифметические операторы (кроме префиксного инкремента и декремента)
        // являются лево ассоциативными, то есть выполняются слева направо.
        // Поэтому выражение 10 / 5 * 2 необходимо трактовать как (10 / 5) * 2,
        // то есть результатом будет 4.
        int x = 10 / 5 * 2;
        assertEquals(4, x, "its should be 4");


        int y = 10 + 5 * 10 / 2;
        assertEquals(35, y, "its should be 35");

    }

    //Следует отметить, что числа с плавающей точкой не подходят для финансовых
    // и других вычислений, где ошибки при округлении могут быть критичными. Например:
    @Test
    public void OperationWithFloatingPointTest() {
        double d = 2.0 - 1.1;
        assertNotEquals(0.9, d);
        assertEquals(0.8999999999999999, d);

        float f = 25.5F + 0.5f;
        assertEquals(26.0f, f);

        BigDecimal bigDecimal =
                BigDecimal.valueOf(2.0)
                        .subtract(BigDecimal.valueOf(1.1));
        assertEquals(BigDecimal.valueOf(0.9), bigDecimal, "Its should be 0.9");

    }



}
