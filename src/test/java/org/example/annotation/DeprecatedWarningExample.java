package org.example.annotation;

import org.junit.jupiter.api.Test;

public class DeprecatedWarningExample {

    @Test
    void runDeprecatedMethod() {
        new ClassWithDeprecatedMethod().print(120);
    }

    @Test
    // If we comment below annotation, program generates
    // warning
    @SuppressWarnings("deprecation")
    void runDeprecatedMethod_withAnnotation() {
        new ClassWithDeprecatedMethod().print(120);
    }

}

class ClassWithDeprecatedMethod {

    public void print(String s){
        System.out.println("s = " + s);
    }

    @Deprecated
    public void print(Integer i){
        System.out.println("i = " + i);
    }

}
