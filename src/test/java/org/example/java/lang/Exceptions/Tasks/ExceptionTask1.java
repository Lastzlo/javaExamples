package org.example.java.lang.Exceptions.Tasks;

import org.junit.jupiter.api.Test;

/**What is the result of the following code?*/
public class ExceptionTask1 {
    private String str = "a";   //a     //1

    void a() {
        try {
            str += "b";     //b     //2
            b();
        } catch (Exception e) {
            str += "c";     //c     //5
        }
    }
    void b() throws Exception {
        try {
            str += "d";     //d     //3
            c();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            str += "e";     //e     //4
        }
        str += "f";
    }
    void c() throws Exception {
        throw new Exception();
    }
    void display() {
        System.out.println("str = " + str);
    }

    @Test
    public void test() {
        ExceptionTask1 task1 = new ExceptionTask1();
        task1.a();
        task1.display();
    }
}
