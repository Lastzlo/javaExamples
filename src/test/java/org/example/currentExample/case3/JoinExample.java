package org.example.currentExample.case3;


import org.junit.jupiter.api.Test;

class MyThread implements Runnable {
    String name = Thread.currentThread().getName(); //main

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(this.name + " перерваний");
        }
        System.out.println(this.name + " завершений");
    }

}

public class JoinExample {
    @Test
    void join_example() {
        Thread thread1 = new Thread(new MyThread(), "thread1");
        Thread thread2 = new Thread(new MyThread(), "thread2");
        Thread thread3 = new Thread(new MyThread(), "thread3");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.getName();
        thread2.isAlive();

        System.out.printf("thread1.getName() = %s, thread1.isAlive() = %s \n", thread1.getName(),  thread1.isAlive());
        System.out.printf("thread1.getName() = %s, thread1.isAlive() = %s \n", thread2.getName(),  thread2.isAlive());
        System.out.printf("thread1.getName() = %s, thread1.isAlive() = %s \n", thread3.getName(),  thread3.isAlive());

        try {
            System.out.println("Очікування завершення потоків");
            thread1.join();
            thread2.join();
            thread3.join();

            System.out.printf("thread1.getName() = %s, thread1.isAlive() = %s \n", thread1.getName(),  thread1.isAlive());
            System.out.printf("thread1.getName() = %s, thread1.isAlive() = %s \n", thread2.getName(),  thread2.isAlive());
            System.out.printf("thread1.getName() = %s, thread1.isAlive() = %s \n", thread3.getName(),  thread3.isAlive());
        } catch (InterruptedException e) {

        }

    }
}
