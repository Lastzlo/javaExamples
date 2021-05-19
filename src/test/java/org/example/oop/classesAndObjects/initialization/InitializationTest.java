package org.example.oop.classesAndObjects.initialization;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InitializationTest {

    @Test
    public void orderOfExecution() {
        TestCase testCase = new TestCase();

        //Static initialization 1   // 1) выполняются static инициализации
        //Static initialization 2
        //Initialization 1          // 2) выполняются инициализации
        //Initialization 2
        //Constructor TestCase()    // 3) выполняется конструктор

    }


    @Test
    public void orderOfExecution2() {
        TestCase.run();

        //Static initialization 1       // 1) выполняются static инициализации
        //Static initialization 2
        //Static void run               // 2) выполняются static инициализации
    }

    @Test
    public void orderOfExecution3() {
        TestCase.run();

        //Static initialization 1       // 1) выполняются static инициализации
        //Static initialization 2
        //Static void run               // 2) выполняется static метод

        TestCase.run();

        //Static void run               // 3) выполняется static метод

        //статическая инициализация выполняется только при первом вызове класса

    }
    
    @Test
    public void changeStaticValue() {
        System.out.println("TestCase2.basicONE = " + TestCase2.basicONE);

        //Static initialization 1
        //now basicONE = 2
        //Static initialization 2
        //now basicONE = 7
        //TestCase2.basicONE = 7

    }

    @Test
    public void changeStaticValue2() {
        TestCase2.run();

        //Static initialization 1
        //now basicONE = 2
        //Static initialization 2
        //now basicONE = 7
        //Static void run
        //now basicONE = 7

        System.out.println("TestCase2.basicONE = " + TestCase2.basicONE);

        //TestCase2.basicONE = 7
    }

    @Test
    public void changeStaticValue3() {
        TestCase3.run();

        //Static initialization 1
        //Static void set basicValue = 7
        //now basicValue = 7
        //Static initialization 2
        //Static void set basicValue = 9
        //now basicValue = 9
        //Static void run
        //now basicValue = 9
    }

    @Test
    public void writeMessegeFromStaticMethodsAndInitializationToList() {
        TestCase3.run();

        //Static initialization 1
        //Static void set basicValue = 7
        //now basicValue = 7
        //Static initialization 2
        //Static void set basicValue = 9
        //now basicValue = 9
        //Static void run
        //now basicValue = 9

        TestCase4.run();

        List<String> messageList = TestCase4.getMessageList();
        Iterator<String> iterator = messageList.iterator();

        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }

        //iterator.next() = Static initialization 1
        //iterator.next() = Static void set basicValue = 7
        //iterator.next() = Now basicValue = 7
        //iterator.next() = Static initialization 2
        //iterator.next() = Static void set basicValue = 9
        //iterator.next() = Now basicValue = 9
        //iterator.next() = Static void run
        //iterator.next() = Now basicValue = 9
    }

}

class TestCase{

    public TestCase(){
        System.out.println("Constructor TestCase()");
    }

    {
        System.out.println("Initialization 1");
    }

    {
        System.out.println("Initialization 2");
    }

    // 1) выполняются static инициализации
    static {
        System.out.println("Static initialization 1");
    }

    static {
        System.out.println("Static initialization 2");
    }

    public static void run() {
        System.out.println("Static void run");
    }


}

class TestCase2{

    static int basicONE = 1;
    
    // 1) выполняются static инициализации
    static {
        System.out.println("Static initialization 1");
        
        basicONE = 2;
        System.out.println("now basicONE = " + basicONE);
    }

    static {
        System.out.println("Static initialization 2");

        basicONE = 7;
        System.out.println("now basicONE = " + basicONE);
    }


    public static void run() {
        System.out.println("Static void run");

        System.out.println("now basicONE = " + basicONE);
    }


}

class TestCase3{

    static int basicValue = 1;

    // 1) выполняются static инициализации
    static {
        System.out.println("Static initialization 1");

        setBasicValue(7);
        printBasicValue();
    }

    static {
        System.out.println("Static initialization 2");

        setBasicValue(9);
        printBasicValue();
    }


    public static void run() {
        System.out.println("Static void run");
        printBasicValue();
    }

    private static void setBasicValue(int value) {
        basicValue = value;
        System.out.println("Static void set basicValue = "+ value);
    }

    private static void printBasicValue() {
        System.out.println("now basicValue = " + basicValue);
    }


}

class TestCase4{

    private static List<String> messageList = new LinkedList<>();
    
    private static int basicValue = 1;

    // 1) выполняются static инициализации
    static {
        messageList.add("Static initialization 1");

        setBasicValue(7);
        printBasicValue();
    }

    static {
        messageList.add("Static initialization 2");

        setBasicValue(9);
        printBasicValue();
    }


    public static void run() {
        messageList.add("Static void run");
        printBasicValue();
    }

    private static void setBasicValue(int value) {
        basicValue = value;
        messageList.add("Static void set basicValue = "+ value);
    }

    private static void printBasicValue() {
        messageList.add("Now basicValue = " + basicValue);
    }

    public static List<String> getMessageList() {
        return messageList;
    }
}