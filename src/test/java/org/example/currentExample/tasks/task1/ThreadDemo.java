package org.example.currentExample.tasks.task1;

public class ThreadDemo implements Runnable{

    String x, y;

    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();

        Thread obj1 = new Thread(t);
        Thread obj2 = new Thread(t);

        obj1.start();
        obj2.start();

    }

    //Внимание обязательно public потому что в Runnable public abstract void run();
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            //это тип Synchronized block, есть еще Synchronized method, static synchronization.
            synchronized (this) {
                x = "Hello";
                y = "Java";

                System.out.println(x + " " + y + " ");
            }
        }
    }
}
