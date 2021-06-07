package org.example.generic.Tasks;

public class Constructions {
}

class A<T> {

    //'org.example.generic.Tasks.A.this' cannot be referenced from a static context
    //static T value;

    T[] array;
    T value;

    public A(T value){
        //Type parameter 'T' cannot be instantiated directly
        //value = new T();

        //Type parameter 'T' cannot be instantiated directly
        //array = new T[5];

        this.value = value;
    }

}
