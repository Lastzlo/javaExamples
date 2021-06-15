package org.example.currentExample.case3;

import org.junit.jupiter.api.Test;

class MyThread3 implements Runnable {
    String name;
    Thread thread;

    Thread threadThatNeedJoin;

    //конструктор для того випадку коли потрібно чекати інший тред
    MyThread3(String name, Thread threadThatNeedJoin) {
        this.threadThatNeedJoin = threadThatNeedJoin;

        this.name = name;
        thread = new Thread(this, name);
        System.out.println("Новий потік: " + thread);
        thread.start();
    }

    MyThread3(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("Новий потік: " + thread);
        thread.start();
    }
    public void run() {
        System.out.println("Потік Thread: " + thread.getName() + " почав виконуватись");

        //якщо є тред який потрібно чекати то
        if(threadThatNeedJoin != null) {
            try {
                System.out.println("Потік Thread: " + thread.getName() + " чекає завешення Thread: " + threadThatNeedJoin.getName());
                threadThatNeedJoin.join();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException in Thread: " + thread.getName() + " when JOIN Thread: " + threadThatNeedJoin.getName());
            }
        }

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " перерваний");
        }
        System.out.println(name + " завершений");
    }
}

public class JoinExample3 {

    //Завдання: неваждило в якому порядку викликані 3 потоки, 3 потік повинен чекати поки виконається 2гий, 2гий поки 1ший
    @Test
    void join_example_when_Ob1_Ob2_Ob3() {
        MyThread3 ob1 = new MyThread3("Перший");    //перший нікого не чекає
        MyThread3 ob2 = new MyThread3("Другий", ob1.thread);    //другий чекає виконання першого
        MyThread3 ob3 = new MyThread3("Третій", ob2.thread);    //третій чекає виконання другого
        System.out.println(ob1.thread.getName() +
                "потік запущений:" + ob1.thread.isAlive());
        System.out.println(ob2.thread.getName() +
                "потік запущений:" + ob2.thread.isAlive());
        System.out.println(ob3.thread.getName() +
                "потік запущений:" + ob3.thread.isAlive());
        try {
            System.out.println("Очікування завершення потоків");

            //Ob1_Ob2_Ob3
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
