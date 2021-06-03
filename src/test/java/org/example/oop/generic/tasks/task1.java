package org.example.oop.generic.tasks;

import org.junit.jupiter.api.Test;

//Suppose we have the next generic class:
class Wrapper<T extends Number> {
    private T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class task1 {

    @Test
    public void getValue() {
        Wrapper<Number> number = new Wrapper<>(123);
        System.out.println("number.getValue() = " + number.getValue());

        //Работает потому что примитив превращается в Double, а Double наследует Number
        Wrapper<Number> number2 = new Wrapper<>(123.2);
        System.out.println("number2.getValue() = " + number2.getValue());

        /*java: incompatible types: cannot infer type arguments for org.example.oop.generic.tasks.Wrapper<>
            reason: inference variable T has incompatible bounds
                equality constraints: java.lang.Double
                lower bounds: java.lang.Float*/
// Примитив превращается в Float, но Float не наследует Double
//        Wrapper<Double> doubleWrapper = new Wrapper<>(33.3f);
//        System.out.println("doubleWrapper.getValue() = " + doubleWrapper.getValue());

        Wrapper<Double> doubleWrapper = new Wrapper<>(33.3);
        System.out.println("doubleWrapper.getValue() = " + doubleWrapper.getValue());


        Wrapper<Integer> integerWrapper = new Wrapper<>(123);
        System.out.println("integerWrapper.getValue() = " + integerWrapper.getValue());

        /*java: incompatible types: cannot infer type arguments for org.example.oop.generic.tasks.Wrapper<>
    reason: inference variable T has incompatible bounds
      equality constraints: java.lang.Integer
      lower bounds: java.lang.Long*/
// Примитив превращается в Long, но Long не наследует Integer
//        Wrapper<Integer> integerWrapper2 = new Wrapper<>(123L);
//        System.out.println("integerWrapper.getValue() = " + integerWrapper2.getValue());

    }

    @Test
    public void autoCast() {
        int intVar = 120;

        double doubleVar = intVar;

        Integer integerInBox = intVar;
        Double doubleInBox = doubleVar;

        //ответ
        //doubleInBox = integerInBox;




    }

    @Test
    public void notAutoCast() {
        double doubleVar = 120;

        int intVar = (int) doubleVar;

    }
}
