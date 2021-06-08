package org.example.oop.classesAndObjects.initialization.tasks;


//result will be print three and two
public class whatResult1 {

    {
        System.out.println("one");
    }

    public static void main(String[] args) {
        System.out.println("two");
    }


    static {
        System.out.println("three");
    }


}
