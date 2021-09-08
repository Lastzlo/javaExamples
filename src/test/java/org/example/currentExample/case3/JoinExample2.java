package org.example.currentExample.case3;


import org.junit.jupiter.api.Test;

class MyThread2 implements Runnable {
    String name;
    Thread thread;
    MyThread2(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("Новий потік: " + thread);
        thread.start();
    }
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " перерваний");
        }
        System.out.println(name + " завершений");
    }
}
public class JoinExample2 {

    //изменение порядка join не повлияло на результат
    @Test
    void join_example_when_Ob3_Ob2_Ob1() {
        MyThread2 ob1 = new MyThread2("Перший");
        MyThread2 ob2 = new MyThread2("Другий");
        MyThread2 ob3 = new MyThread2("Третій");
        System.out.println(ob1.thread.getName() +
                "потік запущений:" + ob1.thread.isAlive());
        System.out.println(ob2.thread.getName() +
                "потік запущений:" + ob2.thread.isAlive());
        System.out.println(ob3.thread.getName() +
                "потік запущений:" + ob3.thread.isAlive());
        try {
            System.out.println("Очікування завершення потоків");

            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Головний потік перерваний");
            System.out.println(ob1.thread.getName() +
                    "потік запущений:" + ob1.thread.isAlive());
            System.out.println(ob2.thread.getName() +
                    "потік запущений:" + ob2.thread.isAlive());
            System.out.println(ob3.thread.getName() +
                    "потік запущений:" + ob3.thread.isAlive());
        }

        System.out.println("Головний потік завершений");
    }
}
