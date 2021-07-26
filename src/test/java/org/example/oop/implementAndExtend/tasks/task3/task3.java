package org.example.oop.implementAndExtend.tasks.task3;

//private -> default " " -> protected -> public

import org.junit.jupiter.api.Test;

public class task3 {
    @Test
    void whatWillBeTheResult() {
        A a = new B();
        //a.m1()    //не можем потому что она private
        a.m2();
            //A_m2
            //A_m1
    }

    @Test
    void whatWillBeTheResult2() {
        B b = new B();
        b.m1();
            //B_m1
        b.m2();
            //A_m2
            //A_m1
    }
}

class A {
    private void m1() {
        System.out.println("A_m1");
    }

    public void m2() {
        System.out.println("A_m2");
        m1();
    }
}

class B extends A{
    public void m1() {
        System.out.println("B_m1");
    }
}