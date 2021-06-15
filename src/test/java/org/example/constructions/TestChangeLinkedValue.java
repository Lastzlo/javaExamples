package org.example.constructions;

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
    
    @Test
    void whenPrimitive_thenNotChange(){
        Container container = new Container(100, 200);
        
        int value = container.getIntValue();
        
        container.setIntValue(55);

        System.out.println("value = " + value);
        
    }

    @Test
    void whenBoxedClass_thenNotChange() {
        Container container = new Container(100, 200);

        Integer value = container.getIntegerValue();
        System.out.println("value = " + value);

        container.setIntegerValue(Integer.valueOf(500));
        System.out.println("value = " + value);


    }

    @Test
    void whenClassToClass_thenChange() {
        Container container = new Container(100, 200);

        Container value = container;
        System.out.println("value.getIntValue() = " + value.getIntValue());

        container.setIntValue(500);
        System.out.println("value.getIntValue() = " + value.getIntValue());
    }
}
