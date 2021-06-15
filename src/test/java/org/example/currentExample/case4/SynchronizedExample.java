package org.example.currentExample.case4;

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
        account.badTransactions(withdrawMoney);
    }
}

class MyThread2 implements Runnable{
    private Account account;
    private int withdrawMoney;

    public MyThread2(Account account, int withdrawMoney) {
        this.account = account;
        this.withdrawMoney = withdrawMoney;
    }

    @Override
    public void run() {
        //синхронизирует выполнение по объекту
        //так что каждый поток будет по очереди получать доступ
        synchronized (account) {
            account.badTransactions(withdrawMoney);
        }
    }
}

class MyThread3 implements Runnable{
    private Account account;
    private int withdrawMoney;

    public MyThread3(Account account, int withdrawMoney) {
        this.account = account;
        this.withdrawMoney = withdrawMoney;
    }

    @Override
    public void run() {

        //вызываем синхронизированный метод внутри объекта
        account.goodTransactions(withdrawMoney);
    }
}

public class SynchronizedExample {
    @Test
    void run_example_whenWithoutSynchronized() {

        Account account = new Account(3000);
        final int startedBalance = account.getMoney();


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
        } catch (InterruptedException e){}


        final int finishedBalance = account.getMoney();
        System.out.println("startedBalance = " + startedBalance);
        System.out.println("finishedBalance = " + finishedBalance);

        //хороший результат это если сума на счете не изменилась
        //но так как не синхронизовано
        Assertions.assertNotEquals(startedBalance, finishedBalance);


    }

    @Test
    void run_example_whenWithSynchronized_type1() {

        Account account = new Account(3000);
        final int startedBalance = account.getMoney();

        //для синхронизации мы модифицировали поток
        Thread t1 = new Thread(new MyThread2(account, 200));
        Thread t2 = new Thread(new MyThread2(account, 50));
        Thread t3 = new Thread(new MyThread2(account, 300));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e){}


        final int finishedBalance = account.getMoney();
        System.out.println("startedBalance = " + startedBalance);
        System.out.println("finishedBalance = " + finishedBalance);

        //хороший результат это если сума на счете не изменилась
        //так мы синхронизовали
        Assertions.assertEquals(startedBalance, finishedBalance);
    }

    @Test
    void run_example_whenWithSynchronized_type2() {

        //добавили синхронизованный метод в объект
        Account account = new Account(3000);
        final int startedBalance = account.getMoney();

        //поток вызывает синхронизованный метод объекта
        Thread t1 = new Thread(new MyThread3(account, 200));
        Thread t2 = new Thread(new MyThread3(account, 50));
        Thread t3 = new Thread(new MyThread3(account, 300));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e){}


        final int finishedBalance = account.getMoney();
        System.out.println("startedBalance = " + startedBalance);
        System.out.println("finishedBalance = " + finishedBalance);

        //хороший результат это если сума на счете не изменилась
        //так мы синхронизовали
        Assertions.assertEquals(startedBalance, finishedBalance);
    }

}
