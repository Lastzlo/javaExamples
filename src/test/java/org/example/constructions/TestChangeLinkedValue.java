package org.example.constructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Container {
    private int intValue;
    private Integer integerValue;

    public Container(int intValue, Integer integerValue) {
        this.intValue = intValue;
        this.integerValue = integerValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }
}

public class TestChangeLinkedValue {

    //не змінюється тому що значення є прімітивом
    @Test
    void whenPrimitive_thenNotChange(){
        Container container = new Container(100, 200);
        
        final int value = container.getIntValue();
        
        container.setIntValue(55);

        System.out.println("value = " + value);
        
    }

    //не змінюється тому що значення є immutable
    @Test
    void whenBoxedClass_thenNotChange() {
        Container container = new Container(100, 200);

        final Integer value = container.getIntegerValue();
        System.out.println("value = " + value);

        container.setIntegerValue(300);
        System.out.println("value = " + value);
        Assertions.assertEquals(200, value);

        container.setIntegerValue(Integer.valueOf(400));
        System.out.println("value = " + value);
        Assertions.assertEquals(200, value);

        container.setIntegerValue(new Integer(500));
        System.out.println("value = " + value);
        Assertions.assertEquals(200, value);


    }

    //не змінюється посилання, але змінюється значення внутрішньої змінної
    @Test
    void whenClassToClass_thenChange() {
        Container container = new Container(100, 200);

        final Container value = container;
        System.out.println("value.getIntValue() = " + value.getIntValue());

        container.setIntValue(500);
        System.out.println("value.getIntValue() = " + value.getIntValue());
    }
}
