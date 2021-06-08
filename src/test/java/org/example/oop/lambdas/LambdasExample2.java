package org.example.oop.lambdas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;

public class LambdasExample2 {

    public int method_ThatUseMyInterface(int x, int y, MyInterface myInterface) {
        return myInterface.doIt(x, y);
    }

    public <T> T method_ThatUseBinaryOperator(T x, T y, BinaryOperator<T> binaryOperator) {
        return binaryOperator.apply(x, y);
    }

    @Test
    public void run_method_ThatUseMyInterface() {
        int x = 5;
        int y = 10;

        int result = method_ThatUseMyInterface(x, y, (x1 , y1) -> (x1 * y1));
        Assertions.assertEquals(50, result);

    }

    @Test
    public void run_method_ThatUseBinaryOperator() {
        int x = 5;
        int y = 10;

        int result = method_ThatUseBinaryOperator(x, y, (x1 , y1) -> (x1 * y1));
        Assertions.assertEquals(50, result);

    }

}





@FunctionalInterface
interface MyInterface {
    public int doIt(int x, int y);
}

//@FunctionalInterface
//interface MyInterface1 {
//    public void doIt();
//}
//
//@FunctionalInterface
//interface MyInterface2 {
//    //only one
//    void printIt(String text);
//
//    //can be any default methods
//    default public void printUtf8To(String text, OutputStream outputStream){
//        try {
//            outputStream.write(text.getBytes("UTF-8"));
//        } catch (IOException e) {
//            throw new RuntimeException("Error writing String as UTF-8 to OutputStream", e);
//        }
//    }
//
//    //can be any static methods
//    static void printItToSystemOut(String text){
//        System.out.println(text);
//    }
//}
