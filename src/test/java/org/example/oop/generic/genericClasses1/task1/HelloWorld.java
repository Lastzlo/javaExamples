package org.example.oop.generic.genericClasses1.task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    @Test
    public void whenAutoCastHelp() {
        List list = new ArrayList();    //List Objects
        list.add("Hello");
        String text = list.get(0) + ", world!"; //list.get(0) from Object cast to String
        System.out.print(text);
    }


    @Test
    public void whenDowncastHelp() {
        List list = new ArrayList();    //List Objects
        list.add("Hello");
        //String text = list.get(0); //list.get(0) is Object, error: incompatible types: Object cannot be converted to String

        String text = (String) list.get(0); //Solution is viewed cast to (String)
        System.out.print(text);
    }

}
