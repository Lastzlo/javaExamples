package org.example.oop.generic.genericClasses1.case1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BoxTest {

    @Test
    void create_set_get_withType() {
        Box<Integer> box = new Box<>();

        box.setT(1);

        Assertions.assertInstanceOf(Integer.class, box.getT());
        Assertions.assertEquals(1, box.getT());

    }

    @Test
    void create_set_get_withoutType() {
        Box box = new Box<>();

        box.setT(1);

        Assertions.assertInstanceOf(Integer.class, box.getT());
        Assertions.assertEquals(1, box.getT());

    }


    @Test
    void create_set_get_withoutType2_withoutDiamond() {
        Box box = new Box();

        box.setT(1);

        Assertions.assertInstanceOf(Integer.class, box.getT());
        Assertions.assertEquals(1, box.getT());

    }

    @Test
    void getT_whenBoxWithoutType_setValues() {
        Box box = new Box();    //so when we dont present Type, the type will be Object

        System.out.println("When set int");
        box.setT(1);
        Object boxT = box.getT();

        if(boxT instanceof String) {
            System.out.println("Its String");
        }
        if(boxT instanceof Integer) {
            System.out.println("Its Integer");
        }
        if(boxT instanceof Object) {
            System.out.println("Its Object");
        }

        System.out.println("When set String");
        box.setT("Hello");
        boxT = box.getT();

        if(boxT instanceof String) {
            System.out.println("Its String");
        }
        if(boxT instanceof Integer) {
            System.out.println("Its Integer");
        }
        if(boxT instanceof Object) {
            System.out.println("Its Object");
        }

        Assertions.assertInstanceOf(String.class, boxT);
        Assertions.assertEquals("Hello", boxT);
        Assertions.assertInstanceOf(Object.class, boxT);
    }

}