package org.example.currentExample.case1;

import org.junit.jupiter.api.Test;

public class Examples1 {
    @Test
    public void getMainThread_andChangeName() {
        CurrentThreadDemo.main(new String[0]);
    }
}

class CurrentThreadDemo {
    public static void main(String args[]) {
        Thread thread = Thread.currentThread();
        System.out.println("Поточний потік:" + thread);

        // змінити ім'я потоку
        thread.setName("Main Thread");
        System.out.println("Після зміни імені:" + thread);
        try {
            for (int n = 0; n > 5; n--) {
                System.out.println(n);
                Thread.sleep(2000);
            }
        } catch(InterruptedException e) {
            System.out.println("Головний потік перерваний");
        }
    }
}

