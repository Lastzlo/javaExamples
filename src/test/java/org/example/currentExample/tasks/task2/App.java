package org.example.currentExample.tasks.task2;

/**Task: What will be the output of the java program below?*/
// answer: 1 2 and no more
public class App {
    public static void main(String[] args) {
        System.out.println("1");
        synchronized (args) {
            System.out.println("2");
            try {
                //просто бесконечно ждет, потому что не кто не разбудит
//                args.wait();  /* Line 11*/

                //поставил таймер чтобы оно могло закончиться
                args.wait(10000);
            } catch (InterruptedException e) {

            }
        }

        System.out.println("3");
    }
}
