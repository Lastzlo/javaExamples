package org.example.java.util.tasks.collections;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    @Test
    void addNullValue() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(1, 3);
        map.put(1, null);
        map.put(null, 3);
        System.out.println("map = " + map);
    }
}
