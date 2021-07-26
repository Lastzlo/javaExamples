package org.example.oop.innerClasses.tasks.task2_staticInner;

import org.junit.jupiter.api.Test;

public class Example {
    @Test
    void whenCreateParent() {
        Parent p = new Parent();

        System.out.println(p.method()); // 10
        System.out.println(((Parent) p).method());  // 10
        //System.out.println(((Child) p).method());   // ClassCastException
    }

    @Test
    void whenCreateParentButSetChild() {
        Parent p = new Child();

        System.out.println(p.method()); // 20
        System.out.println(((Parent) p).method());  // 20
        System.out.println(((Child) p).method());   // 20
    }

    @Test
    void whenCreateChild() {
        Child p = new Child();

        System.out.println(p.method()); // 20
        System.out.println(((Parent) p).method());  // 20
        System.out.println(((Child) p).method());   // 20
    }

    public static void main(String[] args) {
        //Parent p = new Example().new Child1();    //Qualified new of static class
        Parent p = new Child1();
        //or
        Example example = new Example();
//        Example.Child1 child1 = Example.new Child1();   // Expression expected, Cannot resolve symbol 'Child1'
        //Example.Child1 child1 = example.new Child1(); // error
        Example.Child1 child1 = new Example.Child1();   // correct
        Example.Child1 child1_2 = new Child1(); // so so

        System.out.println(p.method()); // 30
        System.out.println(((Parent) p).method());  // 30
        System.out.println(((Child) p).method());   // 30
    }

    static class Parent {
        int method() {
            return 10;
        }
    }

    static class Child extends Parent {
        int method() {
            return 20;
        }
    }
    static class Child1 extends Child {
        int method() {
            return 30;
        }
    }
}
