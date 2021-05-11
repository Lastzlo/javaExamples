package org.example.constructions;

import org.junit.jupiter.api.Test;

public class InitializeVariableTest {
    @Test
    public void typesOfVariableDeclaration() {
        int a;
        a = 25;

        System.out.println("a = " + a);

        int b = 25;

        System.out.println("b = " + b);

        int c, d;
        c = 25;
        d = 75;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int c1, d1 = 25;

        //System.out.println("c1 = " + c1);   //java: variable c1 might not have been initialized
        System.out.println("d1 = " + d1);

        int c2 = 3, d2;

        System.out.println("c2 = " + c2);
        //System.out.println("d2 = " + d2);   //java: variable d2 might not have been initialized

        int c3 = 25, d3 = 75;

        System.out.println("c3 = " + c3);
        System.out.println("d3 = " + d3);

    }

    @Test
    public void namesOfVariable() {
        int abc_abc = 25;
        int abc_ABC = 45;

        System.out.println("abc_ABC = " + abc_ABC);
        System.out.println("abc_abc = " + abc_abc);
    }
}
