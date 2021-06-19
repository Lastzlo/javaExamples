package org.example.currentExample.tasks.task3;

import org.junit.jupiter.api.Test;

public class Task1 {
    @Test
    void whatResult() {
        String str = "I lear Java";
        Runnable r = System.out::println;
        System.out.print("it's well");
        r.run();
    }
}
