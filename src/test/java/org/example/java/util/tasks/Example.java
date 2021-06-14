package org.example.java.util.tasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    @Test
    void sumOfValues() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        System.out.println("sum(list) = " + sum(list));
    }

    static int sum(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += ++i;
        }
        return sum;
    }

    @Test
    void removeValue() {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(6);
        list.add(2);

        list.remove(2); //index
        System.out.println("list = " + list);   //list = [12, 2, 2]
    }

    @Test
    void containsValue() {
        List<String> list = Arrays.asList("Str1", "Str2", "Str3", "Str4");
        List<String> list2 = Arrays.asList("Str2", "Str3");

        System.out.println("list.contains(list2) = " + list.contains(list2));   //true
    }

    @Test
    void addValue() {
        List<Integer> list = Arrays.asList(1, 5, 2, 7);
        System.out.println(count(list) + 1);
    }

    @Test
    void addValue_addByIndex() {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(7);
        list.add(1,3);  //вставило значение а не заменило

        System.out.println("list = " + list);
        System.out.println("sum_2(list) = " + sum_2(list));

        list.add(0, 25);
        System.out.println("list = " + list);
    }

    static int sum_2(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum = i;
        }
        return sum;
    }

    @Test
    void testSubLIst() {
        List<Integer> s1 = new ArrayList<>();
        //s1.removeAll();
        s1.add(5);
        s1.add(8);
        s1.add(1,2);
        List<Integer> s2 = new ArrayList<>(s1.subList(1,2)); //{2} от 1 до 2 не включая
        s2.addAll(s1); //{2,8,5,2,8}
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println("s1.get(0 = " + s1.get(0));
    }

    static int count(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            if (i >= 5) { ++sum;}
        }
        return sum;
    }
}
