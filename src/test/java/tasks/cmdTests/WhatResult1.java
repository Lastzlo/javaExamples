package tasks.cmdTests;

//what result if run:   java WhatResult1 Java 7""
//so args will be {"Java", "7\"\""}
public class WhatResult1 {
    public static void main(String[] args) {
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Array index out of range: 2
        System.out.println(args[2]);
    }
}
