package org.example.java.util.tasks.collections;

import org.jetbrains.annotations.NotNull;

public class Car implements Comparable<Car> {
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
