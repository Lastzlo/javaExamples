package org.example.oop.generic.tasks;

public class task2 {
}

class D<T> {
    T[] values;
    int[] ints;

    public D() {
        //нельзя
        //  values = new T[5];

        ints = new int[5];
    }

    public D(T[] values) {
        //можно
        this.values = values;
    }
}
