package org.example.currentExample.case6;

import org.junit.jupiter.api.Test;

public class WaitNotifyTest {
    @Test
    public void run_example(){
        final Customer c = new Customer(10000);

        //пытается снять сумму которой еще нет
        new Thread(() -> c.withdraw(25000)).start();

        //пополняет баланс на 10000
        new Thread(() -> c.deposit(10000)).start();
        new Thread(() -> c.deposit(10000)).start();
    }
}

class Customer{
    private int amount;

    public Customer(int amount) {
        this.amount = amount;
    }

    public synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");

        try{
            while(this.amount < amount) {
                System.out.println("Less balance; waiting for deposit...");
                wait();
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        this.amount -= amount;

        System.out.println("withdraw completed...");
    }

    public synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount += amount;

        System.out.println("deposit completed... ");
        notify();   //будет один поток который был в состоянии WAITING
    }
}


