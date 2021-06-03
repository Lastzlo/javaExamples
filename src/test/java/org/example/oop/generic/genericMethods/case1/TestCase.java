package org.example.oop.generic.genericMethods.case1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCase {
    @Test
    public void runUtil() {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);
    }

    @Test
    public void runUtilWithoutGenerics() {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");

        boolean compare = Util.<Integer, String>compare(p1, p2);
        boolean compareWithoutGenerics = Util.compare(p1, p2);

        Assertions.assertEquals(compare, compareWithoutGenerics);


    }
}
