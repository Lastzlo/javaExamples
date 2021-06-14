package tasks.task6;

import org.junit.jupiter.api.Test;

public class Parent {
    protected String str = "per";
}

class Child extends Parent {
    String str = "chii";

    @Test
    void whatResult() {
        Parent parent = new Child();
        //parent.x;
       // String word = new String(str, str);
        //methods


        System.out.println("parent.str = " + parent.str);   //parent ???
    }
}
