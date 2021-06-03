package org.example.oop.generic.genericWildcards.case4;

import java.util.List;

public class Utils {
    //upperBoundedWildcards
    public static void process(List<? extends Foo> list) {
        for (Foo elem : list) {
            // ...
        }
    }

    public static <U extends Foo> void process2(List<U> list) {
        for (Foo elem : list) {
            // ...
        }
    }


    //нельзя потому что уже есть метод с подобными параметрами
    /*public static <U> void process2(List<? super U> list) {

    }*/

    public static <U> void process3(List<? super U> list) {

    }

}
class Foo {}
