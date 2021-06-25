package org.example.oop.implementAndExtend.tasks.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class A {
    int i = 0;

    public int increment() {
        return ++i;
    }
}

class B extends A {
    int i = 10;

    public int increment() {
        return ++i;
    }
}

public class Task1 {
    @Test
    public void test1() {
        A a = (A) new B();

        Assertions.assertEquals(11, a.increment());
    }

    @Test
    public void test2() {
        B b = new B();

        Assertions.assertEquals(11, ((A) b).increment());   //все равно 11
    }

}

