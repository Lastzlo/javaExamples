package org.example.currentExample.case5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyThread implements Runnable{
    private Account account;
    private int withdrawMoney;

    public MyThread(Account account, int withdrawMoney) {
        this.account = account;
        this.withdrawMoney = withdrawMoney;
    }

    @Override
    public void run() {

        //вызываем синхронизированный метод внутри объекта
        account.goodTransactions(withdrawMoney);
    }
}

public class UseLockForSync {
    @Test
    void run_example_whenWithSynchronized_useReentrantLock() {

        //добавили синхронизованный метод в объект
        Account account = new Account(3000);
        final int startedBalance = account.getMoney();

        //поток вызывает синхронизованный метод объекта
        Thread t1 = new Thread(new MyThread(account, 200));
        Thread t2 = new Thread(new MyThread(account, 50));
        Thread t3 = new Thread(new MyThread(account, 300));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }


        final int finishedBalance = account.getMoney();
        System.out.println("startedBalance = " + startedBalance);
        System.out.println("finishedBalance = " + finishedBalance);

        //хороший результат это если сума на счете не изменилась
        //так мы синхронизовали
        Assertions.assertEquals(startedBalance, finishedBalance);
    }
}
