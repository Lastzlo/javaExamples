package org.example.oop.classesAndObjects.taks;

import org.junit.jupiter.api.Test;

public class Child extends Parent {
    private int x;
    private int y;

    public Child(int x, int y) {
        super(x);
        this.x = x;
        this.y = y;
    }


//    @Test
//    void whatResult() {
//        Parent parent = new Parent(23);
////        parent.x;
//    }
}
