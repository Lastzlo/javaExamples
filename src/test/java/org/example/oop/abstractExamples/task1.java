package org.example.oop.abstractExamples;

import org.junit.jupiter.api.Test;

public class task1 {
    @Test
    public void whatResult() {
        Animal cat = new Cat();
        Animal dog = new Dog();
        //result:
        //Animal
        //Cat
        //Dog
    }
}

abstract class Animal {
    static {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    static {
        System.out.println("Cat");
    }
}

class Dog extends Animal {
    static {
        System.out.println("Dog");
    }
}
