package org.example.java.util.tasks.collections.Map;

import org.junit.jupiter.api.Assertions;
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


//    https://devcolibri.com/hashmap-%D0%B8-hashset-%D1%87%D1%82%D0%BE-%D1%8D%D1%82%D0%BE-%D0%BD%D0%B0-%D1%81%D0%B0%D0%BC%D0%BE%D0%BC-%D0%B4%D0%B5%D0%BB%D0%B5/
    @Test
    void createMapWithKeyCollisions() {
        Map<CollisionKey, String> map = new HashMap<>();

        CollisionKey key1 = new CollisionKey(9, 8);
        Assertions.assertEquals(key1.hashCode(), 17);
        CollisionKey key2 = new CollisionKey(10, 7);
        Assertions.assertEquals(key1.hashCode(), key2.hashCode());

        map.put(key1, "test1");
        map.put(key2, "test2");

        Assertions.assertEquals(map.get(key1), "test1");
        Assertions.assertEquals(map.get(key2), "test2");

    }

    @Test
    void createMapWithKeyCollisions2() {
        Map<CollisionKey2, String> map = new HashMap<>();

        CollisionKey2 key1 = new CollisionKey2(9, 8);
        Assertions.assertEquals(key1.hashCode(), 17);
        CollisionKey2 key2 = new CollisionKey2(10, 7);
        Assertions.assertEquals(key1, key2);

        map.put(key1, "test1");
        map.put(key2, "test2"); //произойдет перезапись

        Assertions.assertEquals(map.get(key1), "test2");
        Assertions.assertEquals(map.get(key2), "test2");

    }
}
