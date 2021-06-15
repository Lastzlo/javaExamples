package org.example.currentExample.case5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private Lock accountLock = new ReentrantLock();
    private int money;

    public Account(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    //используем ReentrantLock для синхронизации
    public void goodTransactions(int withdraw) {

        accountLock.lock();
        try {
            for (int i = 0; i < 50000; i++) {

                //minus money
                money = money - withdraw;
                //plus money
                money = money + withdraw;

            }
        } finally {
            //обязательно нужно разблокировать чтобы седейшие потоки имели доступ
            accountLock.unlock();
        }


        System.out.println("Good transaction complete");
    }
}
