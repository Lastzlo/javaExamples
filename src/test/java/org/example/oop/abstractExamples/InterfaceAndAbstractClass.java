package org.example.oop.abstractExamples;

import org.junit.jupiter.api.Test;

public class InterfaceAndAbstractClass {
    @Test
    void useMyAbstractStaticMEthods() {
        MyAbstract.printText();
        System.out.println("MyAbstract.number = " + MyAbstract.number);
        MyAbstract.number = 23;
        System.out.println("MyAbstract.number = " + MyAbstract.number);
    }
}

interface MyInterface {
    static int idCode = 0;

    int value2 = 10;

    void method1();
    void method2();
    void method3();
}

abstract class MyAbstract implements org.example.oop.abstractExamples.MyInterface {
    public static void printText() {
        System.out.println("text");
    }

    static int number;


    int value;

    int value2 = 10;

    //так можно
    public abstract void method1();
    public abstract void method2();

    public void method3() {
        value ++;
        value2 = MyInterface.value2;
        new Object();
        //do something
    }

}
