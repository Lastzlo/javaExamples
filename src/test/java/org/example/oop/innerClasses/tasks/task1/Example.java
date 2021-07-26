package org.example.oop.innerClasses.tasks.task1;

import org.junit.jupiter.api.Test;

public class Example {
    @Test
    void whenCreateParent() {
        Parent p = new Example().new Parent();
        //or
        Example.Parent p2 = new Example().new Parent();

        System.out.println(p.method()); // 10
        System.out.println(((Parent) p).method());  // 10
        //System.out.println(((Child) p).method());   // ClassCastException
    }

    @Test
    void whenCreateParentButSetChild() {
        Parent p = new Example().new Child();
        //or
        Example.Parent p2 = new Example().new Child();

        System.out.println(p.method()); // 20
        System.out.println(((Parent) p).method());  // 20
        System.out.println(((Child) p).method());   // 20
    }

    @Test
    void whenCreateChild() {
        Child p = new Example().new Child();
        //or
        Example.Child p2 = new Example().new Child();

        System.out.println(p.method()); // 20
        System.out.println(((Parent) p).method());  // 20
        System.out.println(((Child) p).method());   // 20
    }

    public static void main(String[] args) {
        Parent p = new Example().new Child();

        System.out.println(p.method()); // 20
        System.out.println(((Parent) p).method());  // 20
        System.out.println(((Child) p).method());   // 20
    }

    class Parent {
        int method() {
            return 10;
        }
    }

    class Child extends Parent {
        int method() {
            return 20;
        }
    }
}
