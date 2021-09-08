package org.example.currentExample.case2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestThread2 extends Thread {

    @Override
    public void run () {

        int i = 0;
        // в данном случае потом может остановиться только если вызовут interrupt
        // во время Thread.sleep (1000); -> InterruptedException
        //
        // либо во время проверки while ( ! Thread.currentThread().isInterrupted())
        while ( ! Thread.currentThread().isInterrupted()) {
            System.out.println ("Some text #" + i);
            i++;

            try {
                Thread.sleep (100);
            } catch (InterruptedException e) {
                System.out.println ("Child thread InterruptedException");
                //не обязательно использовать ведь мы выйдем
                // в результат ближайшей проверки  while()
                return;
            }
        }
    }

}

public class interruptExample2 {

    //пример с использованием thread.interrupt()
    @Test
    void runTestThread_then_interrupt() {

        TestThread2 thread = new TestThread2();
        thread.start ();

        try {
            Thread.sleep (500);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        //просто проверяет состояние
        boolean interrupted = thread.isInterrupted();
        System.out.println("interrupted = " + interrupted);
        Assertions.assertFalse(interrupted, "It should be False");

        // Метод interrupt() посилає потоку запит на переривання
        thread.interrupt ();

        interrupted = thread.isInterrupted();
        System.out.println("interrupted = " + interrupted);
        Assertions.assertTrue(interrupted, "It should be True");


        System.out.println ("Main text");
    }

    //пример с использованием thread.interrupted()
    @Test
    void runTestThread_then_interrupted() {

        TestThread2 thread = new TestThread2();
        thread.start ();

        try {
            Thread.sleep (500);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        //просто проверяет состояние
        boolean interrupted = thread.isInterrupted();
        System.out.println("interrupted = " + interrupted);
        Assertions.assertFalse(interrupted, "It should be False");

        //Статичний метод interrupted() перевіряє, чи був перерваний поточний
        //потік. Його виклик має певний побічний ефект, що проявляється у встановленні
        //стану переривання поточного потоку в логічне значення false
        boolean interrupted2 = thread.interrupted();
        System.out.println("interrupted2 = " + interrupted2);
        Assertions.assertFalse(interrupted2, "It should be False");

        interrupted = thread.isInterrupted();
        System.out.println("interrupted = " + interrupted);
        Assertions.assertFalse(interrupted, "It should be False");

        System.out.println ("Main text");
    }






}



