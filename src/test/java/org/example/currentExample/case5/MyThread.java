package org.example.currentExample.case5;

public class MyThread implements Runnable{
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
