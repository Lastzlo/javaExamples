package org.example.java.util.tasks;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

class Car implements Comparable<Car> {
    private int id;
    private String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;

        return id == car.id && name.equals(car.name);
    }

    @Override
    public int compareTo(@NotNull Car o) {
        int compare1 = Integer.compare(id, o.id);
        if(compare1> 0) return compare1;
        return name.compareTo(o.name);
    }

    @Override
    public String toString(){
        return "car = { id = " + id + ", name = " + name + "}";
    }
}
