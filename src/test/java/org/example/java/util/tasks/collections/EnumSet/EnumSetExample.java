package org.example.java.util.tasks.collections.EnumSet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetExample {
    @Test
    void testEnumSetExa () {

        EnumSet<Direction> directionEnumSet = EnumSet.noneOf(Direction.class);

        boolean add = directionEnumSet.add(Direction.LEFT);
        System.out.println("add = " + add);
        
        add = directionEnumSet.add(Direction.LEFT);
        System.out.println("add = " + add);

    }
}

enum Direction {
    LEFT,
    RIGHT,
    UP,
    DOWN
}
