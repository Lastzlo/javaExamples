package org.example.currentExample.case4;

public class Account {
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

    public void badTransactions(int withdraw) {

        for (int i = 0; i < 50000; i++) {

            //minus money
            money = money - withdraw;
            //plus money
            money = money + withdraw;

        }

        System.out.println("Bad transaction complete");
    }

    //синхронизированный метод
    //потоки будут получать доступ по очереди
    synchronized public void goodTransactions(int withdraw) {

        for (int i = 0; i < 50000; i++) {

            //minus money
            money = money - withdraw;
            //plus money
            money = money + withdraw;

        }

        System.out.println("Good transaction complete");
    }
}
