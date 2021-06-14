package org.example.oop.classesAndObjects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

interface HelloWorld {
    static String print() {
        return "interface HelloWorld";
    }

    public void greet();
    public void greetSomeone(String someone);
}

public class AnonymousClassExample {

    @Test
    public  void createAnonymousClass (){

        String test = "test";

        StringBuilder builder = new StringBuilder("text");

        HelloWorld helloWorld = new HelloWorld() {

            public int value;
            private int value2;

            /**An anonymous class can have static members provided that they are constant variables.*/
            static int staticValue;

            static {
                staticValue = 3;
            }

            public static String print() {
                return "AnonymousClass";
            }

            public static String printTest() {
                return "AnonymousClass";
            }

            @Override
            public void greet() {
                builder.append("text");

                System.out.println("test = " + test );

                print();
            }

            @Override
            public void greetSomeone(String someone) {

            }
        };

        Assertions.assertEquals("interface HelloWorld", HelloWorld.print());

    }
}
