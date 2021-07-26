package org.example.oop.innerClasses.tasks.task3;

import org.junit.jupiter.api.Test;

public class InnerClassInMethod {
    @Test
    void whenClassInMethod() {
        final int wight = 200;

        class Local {
            int multiply(int number) {
                return wight * number;
            }

        }

        int result = new Local().multiply(200);
        System.out.println("result = " + result);
    }

    @Test
    void whenClassInMethod_butVariableNotFinal() {
        int wight = 200;

        int finalWight = wight; //effectively final


        class Local {
//            int multiply(int number) {
//                return wight * number;  // Variable 'wight' is accessed from within inner class, needs to be final or effectively final
//            }

            int multiply(int number) {
                return finalWight * number;
            }

        }

        wight = 3;
        int result = new Local().multiply(100);
        System.out.println("result = " + result);
    }
}
