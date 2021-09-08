package org.example.oop.generic.genericWildcards.task1;

import org.junit.jupiter.api.Test;

import java.util.Collection;

public class MyObjectStoreTest {

    @Test
    public void create() {
        MyObjectStore<Long, Car> carsStore = new VehicleStoreImpl<Long, Car>();

        carsStore.put(20334L, new Car("BMW", "X5", 2013));

        Car c = carsStore.get(222L);
    }

    @Test
    public void create_andUsePredicate() {
        MyObjectStore<Long, Car> carsStore = new VehicleStoreImpl<Long, Car>();

        carsStore.put(20334L, new Car("BMW", "X5", 2013));

        Car c = carsStore.get(222L);

        Collection<Car> cars = carsStore.getAll(new Predicate<Car>() {
            @Override public boolean apply(Car exp) {
                // Здесь наша логика по выбору автомобиля.
                return false;
            }
        });
    }

}