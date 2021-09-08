package org.example.java.util.tasks.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListExamples {
    @Test
    void getNumOfFirstValue() {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        Integer integer = list.get(0);
        assertEquals(12, integer);
    }

    @Test
    void listAddValue() {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(24);

        list.add(1, 33);
        assertEquals(12, list.get(0));
        assertEquals(33, list.get(1));
        assertEquals(24, list.get(2));
    }

    @Test
    void listSetValue() {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(24);

        assertEquals(24, list.get(1));

        list.set(1, 33);

        assertEquals(33, list.get(1));
    }

    @Test
    void sortDoublesUseStream() {
        List<Double> list = new ArrayList<>();
        list.add(12d);
        list.add(6d);
        list.add(2d);
        List<Double> doubleList = list.stream().sorted().collect(Collectors.toList());
        doubleList.forEach(System.out::println);
    }

    @Test
    void sortDoublesUseCollections() {
        List<Double> list = new ArrayList<>();
        list.add(12d);
        list.add(6d);
        list.add(2d);
        list.sort(Double::compareTo);
        list.forEach(System.out::println);
    }

    @Test
    void naturalSortNotPrimitiveObjects() {
        Car car1 = new Car(77, "Bbb");
        Car car2 = new Car(77, "CCC");
        Car car3 = new Car(11, "AAA");
        Car car4 = new Car(77, "A");

        List<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4));

        //cars.sort(Comparator.naturalOrder());
        cars.sort((o1, o2) -> o1.compareTo(o2));

        cars.forEach(System.out::println);

    }
}
