package org.example.oop.generic.genericWildcards.case5;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
    public static void process(List<? extends Pet> list) {
        for (Pet elem : list) {
            // ...
        }
    }

    public static <U extends Pet> void process2(List<U> list) {
        for (Pet elem : list) {
            // ...
        }
    }
}

class Animal {
    void feed() {
        System.out.println("животное кушает");
    } }
class Pet extends Animal {
    void call() {
        System.out.println("позвать питомца");
    } }
class Kitty extends Pet{
    void mew() {} }
class Doge extends Pet{
    void bark() {} }

class TestCase {
    @Test
    public void run() {
        List<Pet> src = new ArrayList<>();
        src.add(new Kitty());
        src.add(new Kitty());
        src.add(new Kitty());

        List<Pet> dest = new ArrayList<Pet>();

        dest.add(new Doge());
        dest.add(new Doge());
        dest.add(new Doge());

        Collections.copy(dest, src);

        for (Pet pet : dest) {
            pet.feed();
            pet.call();
        }


    }
}