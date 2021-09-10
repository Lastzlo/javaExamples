package org.example.java.util.tasks.collections.Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class ImplQueueTest {

    //3) Вам нужно реализовать систему обработки заказов товаров в магазине.
    //Ваш шеф уверен, что справедливо будет отпускать товар в первую очередь тем, кто ждет дольше.
    //Что вы будете использовать?

    @Test
    void priorityQueue() {

        Queue<Integer> integers = new PriorityQueue<>();

        integers.offer(10);
        integers.offer(11);
        integers.offer(12);
        integers.offer(13);
        integers.offer(1);
        integers.offer(5);
        integers.offer(6);

        for (int i = 0; i < 7; i++) {
            System.out.println("integers.poll() = " + integers.poll());
        }

//
//        System.out.println("integers.peek() = " + integers.peek());
//        Assertions.assertEquals(10, integers.poll());

    }

    @Test
    void linkedBlockingQueue() {

        Queue<Integer> integers = new PriorityQueue<>();

        integers.offer(10);
        integers.offer(11);
        integers.offer(12);
        integers.offer(13);
        integers.offer(1);
        integers.offer(5);
        integers.offer(6);

        for (int i = 0; i < 7; i++) {
            System.out.println("integers.poll() = " + integers.poll());
        }


        System.out.println("integers.peek() = " + integers.peek());
        Assertions.assertEquals(10, integers.poll());

    }

}
